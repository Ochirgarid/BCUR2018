import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ModernSort {
  /* Using Parallel sort  */
  public void pSort(int[] fin) {
    Arrays.parallelSort(fin);
  }
  
  /* Using sort with Comparator */
  public void sort1(int[] fin) {
    List<Integer> finList = new ArrayList<Integer>();
    for (int i : fin)
      finList.add(i);
    finList.sort(Comparator.naturalOrder());
  }

  /* Using Lambda with sort  */
  public void sort2(int[] fin) {
    Integer[] toSort = Arrays.stream(fin).boxed().toArray(Integer[]::new);
    Arrays.sort(toSort, (a, b) -> {
      return a - b;
    });
  }
}
