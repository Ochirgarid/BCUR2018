public class SelectionSort {

  public void naive(int[] fin) {
    for (int i = 0; i < fin.length - 1; i++) {
      for (int j = i + 1; j < fin.length; j++) {
        if (fin[i] > fin[j])
          swap(fin, i, j);
      }
    }
  }

  public void swap(int[] fin, int a, int b) {
    int tmp = fin[a];
    fin[a] = fin[b];
    fin[b] = tmp;
  }
}