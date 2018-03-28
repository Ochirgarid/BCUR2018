module SelectionSort where
import Data.List

{- 
-- Naive implementation
-}
selectionSort :: (Ord a) => [a] -> [a]
selectionSort [] = []
selectionSort xs = m : (selectionSort (delete m xs))
             where m = minimum xs

{-
  Some tests
-}  
t = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]


