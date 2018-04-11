void quickSort(int* fin, int low, int high);
int partition(int* fin, int low, int high);
void swap(int a, int b, int* fin);

void quickSort(int* fin, int low, int high) {
  if (high > low) {
    int pivot = partition(fin, low, high);
    quickSort(fin, low, pivot - 1);
    quickSort(fin, pivot + 1, high);
  }
}

int partition(int fin[], int low, int high) {
  int pivot = fin[high];
  int i = low - 1;

  for (int j = low; j <= high - 1; ++j) {
    if (fin[j] <= pivot) {
      i++;
      swap(i, j, fin);
    }
  }
  swap(i + 1, high, fin);
  return i + 1;
}

// void swap(int a, int b, int* fin) {
//   int tmp = fin[a];
//   fin[a] = fin[b];
//   fin[b] = tmp;
// }