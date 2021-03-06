module InsertionSort where

{- 
-- Naive implementation
-}
insertionSort :: (Ord a) => [a] -> [a]
insertionSort [] = []
insertionSort (x:xs) = insert x (insertionSort xs)

insert :: (Ord a) => a -> [a] -> [a]
insert x xs = takeWhile ((<=) x) xs ++ [x] ++ dropWhile ((<=) x) xs


{-
  Some tests
-}  
t = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]

