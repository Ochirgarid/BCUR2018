-- module HeapSort where

newtype PQueue a = PQ[a] deriving Show

emptyPQ :: PQueue a
pqEmpty :: PQueue a -> Bool
enPQ :: (Ord a) => a->PQueue a -> PQueue a
dePQ :: (Ord a) => PQueue a -> PQueue a
frontPQ :: (Ord a) => PQueue a -> PQueue a


-- emptyPQ = PQ []

-- pqEmpty (PQ []) = True
-- pqEmpty _ = False

-- enPQ x (PQ q) = PQ (insert x q)
--   where insert x [] = [x]
--         insert x r@(e:r') | x <= e = x : r
--                           | otherwise = e : insert x r'

-- dePQ (PQ []) = error "Empty"
-- dePQ (PQ (x:xs)) = PQ xs

-- frontPQ (PQ []) = error "Empty"
-- frontPQ (PQ (x:xs)) = x


{- 
-- Naive implementation
-}
-- makeHeap :: (Ord a) => [a] -> PQueue a
-- makeHeap xs = foldr enPQ emptyPQ xs

-- heapSort :: (Ord a) => [a] -> [a]
-- heapSort xs = hsort (makeHeap xs)
--   where hsort heap 
--         | pqEmpty heap = []
--         | otherwise = (frontPQ heap) : (hsort (dePQ heap))


{-
  Some tests
-}  
t = [3, 21, 113, 109, 64, 84, 112, 85, 56, 9]

-- heapSort t
