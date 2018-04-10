public class HeapSort {
  public void naive (int[] fin) {
    heapify(fin, fin.length - 1);

    int endInd = fin.length - 1;
    while (endInd > 0) {
      swap(fin, 0, endInd);
      endInd--;
      swiftDown(fin, 0, endInd  );
    }
  }

  private void heapify(int[] fin, int endInd) {
    int ind = getParentInd(endInd, endInd);

    while (ind >= 0) {
      swiftDown(fin, ind, endInd);
      ind--;
    }
  }

  private int getLeftChildInd(int ind, int endInd) {
    int leftChildInd = 2 * ind + 1;
    if (leftChildInd > endInd)
      return -1;
    return leftChildInd;
  }

  private int getRightChildInd(int ind, int endInd) {
    int rightChildInd = 2 * ind + 2;
    if (rightChildInd > endInd)
      return -1;
    return rightChildInd;
  }

  private int getParentInd(int ind, int endInd) {
    if (ind < 0 || ind > endInd)
      return -1;
    return (ind - 1) / 2;
  }

  private void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }

  private void swiftDown(int[] fin, int ind, int endInd) {
    int leftChildInd = getLeftChildInd(ind, endInd);
    int rightChildInd = getRightChildInd(ind, endInd);

    if (leftChildInd != -1 && fin[leftChildInd] > fin[ind]) {
      swap(fin, leftChildInd, ind);
      swiftDown(fin, leftChildInd, endInd);
    }

    if (rightChildInd != -1 && fin[rightChildInd] > fin[ind]) {
      swap(fin, rightChildInd, ind);
      swiftDown(fin, rightChildInd, endInd);
    }
  }

  // private void swiftUp(int[] fin, int ind, int endInd) {
  // 
  // }
}