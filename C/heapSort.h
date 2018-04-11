void heapSort(int* fin, const int N);
void heapify(int* fin, int n, int i);
void swap(int a, int b, int* fin);

void heapSort(int* fin, const int N) {
  for (int i = N / 2 - 1; i >= 0; i--) heapify(fin, N, i);

  for (int i = N - 1; i >= 0; i--) {
    swap(0, i, fin);
    heapify(fin, i, 0);
  }
}

void heapify(int fin[], int n, int i) {
  int largest = i;
  int l = 2 * i + 1;
  int r = 2 * i + 2;

  if (l < n && fin[l] > fin[largest]) largest = l;

  if (r < n && fin[r] > fin[largest]) largest = r;

  if (largest != i) {
    swap(i, largest, fin);
    heapify(fin, n, largest);
  }
}

// void swap(int a, int b, int* fin) {
//   int tmp = fin[a];
//   fin[a] = fin[b];
//   fin[b] = tmp;
// }