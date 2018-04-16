public class InsertionSort {
  /**
   * InsertionSort v.1
   * uses: naive, swap
   */
  public void naive(int fin[]) {
    // starts from the beginning
    for (int i = 0; i < fin.length - 1; i++) {
      // checks previous elms of i-th elm
      for (int j = i + 1; j > 0; j--) {
        // swaps lesser elm
        if (fin[j] < fin[j - 1])
          swap(fin, j, j - 1);
        else
          break;
      }
    }
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