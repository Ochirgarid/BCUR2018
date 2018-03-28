import Control.Exception
import System.IO

-- Sorting modules
import QuickSort
import InsertionSort
import MergeSort
import SelectionSort

-- main body
main :: IO()
main = do
    let fin = []
    handle <- openFile "../data.in" ReadMode
    contents <- hGetContents handle
    let singlewords = words contents
        fin = readF singlewords
    
    evaluate (insertionSort fin) -- Change sorting functions here    
    -- putStrLn $ show (selectionSort fin) -- printing result to see

    hClose handle
    
-- helper functions
readF :: [String] -> [Int]
readF = map read


-- run commands
-- ghc -prof -fprof-auto -rtsopts Demo.hs -- bit confusing
-- ghc -O2 --make Demo.hs -prof -fprof-auto
-- time ./Demo +RTS -s -p 
