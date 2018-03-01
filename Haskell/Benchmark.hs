module Benchmarking where
import Control.Exception
import System.IO
import System.TimeIt

-- Sorting modules
import QuickSort

-- helper functions
readF :: [String] -> [Int]
readF = map read


-- main 
main :: IO()
main = do
    let fin = []
    handle <- openFile "../data.in" ReadMode
    contents <- hGetContents handle
    let singlewords = words contents
        fin = readF singlewords
    
    -- using TimeIt
    timeIt $ evaluate (quickSort fin) -- Change sorting functions here    
    
    hClose handle
    