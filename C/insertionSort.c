void insertionSort(int fin[], const int N);

void insertionSort(int fin[], const int N) {
  int i, j, key;
  for (i = 1; i < N; ++i) {
    key = fin[i];
    j = i - 1;
    while (j >= 0 && fin[j] > key) {
      fin[j + 1] = fin[j];
      j--;
    }
    fin[j + 1] = key;
  }
}

void swap(int a, int b, int* fin) {
  int tmp = fin[a];
  fin[a] = fin[b];
  fin[b] = tmp;
}