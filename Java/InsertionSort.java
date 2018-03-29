public class InsertionSort {

  public void naive(int fin[]) {
    for (int i = 0; i < fin.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (fin[j] < fin[j - 1])
          swap(fin, j, j - 1);
        else
          break;
      }
    }
  }

  public void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }
}