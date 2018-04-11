/* BCUR 2018 */
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;
void mergeSort(vector<int> &fin, vector<int> &tmp, int low, int upper);
void merge(vector<int> &fin, vector<int> &tmp, int low, int mid, int upper);

void mergeSort(vector<int> &fin, vector<int> &tmp, int low, int upper) {
  if (low >= upper) {
    return;
  }
  int mid = (low + upper) / 2;
  mergeSort(fin, tmp, low, mid);
  mergeSort(fin, tmp, mid + 1, upper);
  merge(fin, tmp, low, mid, upper);
}

void merge(vector<int> &fin, vector<int> &tmp, int low, int mid, int upper) {
  int lowStart = low;
  int lowStop = mid;
  int upperStart = mid + 1;
  int upperStop = upper;
  int count = low;
  while (lowStart <= lowStop && upperStart <= upperStop) {
    if (fin[lowStart] < fin[upperStart]) {
      tmp[count++] = fin[lowStart++];
    } else {
      tmp[count++] = fin[upperStart++];
    }
  }
  while (lowStart <= lowStop) {
    tmp[count++] = fin[lowStart++];
  }
  while (upperStart <= upperStop) {
    tmp[count++] = fin[upperStart++];
  }
  for (int i = low; i <= upper; i++) {
    fin[i] = tmp[i];
  }
}
