module QuickSort where

{- 
-- Naive implementation
-}
quickSort :: (Ord a) => [a] -> [a]  
quickSort [] = []  
quickSort (x:xs) = let smSorted = quickSort [a | a <- xs, a <= x]  
                       bgSorted = quickSort [a | a <- xs, a > x]  
                    in smSorted ++ [x] ++ bgSorted

{-
  Some tests
-}
t = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]
