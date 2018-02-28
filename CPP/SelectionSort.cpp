#include <stdio.h>

void SelSort(int *a, int S);

int main() { 
  int a[5] = {30, 50, 10, 15, 25};

  SelSort(a, 5);

  for (int s = 0; s<5; ++s) {
    printf("elm: %d", a[s]);
  }

  return 0; 
}

void SelSort(int *a, int S) {
  int i, j, k, min;

  for (i = 0; i < S - 1; ++i) {
    k = i;
    min = a[k];

    for (j = i + 1; j < S; ++j) {
      if (a[j] < min) {
        k = j;
        min = a[k];
      }
      a[k] = a[i];
      a[i] = min;
    }
  }
}