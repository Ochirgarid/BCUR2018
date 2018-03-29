import java.util.*;

public class Test {

  public static void main(String args[]) {
    Random rand = new Random();
    List<Integer> vals = new ArrayList<Integer>();
    int seed = 123;
    int range = 30;
    for (int i = 0; i < range; i++) {
      vals.add(rand.nextInt(seed));
    }
    
    int[] fin = vals.stream().mapToInt(i -> i).toArray();
    for (int i = 0; i < fin.length; i++) {
      System.out.print(fin[i] + " ");
    }

    // SelectionSort sort = new SelectionSort();
    // BubbleSort bSort = new BubbleSort();
    InsertionSort iSort = new InsertionSort();

    /* Timing */
    long startTime = System.nanoTime();
    iSort.naive(fin);
    long endTime = System.nanoTime();
    long duration = (endTime - startTime);
    System.out.println("\nTook: " + duration);


    /* Showing the result */
    System.out.println(" ");
    for (int i=0; i<fin.length; i++) {
      System.out.print(fin[i] + " ");
    }
    System.out.println(" ");
    
    /* Java built-in sorting methods */
    // Collections.sort(vals); //merge-sort
    // System.out.println(vals.toString());
  }
}