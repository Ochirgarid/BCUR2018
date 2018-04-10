public class QuickSort {
  public void naive(int[] fin, int low, int high) {
    if (low >= high)
      return;
    int pivotInd = partition(fin, low, high);
    naive(fin, low, pivotInd - 1);
    naive(fin, pivotInd + 1, high);
  }

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

    return h;
  }

  public void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }
}
