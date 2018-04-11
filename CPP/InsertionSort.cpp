// InsertionSort.h
// #ifndef InsertionSort
// #define InsertionSort

#include <iostream>
#include <vector>

void insertionSort(std::vector<int> &fin);
void insert(std::vector<int> &fin, int key);

void insertionSort(std::vector<int> &fin) {
  for (int i = 1; i < fin.size(); ++i)
    if (fin[i] < fin[i - 1]) {
      int tmp = fin[i];
      int location = i;
      do {
        fin[location] = fin[location - 1];
        location--;
      } while (location > 0 && fin[location - 1] > tmp);
      fin[location] = tmp;
    }
}
// void insert(std::vector<int> &fin, int key) { std::cout << fin.size() <<
// '\n'; }

// #endif
