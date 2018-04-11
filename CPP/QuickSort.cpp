#include <stdlib.h>     /* srand, rand */
#include <vector>

using namespace std;

vector<int> partition3(vector<int> &fin, int l, int r) {
  int low = l;
  int hi = r;

  int key = fin[low];
  vector<int> vec;

  int i = low;
  while (i <= hi) {
    if (fin[i] < key) {
      swap(fin[i], fin[low]);
      low++;
      i++;
    } else if (fin[i] > key) {
      swap(fin[i], fin[hi]);
      hi--;
    } else {
      i++;
    }
  }

  vec.push_back(low);
  vec.push_back(hi);

  return vec;
}

void randomized_quick_sort(vector<int> &fin, int l, int r) {
  if (l >= r) {
    return;
  }

  int k = l + rand() % (r - l + 1);
  swap(fin[l], fin[k]);

  vector<int> m = partition3(fin, l, r);
  randomized_quick_sort(fin, l, m[0] - 1);
  randomized_quick_sort(fin, m[1] + 1, r);
}
