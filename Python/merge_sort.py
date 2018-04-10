# All O(nLogn)


def merge_sort_naive(fin):
    ''' Mergesort - return sorted (storage problem) 
        each recursion creates a copy
    '''
    if len(fin) < 2:
        return fin

    mid = int(len(fin) / 2)
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


def merge(fin, fout, start, end):
    ''' Mergesort - space efficient 

    '''
    if end - start < 2:
        return fout
    if end - start == 2:
        if fout[start] > fout[start + 1]:
            fout[start], fout[start + 1] = fout[start + 1], fout[start]
        return fout

    mid = int((start + end) / 2)
    merge(fout, fin, start, mid)
    merge(fout, fin, mid, end)

    i = start
    j = end
    ind = start
    while ind < end:
        if j >= end or (i < mid and fin[i] < fin[j]):
            fout[ind] = fin[i]
            i += 1
        else:
            fout[ind] = fin[j]
            j += 1
        ind += 1

def merge_sort(fin):
    copy = list(fin)
    return merge(copy,  fin, 0, len(fin)-1)


