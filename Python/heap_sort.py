
''' HeapSort '''


def heap_sort(fin):
    build_heap(fin)

    for i in range(len(fin) - 1, 0, -1):
        fin[0], fin[i] = fin[i], fin[0]
        heapify(fin, 0, i)


def build_heap(fin):
    n = len(fin)
    for i in range(int(n / 2) - 1, -1, -1):
        heapify(fin, i, n)


def heapify(fin, ind, maxInd):
    left = 2 * ind + 1
    right = 2 * ind + 2

    if left < maxInd and fin[left] > fin[ind]:
        largest = left
    else:
        largest = ind

    if right < maxInd and fin[right] > fin[largest]:
        largest = right

    if largest != ind:
        fin[ind], fin[largest] = fin[largest], fin[ind]
        heapify(fin, largest, maxInd)
