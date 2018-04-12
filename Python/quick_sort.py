
''' QuickSort '''


def quickSort_naive(fin, low, high):
    if low < high:
        split_point = partition(fin, low, high)
        quickSort_naive(fin, low, split_point - 1)
        quickSort_naive(fin, split_point + 1, high)


def partition(fin, low, high):
    pivot = fin[low]

    left = low + 1
    right = high

    sort_done = False
    while not sort_done:
        while left <= right and fin[left] <= pivot:
            left += 1
        while fin[right] >= pivot and right >= left:
            right -= 1
        if right < left:
            sort_done = True
        else:
            tmp = fin[left]
            fin[left], fin[right] = fin[right], tmp
    tmp = fin[low]
    fin[low], fin[right] = fin[right], tmp

    return right


def quickSort_list(fin):
    if len(fin) <= 1:
        return fin

    pivots = [x for x in fin if x == fin[0]]
    lesser = quickSort_list([x for x in fin if x < fin[0]])
    greater = quickSort_list([x for x in fin if x > fin[0]])

    return lesser + pivots + greater


def quickSort_filter(fin):
    if len(fin) <= 1:
        return fin

    pivots = list(filter(lambda x: x == fin[0], fin))
    lesser = quickSort_list(list(filter(lambda x: x < fin[0], fin)))
    greater = quickSort_list(list(filter(lambda x: x > fin[0], fin)))

    return lesser + pivots + greater

