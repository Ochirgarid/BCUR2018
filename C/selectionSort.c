void selectionSort(int fin[], const int N);

void selectionSort(int fin[], const int N) {
  int i, j, min;
  for (i = 0; i < N; ++i) {
    min = i;
    for (j = i + 1; j <= N; j++) {
      if (fin[j] < fin[min]) min = j;
    }
    swap(min, i, fin);
  }
}

void swap(int a, int b, int* fin) {
  int tmp = fin[a];
  fin[a] = fin[b];
  fin[b] = tmp;
}
