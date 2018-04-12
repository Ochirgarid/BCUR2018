import os
import time
import quick_sort as QS
import insertion_sort as INS
import selection_sort as SEL
import heap_sort as HS
import merge_sort as MS


# Reading inputs
script_dir = os.path.abspath(os.path.join(os.path.dirname(__file__),".."))
fin_path = os.path.join(script_dir, 'data.in')
fin = [int(line.rstrip('\n')) for line in open(fin_path)]

print("Input length: {}".format(len(fin)))
print("Input type: {}".format(fin[0].__class__))


# Benchmarking
start = time.time()

# INS.insertion_sort(fin)
# QS.quickSort_naive(fin, 0, len(fin) - 1)
# QS.quickSort_list(fin)
# QS.quickSort_filter(fin)
# HS.heap_sort(fin)
# MS.merge_sort_naive(fin)
SEL.selection_sort_naive(fin)

# Built-in sorting
# fin.sort()

end = time.time()
print("Time elapsed: {} seconds".format(end - start))
