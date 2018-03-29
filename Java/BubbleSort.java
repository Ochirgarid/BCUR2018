public class BubbleSort {

  public void naive(int fin[]) {
    boolean swapped;
    for (int i = 0; i < fin.length; i++) {
      swapped = true;
      for (int j = fin.length - 1; j > i; j--) {
        if (fin[j] < fin[j - 1]) {
          swap(fin, j, j - 1);
          swapped = true;
        }
      }
      if (!swapped)
        break;
    }
  }

  public void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }
}