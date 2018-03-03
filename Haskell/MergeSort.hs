module MergeSort where

{- 
-- Naive implementation
-}
merSort :: (Ord a) => [a] -> [a]
merSort [] = []
merSort [x] = [x]
merSort xs = merge (merSort a) (merSort b)
             where (a,b) = splitAt ((length xs) `div` 2) xs

merge :: (Ord a) => [a]->[a] -> [a]
merge [] b = b
merge a [] = a
merge a@(x:xs) b@(y:ys)
  | (x <= y) = x : (merge xs b)
  | otherwise = y : (merge ys a)


{-
  Some tests
-}  
t = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]
