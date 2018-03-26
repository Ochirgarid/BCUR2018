# All O(nLogn)

def merge_sort_naive(fin):
  ''' Mergesort - return sorted (storage problem) 
      each recursion creates a copy
  '''
  if len(fin) < 2:
    return fin

  mid = int(len(fin)/2)
  left = merge_sort_naive(fin[:mid])
  right = merge_sort_naive(fin[mid:])

  i = j = 0

  fout = []  
  while len(fout) < len(fin):
    if j >= len(right) or (i < mid and left[i] < right[j]):
      fout.append(left[i])
      i += 1
    elif j < len(right):
      fout.append(right[j])
      j += 1

  return fout  
def merge_sort (fin):
  ''' Mergesort - space efficient 
  
  '''
tc = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]

print(merge_sort_naive(tc))
