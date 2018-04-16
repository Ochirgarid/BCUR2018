public class SelectionSort {
  /**
   * SelectionSort v.1
   * it uses naive, swap
   */
  public void naive(int[] fin) {
    for (int i = 0; i < fin.length - 1; i++) {
      // Searches through fin to find min elm. if found, swap.
      for (int j = i + 1; j < fin.length; j++) {
        if (fin[i] > fin[j])
          swap(fin, i, j);
      }
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