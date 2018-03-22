# Best O(n) - Average O(n2) - Worst O(n2)

def insert(ind, fin, key):
  i = ind - 1
  while i>= 0 and fin[i] > key:
    fin[i + 1] = fin[i]
    i = i - 1
  fin[i + 1] = key

def insertion_sort(fin):
  for i in range(1, len(fin)):
    insert(i, fin, fin[i])

t = [3, 21, 113, 109, 64, 84, 112, 85, 102, 31, 0, 49, 32, 69, 96, 14, 106, 79, 56, 9]

insertion_sort(t)
print(t)
