import Control.Exception
import System.IO
import Data.List

-- Sorting modules
import QuickSort
import InsertionSort
import MergeSort
import SelectionSort
import HeapSort

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
-- OR
-- ghc -prof -fprof-auto -fforce-recomp -rtsopts --make -O2 Demo.hs -- recompiles everything
-- ./Demo +RTS -P -sprogram.stats -RTS -- it creates Demo.prof and program.stats

