import Control.Exception
import Data.Time
import System.IO  
import Control.Monad

import QuickSort

readF :: [String] -> [Int]
readF = map read

main = do  
    let fin = []
    handle <- openFile "../data.in" ReadMode
    contents <- hGetContents handle
    let singlewords = words contents
        fin = readF singlewords
    start <- getCurrentTime
    evaluate (quickSort fin) -- Change sorting functions here
    end <- getCurrentTime        

    -- print "TestCase: "
    -- print fin
    -- print "Outpout: "    
    -- print (quickSort fin)
    -- print "Time: "    
    -- print (diffUTCTime end start)    

    hClose handle
