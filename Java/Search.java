/*
* 
*/
public class Search {
  /*
  * Linear search
  */
  public int linSearch(int key, int[] fin) {
    int ind = 0;
    
    while (ind < fin.length) {
      if (fin[ind] == key)
        return ind;
      else
        ind ++;
    }
    return -1;
  }
  
  /*
  * Binary search
  */
  public int binSearch(int key, int[] fin) {
    int low = 0;
    int high = fin.length;
    int result = -1;
    int mid;
    
    while (low <= high) {
      mid = low + ((high - low)/2);
      if (key == fin[mid]) {
        result = mid;
        return result;
      } else if (key < fin[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return result;    
  }
}
