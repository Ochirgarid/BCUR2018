import java.util.*;

public class Test {

  public static void main(String args[]) {
    Random rand = new Random();
    List<Integer> vals = new ArrayList<Integer>();
    
    for (int i=0; i<20; i++) {
      vals.add(rand.nextInt(123));
    }
    
    // System.out.println(binSearch(25, fin));
    Sort s1 = new Sort();
    int[] fin = vals.stream().mapToInt(i -> i).toArray();
    s1.selectionSort(fin);
    // insertionSort(fin);
    System.out.println(vals);
    for (int i=0; i<fin.length; i++) {
      System.out.print(fin[i] + " ");
    }
    
    // Collections.sort(vals); //merge-sort
    // System.out.println(vals.toString());
  }
}