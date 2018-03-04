#include <iostream>
#include <vector>

using std::vector;

int binSearchRec (int arr[], int low, int up, int key) {
  int mid;
  if (low > up)
    return (low - 1);

  mid = low + ((up-low)/2);
  if (arr[mid] == key) {
    return mid;
  } else if (key < arr[mid]) {
    return binSearchRec(arr, low, mid - 1, key);
  } else {
    return binSearchRec(arr, mid + 1, up, key);
  }
}

int binSearchIter (int arr[], int low, int up, int key) {
  int mid;
  while (low <= up) {
    mid = low + ((up-low)/2);
    if (key == arr[mid]) {
      return mid;
    } else if (key < arr[mid]) {
      up = mid - 1;
    } else {
      low = mid + 1;
    }
  }
  return -1;
}

int binary_search(const vector<int> &a, int x) {
  int left = 0, right = (int)a.size();
  //write your code here
  int mid;
  while (left <=right) {
    mid = left + ((right - left)/2);
    if (x == a[mid]) {
      return mid;
    } else if (x < a[mid]) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }
  return -1;
}

int main() {
  int arr[] = {4,5,7,3,1,2};
  int arr1[] = {3,5,8,10,12,15,18,20,20,50,60};
  int res;

  res = binSearchIter(arr1,0,10,50);

  std::cout<<res<<'\n';
  return 0;
}
