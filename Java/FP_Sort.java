public class FP_Sort {

  public int findMin(int[] fin, int start) {
    if (start == fin.length - 1) {
      return start;
    }
    int restMinInd = findMin(fin, start + 1);
    int restMin = fin[restMinInd];

    if (restMin < fin[start]) {
      return restMinInd;
    } else {
      return start;
    }
  }

  public void swap(int[] fin, int i, int j) {
    if (i == j) {
      return;
    }
    int tmp = fin[i];
    fin[i] = fin[j];
    fin[j] = tmp;
  }

  public void selectionSort(int[] fin, int start) {
    int minElm = findMin(fin, start);
    swap(fin, start, minElm);

    selectionSort(fin, start + 1);
  }
}