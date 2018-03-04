#include <iostream>

int linSearchRec (int arr[], int low, int up, int key) {
  if (low > up) {
    return -1;
  } else if (arr[low] == key) {
    return low;
  } else {
    return linSearchRec (arr, low + 1, up, key);
  }
}

int linSearchIter (int arr[], int low, int up, int key) {
  for (int i = low; i < up; i++) {
    if (arr[i] == key)
      return i;
  }
  return -1;
}


int main() {
  int arr[] = {4,5,7,3,1,2};
  int arr1[] = {3,5,8,10,12,15,18,20,20,50,60};
  int res;

  // res = linSearchRec (arr,0,5,3);
  // res = linSearchIter (arr1,0,10,20);

  std::cout<<res<<'\n';
  return 0;
}
