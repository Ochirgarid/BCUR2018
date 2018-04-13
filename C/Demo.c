#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#include <time.h>
#include <assert.h>

#include "heapSort.h"
#include "insertionSort.h"
#include "mergeSort.h"
#include "quickSort.h"
#include "selectionSort.h"

#define INPUTS 100000
#define CLOCK_PRECISION 1E9 // one billion
#define INPUTSIZE(x) (int)(sizeof(x) / sizeof(x[0]))

int cmpfunc(const void* a, const void* b);
void copyFin(int* fin, const int L, int* fout);

/* Main function */
int main(int argc, char* argv[]) {
  // char const* const fileName = argv[1];
  char const* fileName = "../data.in";
  FILE* file = fopen(fileName, "r");

  /* Reading inputs */
  static int fin[INPUTS];
  int f, a, p;
  for (f = 0; f < INPUTS; ++f) fscanf(file, "%d,", &fin[f]);

  // Preparing arrays
  static int TC[INPUTS], tmp[INPUTS];
  copyFin(fin, INPUTS, TC);

  /* Benchmarking in Windows */  
  LARGE_INTEGER frequency; // gives warning: identifier "LARGE_INTEGER" is undefined. but compiles fine and
  LARGE_INTEGER start;
  LARGE_INTEGER end;
  double elapsedSeconds;
  QueryPerformanceFrequency(&frequency);
  QueryPerformanceCounter(&start);
  
  /* Run experiment */    
  // insertionSort(TC, INPUTS);
  // selectionSort(TC, INPUTS);
  // mergeSort(TC, 0, INPUTS - 1, tmp);
  // quickSort(TC, 0, INPUTS - 1);
  // heapSort(TC, INPUTS);

  /* Sorting fin with builtin sorting function */
  qsort(fin, INPUTS, sizeof(int), cmpfunc);
  // for (p = 0; p < INPUTS; ++p) printf("%d ", fin[p]);

  QueryPerformanceCounter(&end);
  elapsedSeconds = (end.QuadPart - start.QuadPart) / (double)frequency.QuadPart;

  /* Benchmarking in UNIX */
  // struct timespec start, end;
  // int64_t total_nanoseconds = 0;
  // clock_gettime(CLOCK_MONOTONIC, &start);
  /* Run experiment */  
  // clock_gettime(CLOCK_MONOTONIC, &end);
  // total_nanoseconds += CLOCK_PRECISION*(end.tv_sec - start.tv_sec) + end.tv_nsec - start.tv_nsec;

  /* Checking fin with Test cases */
  // qsort(fin, INPUTS, sizeof(int), cmpfunc);  
  // for (a = 0; a < INPUTS; ++a) {
  //   assert(fin[a] == TC[a]);
  // }
  // printf("\nSuccessful run.");
  // printf("\nOutput: \n");
  // for (p = 0; p < INPUTS; ++p) printf("%d ", TC[p]);

  printf("\nElapsed time: %f seconds", elapsedSeconds);
  // printf("\nInput size: %d\n", INPUTSIZE(fin));

  // Run command:
  // gcc -o2 Demo.c -lm -o demo

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