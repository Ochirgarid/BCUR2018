import Control.Exception
import System.IO

-- Sorting modules
import QuickSort
main :: IO()
main = do
    let fin = []
    handle <- openFile "../data.in" ReadMode
    contents <- hGetContents handle
    let singlewords = words contents
        fin = readF singlewords

    evaluate (quickSort fin) -- Change sorting functions here    
    
    hClose handle
    
-- helper functions
readF :: [String] -> [Int]
readF = map read
