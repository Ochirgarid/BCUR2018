def selection_sort_naive(fin):
    fout = []
    while len(fin):
        ind = fin.index(min(fin))
        fout.append(fin[ind])
        fin.remove(fin[ind])

    return fout

