#include <stdio.h>
#include <stdlib.h>

#include "insertionSort.h"
#include "quickSort.h"
#include "heapSort.h"
#include "selectionSort.h"
#include "mergeSort.h"

#define INPUTS 100100
#define SORTSIZE(x) (int)(sizeof(x) / sizeof(x[0]))

void swap(int a, int b, int* fin);
int cmpfunc(const void* a, const void* b);
void copyFin(int* fin, const int L, int* fout);

// Mainint
int main(int argc, char* argv[]) {
  //// char line[256];
  //// char const* const fileName = argv[1];
  // char const* fileName = "../data.in";
  // FILE* file = fopen(fileName, "r");

  // int fin[INPUTS];
  // int f, a, p;
  // for (f = 0; f < INPUTS; ++f) fscanf(file, "%d,", &fin[f]);

  int tc[] = {3,  21,  113, 109, 64, 84, 112, 85, 102, 31, 2,  49,  32, 69, 96,
              14, 106, 79,  56,  9,  73, 211, 13, 18,  6,  43, 142, 5,  12, 34};

  int TC[INPUTS]; 
  copyFin(tc, INPUTS, TC);

  qsort(tc, INPUTS, sizeof(int), cmpfunc);
  // for (int i = 0; i < INPUTS; ++i) printf("%d ", tc[i]);


  return 0;
}

int cmpfunc(const void* a, const void* b) { return (*(int*)a - *(int*)b); }

void copyFin(int* fin, const int L, int* fout) {
  for(int i = 0; i < L; ++i)
    fout[i] = fin[i];
}

void swap(int a, int b, int* fin) {
  int tmp = fin[a];
  fin[a] = fin[b];
  fin[b] = tmp;
}

// int getMin(int* fin, const int length) {
//   int minIndex = 0;
//   for (int m = 1; m < length; ++m) {
//     if (fin[m] < fin[minIndex]) minIndex = m;
//   }

//   return minIndex;
// }

// void printList(int* fin, const int length) {
//   printf("\n");
//   for (int p = 0; p < length; ++p) {
//     printf("%d ", fin[p]);
//   }
//   printf("\n");
// }
