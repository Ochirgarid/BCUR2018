/* BCUR 2018 */

#include <cstdlib>

#include <iostream>
#include <vector>
#include <algorithm>

#include "InsertionSort.cpp"
#include "SelectionSort.cpp"
#include "QuickSort.cpp"
#include "MergeSort.cpp"
#include "HeapSort.cpp"

using namespace std;
void testSorting(vector<int> &fin, vector<int> &TC, bool show);


int main() {
  int t[] = {3,  21,  113, 109, 64, 84, 112, 85, 102, 31, 1,  49,  32, 69, 96,
             14, 106, 79,  56,  9,  73, 211, 13, 18,  6,  43, 142, 5,  12, 34};
  int range = 30;
  vector<int> TC(t, t + range);
  vector<int> fin(t, t + range);
  vector<int> tmp(t, t + range);
  

  // insertionSort(TC);
  // selectionSort(TC);
  // randomized_quick_sort(TC, 0, TC.size() - 1);
  // mergeSort(TC, tmp, 0, TC.size() - 1);

  heapSort(TC);

  // for (auto s = TC.begin(); s != TC.end(); ++s) cout << *s << ' ';

  testSorting(fin, TC, true);

  return 0;
}

// --------------------------------------------------------------------------------------- 
void testSorting(vector<int> &fin, vector<int> &TC, bool show) {
  // for (auto a = TC.begin(); a != TC.end(); ++a)
  //   assert(TC[a] == fin[a]);
  std::sort(fin.begin(), fin.end());

  int fin_copy[fin.size()];
  std::copy(fin.begin(), fin.end(), fin_copy);

  if (std::equal(TC.begin(), TC.end(), fin_copy))
    std::cout << "The contents are equal.\n";
  else
    std::cout << "The contents differ.\n";

  if (show)
    for (auto i = TC.begin(); i != TC.end(); ++i) std::cout << *i << ' ';
}