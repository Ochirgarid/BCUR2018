public class HeapSort {
  /**
  * HeapSort v.1
  * it uses naive, heapify, getLeftChildInd, getRightChildInd, getParentInd, swiftDown
  * Sorting is broken down to a few functions.
  * Modularised sorting but it is considerably slower than v.2
  */
  public void naive(int[] fin) {
    heapify(fin, fin.length - 1); // build a heap

    int endInd = fin.length - 1;
    while (endInd > 0) {
      swap(fin, 0, endInd); // swaps 1st elm of fin with i-th elm
      endInd--;
      swiftDown(fin, 0, endInd); // re-corrects a heap after swapping.
    }
  }

  /**
   * Builds a heap
   */
  private void heapify(int[] fin, int endInd) {
    int ind = getParentInd(endInd, endInd);

    while (ind >= 0) {
      swiftDown(fin, ind, endInd);
      ind--;
    }
  }

  /**
   * Get a left child of a given node
   */
  private int getLeftChildInd(int ind, int endInd) {
    int leftChildInd = 2 * ind + 1;
    if (leftChildInd > endInd)
      return -1;
    return leftChildInd;
  }

  /**
   * Get a right child of a given node
   */
  private int getRightChildInd(int ind, int endInd) {
    int rightChildInd = 2 * ind + 2;
    if (rightChildInd > endInd)
      return -1;
    return rightChildInd;
  }

  /**
   * Get parent id of a given node
   */
  private int getParentInd(int ind, int endInd) {
    if (ind < 0 || ind > endInd)
      return -1;
    return (ind - 1) / 2;
  }

  /**
   * Corrects heap structure. 
   */
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

  /** 
  * Heapsort v.2 
  * it uses buildMAx, swap, heapify, maxHeap
  */
  private static int N; // fin's size

  public void buildMax(int fin[]) {
    heapify(fin); // builds a heap
    for (int i = N; i > 0; i--) {
      swap(fin, 0, i); // swaps 1st elm of fin with i-th elm
      N--;
      maxHeap(fin, 0); // re-corrects a heap after swapping
    }
  }

  /** 
  * Build a heap 
  */
  private void heapify(int fin[]) {
    N = fin.length - 1; // sets fin's size to N
    for (int i = N / 2; i >= 0; i--)
      maxHeap(fin, i); // build a correct heap
  }

  /**
  * Corrects max heap 
  */
  public void maxHeap(int fin[], int i) {
    int left = 2 * i;
    int right = 2 * i + 1;
    int max = i;
    if (left <= N && fin[left] > fin[i])
      max = left;
    if (right <= N && fin[right] > fin[max])
      max = right;

    if (max != i) {
      swap(fin, i, max);
      maxHeap(fin, max);
    }
  }

  /**
  * Function to swap two numbers in an array
  */
  private void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }
}