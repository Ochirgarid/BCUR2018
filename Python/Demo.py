import os
import binary_search as BS

# script_dir = os.path.dirname(__file__)
# fin_path = os.path.join(script_dir, 'data.in')
# fin = [line.rstrip('\n') for line in open(fin_path)]
# print(fin)


""" Benchmarking implementations """


def benchmark():
    from time import time
    n = 2

    while n < 65536:
        tc = list(range(n))

        now = time()
        BS.bin_search(tc, 545)
        done = time()

        print(str(n) + ' - ' + str((done - now) * 1000))
        n *= 2


benchmark()
