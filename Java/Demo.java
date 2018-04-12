import java.io.*;
import java.util.*;

public class Demo {
  public static int[] getData() throws IOException {
    try (BufferedReader rin = new BufferedReader(new FileReader("../data.in"));
    // PrintWriter fout = new PrintWriter("../data.out");
    ) {
      String line = null;
      List<Integer> ins = new ArrayList<Integer>();
      while ((line = rin.readLine()) != null)
        ins.add(Integer.parseInt(line));

      int[] fin = ins.stream().mapToInt(i -> i).toArray();
      return fin;
    }
  }

  static long startTime;
  static long endTime;
  static long duration;
  static final double secondsPrecision = 1000000000.0;
  static double seconds;

  public static void main(String[] args) throws IOException {
    int[] fin = getData();

    InsertionSort iSort = new InsertionSort();
    SelectionSort sSort = new SelectionSort();
    MergeSort mSort = new MergeSort();
    QuickSort qSort = new QuickSort();
    HeapSort hSort = new HeapSort();
    ModernSort newSort = new ModernSort();

    int[] tc1 = fin.clone();
    int[] tc2 = fin.clone();
    int[] tc3 = fin.clone();
    int[] tc4 = fin.clone();
    int[] tc5 = fin.clone();

    int[] tc00 = fin.clone();
    int[] tc01 = fin.clone();
    int[] tc02 = fin.clone();
    int[] tc03 = fin.clone();

    /* Benchmarking */
    startTime = System.nanoTime();
    
    /* InsertionSort */
    // iSort.naive(tc1);

    /* SelectionSort */
    // sSort.naive(tc2);

    /* MergeSort */
    // mSort.naive(tc3);

    /* QuickSort */
    // qSort.naive(tc4, 0, fin.length - 1);

    /* HeapSort */
    // hSort.naive(tc5);

    /* Java built-in sorting methods */
    newSort.pSort(tc00); // Using Parallel sort
    // newSort.sort1(tc01); // Using sort with Comparator
    // newSort.sort2(tc02); // Using Lambda with sort
    // Arrays.sort(tc03); //Built-in quick-sort

    endTime = System.nanoTime();
    duration = (endTime - startTime);
    seconds = (double) duration / secondsPrecision;
    System.out.println("\nTime elapsed: " + seconds + " seconds");
  }
}