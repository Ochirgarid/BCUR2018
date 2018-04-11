#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

#include "heapSort.h"
#include "insertionSort.h"
#include "mergeSort.h"
#include "quickSort.h"
#include "selectionSort.h"

#define INPUTS 100100

int cmpfunc(const void* a, const void* b);
void copyFin(int* fin, const int L, int* fout);

int main(int argc, char* argv[]) {
  // char const* const fileName = argv[1];
  char const* fileName = "../data.in";
  FILE* file = fopen(fileName, "r");

  int fin[INPUTS];
  int f, a, p;
  for (f = 0; f < INPUTS; ++f) fscanf(file, "%d,", &fin[f]);

  /* Sorting fin with builtin sorting function */
  qsort(fin, INPUTS, sizeof(int), cmpfunc);
  // for (p = 0; p < INPUTS; ++p) printf("%d ", fin[p]);

  int TC[INPUTS], tmp[INPUTS];
  copyFin(fin, INPUTS, TC);
  // insertionSort(TC, INPUTS);
  // selectionSort(TC, INPUTS);
  // heapSort(TC, INPUTS);
  // quickSort(TC, 0, INPUTS - 1);
  mergeSort(TC, 0, INPUTS - 1, tmp);

  // printf("\nOutput: \n");
  // for (p = 0; p < INPUTS; ++p) printf("%d ", TC[p]);

  /* Checking fin with Test cases */
  for (a = 0; a < INPUTS; ++a) {
    assert(fin[a] == TC[a]);
  }
  printf("\nSuccessful run.\n");

  fclose(file);
  return 0;
}

int cmpfunc(const void* a, const void* b) { return (*(int*)a - *(int*)b); }

void copyFin(int* fin, const int L, int* fout) {
  for (int i = 0; i < L; ++i) fout[i] = fin[i];
}

void swap(int a, int b, int* fin) {
  int tmp = fin[a];
  fin[a] = fin[b];
  fin[b] = tmp;
}