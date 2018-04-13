/* BCUR 2018 */

#include <algorithm>
#include <cstdlib>
#include <fstream>
#include <iostream>
#include <vector>

#include <chrono>

#include "HeapSort.cpp"
#include "InsertionSort.cpp"
#include "MergeSort.cpp"
#include "QuickSort.cpp"
#include "SelectionSort.cpp"

using namespace std;
void testSorting(vector<int> &fin, vector<int> &TC, bool show);

ifstream rin("../data.in");
// ofstream fout("data.out");

int main() {
  int a;
  vector<int> fin;
  while (rin >> a) {
    fin.push_back(a);
  }
  cout << "Inputs size: " << fin.size() << '\n';
  vector<int> tmp(fin);
  vector<int> TC(fin);

  /* Benchmarking */
  chrono::time_point<chrono::system_clock> start, end;

  // Start time.
  start = chrono::system_clock::now();

  insertionSort(TC);
  // selectionSort(TC);
  // mergeSort(TC, tmp, 0, TC.size() - 1);
  // randomized_quick_sort(TC, 0, TC.size() - 1);
  // heapSort(TC);

  // Built-in sort
  // std::sort(TC.begin(), TC.end());

  // End time.
  end = chrono::system_clock::now();

  // Time elapsed.
  chrono::duration<double> timeElapsed = end - start;
  cout << "\nTime elapsed: " << timeElapsed.count() << " seconds" << '\n';

  // Testing
  // testSorting(fin, TC, false);

  // Run command
  // g++ -std=c++11 -o2 Demo.cpp -lm -o demo

  return 0;
}

// ---------------------------------------------------------------------------------------
void testSorting(vector<int> &fin, vector<int> &TC, bool show) {
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