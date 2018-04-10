import java.util.*;

public class Test {

  public static void main(String args[]) {
    Random rand = new Random();
    List<Integer> vals = new ArrayList<Integer>();
    int seed = 123;
    int range = 70;
    for (int i = 0; i < range; i++) {
      vals.add(rand.nextInt(seed));
    }

    int[] fin = vals.stream().mapToInt(i -> i).toArray();
    int[] fin1 = fin.clone();
    int[] fin2 = fin.clone();    
    int[] fin3 = fin.clone();        
    int[] fin4 = fin.clone();

    int[] fin0 = fin.clone();
    int[] fin01 = fin.clone();
    int[] fin02 = fin.clone();
    int[] fin03 = fin.clone();

    // BubbleSort bSort = new BubbleSort();
    InsertionSort iSort = new InsertionSort();
    SelectionSort sSort = new SelectionSort();
    MergeSort mSort = new MergeSort();
    QuickSort qSort = new QuickSort();
    HeapSort hSort = new HeapSort();
    ModernSort nSort = new ModernSort();

    /* Timing */

    /* InsertionSort */    
    long startTime = System.nanoTime();
    iSort.naive(fin);
    long endTime = System.nanoTime();    
    long duration = (endTime - startTime);
    System.out.println("\nInsertion Took: " + duration);

    // /* SelectionSort */
    // startTime = System.nanoTime();
    // sSort.naive(fin1);
    // endTime = System.nanoTime();
    // duration = (endTime - startTime);
    // System.out.println("\nSelection Took: " + duration);
    
    // /* MergeSort */    
    // startTime = System.nanoTime();
    // mSort.naive(fin2);
    // endTime = System.nanoTime();
    // duration = (endTime - startTime);
    // System.out.println("\nMerge Took: " + duration);
    
    // /* Quicksort */    
    // startTime = System.nanoTime();
    // qSort.naive(fin3, 0, fin.length - 1);    
    // endTime = System.nanoTime();
    // duration = (endTime - startTime);
    // System.out.println("\nQuick Took: " + duration);

    /* Heapsort */    
    // startTime = System.nanoTime();
    // hSort.naive(fin4);
    // endTime = System.nanoTime();
    // duration = (endTime - startTime);
    // System.out.println("\nHeap Took: " + duration);

    // /* Java built-in sorting methods */
    startTime = System.nanoTime();
    Collections.sort(vals); //merge-sort
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println("\nCollection Took: " + duration);

    startTime = System.nanoTime();
    Arrays.sort(fin0); //quick-sort
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println("\nArrays Took: " + duration);

    startTime = System.nanoTime();
    /* Using sort with Comparator */  
    nSort.sort1(fin01);
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println("\nsort1 Took: " + duration);

    startTime = System.nanoTime();
    /* Using Parallel sort  */
    nSort.pSort(fin02);
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println("\npSort Took: " + duration);

    
    startTime = System.nanoTime();
    /* Using Lambda with sort  */
    nSort.sort2(fin03);
    endTime = System.nanoTime();
    duration = (endTime - startTime);
    System.out.println("\nsort2 Took: " + duration);
    
    /* Showing the result */
    System.out.println("______ Result ______");
    for (int i = 0; i < fin.length; i++) {
      System.out.print(fin[i] + " ");
    }
    System.out.println(" ");
  }
}