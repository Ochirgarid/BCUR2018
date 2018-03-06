def bin_search(fin, key):
    low = 0
    high = len(fin) - 1

    while low <= high:
        mid = low + int((high - low) / 2)

        if fin[mid] == key:
            return mid
        elif key < fin[mid]:
            high = mid - 1
        else:
            low = mid + 1
    return -(low + 1)

