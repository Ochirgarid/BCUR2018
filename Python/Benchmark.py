import os
import random
import merge_sort as MS
import insertion_sort as INS
import quick_sort as QS
import heap_sort as HS


""" Benchmarking implementations """


def compare_sort_times(bound, limit, count):
    from time import time

    while bound < limit:
        time_builtin = time_custom = 0
        for t in range(count):
            tc1 = [random.randint(1, bound) for x in range(bound)]
            tc2 = list(tc1)

            now = time()
            # tc1.sort()
            QS.quickSort_naive(tc1, 0, len(tc1) - 1)            
            time_builtin += (time() - now)

            now = time()
            # MS.merge_sort(tc2)
            # INS.insertion_sort(tc2)
            # QS.quickSort_naive(tc2, 0, len(tc2) - 1)
            tc2 = QS.quickSort_filter(tc2)            
            # HS.heap_sort(tc2)
            time_custom += (time() - now)

            assert tc1 == tc2

        print("n: {n} builtin: {b} custom: {c}".format(
            n=bound, b=time_builtin / 10, c=time_custom / 10))
        bound *= 2


compare_sort_times(64, 262144, 100)
