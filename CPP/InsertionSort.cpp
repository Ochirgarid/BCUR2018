#include <stdio.h>
// #include <vector>

void insert(int *a, int S, int x);
void insertioSort(int *a, int S);

int main() {
  printf("BCUR 2018 /n");

  int a[5] = {12,18,23,24,38};
  


  return 0;
}

void insert(int *a, int S, int x) {
  int j;
  for (j = S - 1; j >= 0; --j) {
    if (x < a[j])
      a[j + 1] = a[j];
    else
      break;
    a[j + 1] = x;
  }
}