module HeapSort where
import PQueue  

{- 
-- Naive implementation
-}
mkPQ  :: (Ord a) => [a] -> PQueue a
mkPQ xs  = foldr enPQ emptyPQ xs
 
heapSort :: (Ord a) => [a] -> [a]
heapSort xs = hsort (mkPQ xs)
           where hsort pq 
                   | (pqEmpty pq) = []
                   | otherwise    = (frontPQ pq):(hsort (dePQ pq))


{-
  Some tests
-}  
t = [3, 21, 113, 109, 64, 84, 112, 85, 56, 9]
