import QuickSort

import Text.Printf
import Control.Exception
import System.CPUTime
import Control.Parallel.Strategies
import Control.Monad
import System.Environment

q = [10,2,5,3,1,6,7,4,2,3,4,8,9]

time :: (Num t, NFData t) => t -> IO ()
time y = do
    start <- getCPUTime
    replicateM_ (quickSort q) $ do
        x <- evaluate $ 1 + y
        rnf x `seq` return ()
    end   <- getCPUTime
    let diff = (fromIntegral (end - start)) / (10^12)
    printf "Computation time: %0.9f sec\n" (diff :: Double)
    printf "Individual time: %0.9f sec\n" (diff / fromIntegral (quickSort q) :: Double)
    return ()
 
main = do
    [n] <- getArgs
    let y = read n
    putStrLn "Starting..."
    time (y :: Int)
    putStrLn "Done."