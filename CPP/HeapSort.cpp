/* BCUR 2018 */
#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

void heapify(vector<int> &fin, int size, int i) {
  int largest = i;
  int l = 2 * i + 1; // left child
  int r = 2 * i + 2; // right child
  
  // If left child is larger than root
  if (l < size && fin[l] > fin[largest]) largest = l;

  // If right child is larger than largest so far
  if (r < size && fin[r] > fin[largest]) largest = r;

  // If largest is not root
  if (largest != i) {
    swap(fin[i], fin[largest]);
    heapify(fin, size, largest);
  }
}

void heapSort(vector<int> &fin) {
  int S = fin.size();
  for (int i = S / 2 - 1; i >= 0; i--) heapify(fin, S, i);

  // One by one extract an element from heap
  for (int i = S - 1; i >= 0; i--) {
    swap(fin[0], fin[i]);
    heapify(fin, i, 0);
  }
}