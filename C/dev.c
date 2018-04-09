#include <stdio.h>
#define SORTSIZE(x) (int)(sizeof(x) / sizeof(x[0]))

void printList(int* fin);
void swap(int a, int b, int* fin);
int getMin(int* fin, const int length);

// Main
int main(int argc, char* argv[]) {
  int tc[] = {3, 21, 113, 109, 64, 84, 112, 85, 102, 31,
              0, 49, 32,  69,  96, 14, 106, 79, 56,  9};

  int t[] = {3, 4, 5, 6, 0, 3, 2, 1};
  insertionSort(t, 8);

  for (int c = 0; c < 8; ++c) printf("%d \n", t[c]);


  return 0;
}


void swap(int a, int b, int* fin) {
  int tmp = fin[a];
  fin[a] = fin[b];
  fin[b] = tmp;
}

int getMin(int* fin, const int length) {
  int minIndex = 0;
  for (int m = 1; m < length; ++m) {
    if (fin[minIndex] < fin[m]) minIndex = m;
  }

  return minIndex;
}

void printList(int* fin) {
  for (int p = 0; p < SORTSIZE(fin); ++p) {
    printf("%d ", fin[p]);
  }
  printf("\n");
}
