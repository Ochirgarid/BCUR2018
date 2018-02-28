module QuickSort where

quickSort :: (Ord a) => [a] -> [a]  
quickSort [] = []  
quickSort (x:xs) =   
    let smSorted = quickSort [a | a <- xs, a <= x]  
        bgSorted = quickSort [a | a <- xs, a > x]  
    in  smSorted ++ [x] ++ bgSorted
