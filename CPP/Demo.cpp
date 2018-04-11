/* BCUR 2018 */

#include <cstdlib>
#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

#include "InsertionSort.cpp"
#include "SelectionSort.cpp"
#include "QuickSort.cpp"
#include "MergeSort.cpp"
#include "HeapSort.cpp"

using namespace std;
void testSorting(vector<int> &fin, vector<int> &TC, bool show);

ifstream fin("../data.in");
ofstream fout("data.out");

int main() {
  int a;
  while (fin >> a) {
    cout << a << '\n';
  }

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