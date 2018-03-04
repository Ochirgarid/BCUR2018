#include <iostream>
#include <vector>
#include <cstdlib>

std::vector<int> partition3(std::vector<int> &a, int l, int r) {
  int low = l;
  int hi = r;

  int key = a[low];
  std::vector<int> vec;

  int i = low;
  while (i <= hi) {
    if (a[i] < key) {
      std::swap(a[i], a[low]);
      low++;
      i++;
    } else if (a[i] > key) {
      std::swap(a[i], a[hi]);
      hi--;
    } else {
      i++;
    }
  }

  vec.push_back(low);
  vec.push_back(hi);
  
  return vec;
}

void randomized_quick_sort(std::vector<int> &a, int l, int r) {
  if (l >= r) {
    return;
  }

  int k = l + rand() % (r - l + 1);
  std::swap(a[l], a[k]);

  std::vector<int> m = partition3(a, l, r);
  randomized_quick_sort(a, l, m[0]-1);
  randomized_quick_sort(a, m[1]+1, r);
}

int main() {
  int n;
  std::cin >> n;
  std::vector<int> a(n);
  for (size_t i = 0; i < a.size(); ++i) {
    std::cin >> a[i];
  }
  randomized_quick_sort(a, 0, a.size() - 1);
  for (size_t i = 0; i < a.size(); ++i) {
    std::cout << a[i] << ' ';
  }
}
