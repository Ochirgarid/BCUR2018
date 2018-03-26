#include <stdio.h>
#define SORTSIZE(x) (int)(sizeof(x) / sizeof(x[0]))

void printList(int* fin);
void swap(int a, int b, int* fin);
int getMin(int* fin, const int length);

void selectionSort(int* fin, const int size);

// Main
int main(int argc, char* argv[]) {
  int tc[] = {3, 21, 113, 109, 64, 84, 112, 85, 102, 31,
              0, 49, 32,  69,  96, 14, 106, 79, 56,  9};

  // swap(0,9, tc);
  // printList(tc);
  // selectionSort(tc, SORTSIZE(tc));
  // printList(tc);

  int t[6] = {3, 4, 5, 6, 0, 3};

  printf("%d \n", getMin(tc, 6));
  // printf("%d \n", SORTSIZE(tc));
  return 0;
}

void selectionSort(int* fin, int const size) {
  int min, t, i;

  printf("%d : \n", size);
  for (t = 0; t < size - 1; ++t) {
    for (i = t + 1; i < size; ++i) {
      if (fin[min] < fin[i]) min = i;
    }
    swap(min, t, fin);
  }
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
