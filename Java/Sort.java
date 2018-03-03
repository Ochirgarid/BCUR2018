/*
*
*/
public class Sort {
  /*
  * Selection sort
  */
  public void selectionSort(int[] fin) {
    int indMin;
    
    for (int i=0; i<fin.length - 1; i++) {
      indMin = i;      
      for (int j=i+1; j<fin.length; j++) {
        if (fin[j] < fin[indMin])
          indMin = j;
      }
      int tmp = fin[i];
      fin[i] = fin[indMin];
      fin[indMin] = tmp;
    }
  }

  /*
  * Insertion sort
  */
  public void insertionSort(int[] fin) {
    int indCurr;
    
    for (int pos=1; pos<fin.length; pos++) {
      indCurr = pos;
      while (indCurr > 0 && fin[indCurr] < fin[indCurr - 1]) {
        int tmp = fin[indCurr];
        fin[indCurr] = fin[indCurr - 1];
        fin[indCurr - 1] = tmp;
        indCurr --;
      }
    }
  }
}
