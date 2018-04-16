public class QuickSort {
  /**
   * QuickSort v.1
   * it uses naive, partition, swap
   */
  public void naive(int[] fin, int low, int high) {
    if (low >= high)
      return;

    // Selects pivot and partition it.  
    int pivotInd = partition(fin, low, high);

    // Recursively partitions
    naive(fin, low, pivotInd - 1);
    naive(fin, pivotInd + 1, high);
  }

  /**
   * Sorts array by given low and high point.
   * Selects a pivot at the fin[low] and sorts fin based on the pivot.
   */
  public int partition(int[] fin, int low, int high) {
    int pivot = fin[low];
    int l = low;
    int h = high;

    while (l < h) {
      while (fin[l] <= pivot && l < h)
        l++;
      while (fin[h] > pivot)
        h--;
      if (l < h)
        swap(fin, l, h);
    }
    swap(fin, low, h);

    // returns pivot index
    return h;
  }

  /**
  * Function to swap two numbers in an array
  */
  public void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }
}
