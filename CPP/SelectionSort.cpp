#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

void selectionSort(vector<int> &fin);

void selectionSort(std::vector<int> &fin) {
  int i, minPos;
  
  for (i = 0; i < fin.size(); ++i) {
    minPos = distance(fin.begin(), min_element(fin.begin() + i, fin.end()));
    swap(fin[i], fin[minPos]);
  }
}