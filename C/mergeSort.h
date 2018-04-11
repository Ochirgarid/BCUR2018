
void mergeSort(int* fin, int left, int right, int* tmp);

void mergeSort(int* fin, int left, int right, int* tmp) {
  int i, j, k, mid;

  if (right > left) {
    mid = left + (right - left)/2;

    mergeSort(fin, left, mid, tmp);
    mergeSort(fin, mid + 1, right, tmp);

    // copying data to tmp array
    for (i = mid + 1; i > left; --i) tmp[i - 1] = fin[i - 1];
    for (j = mid; j < right; ++j) tmp[right + mid - j] = fin[j + 1];


    // merging sub arrays to fin
    for (k = left; k <= right; ++k)
      fin[k] = (tmp[i] < tmp[j]) ? tmp[i++] : tmp[j--];
  }
}