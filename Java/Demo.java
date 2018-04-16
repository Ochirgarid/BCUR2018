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
  static int[] fin;
  static int[] tc;

  public static void main(String[] args) throws IOException {
    fin = getData();
    tc = fin.clone();

    // InsertionSort iSort = new InsertionSort();
    // SelectionSort sSort = new SelectionSort();
    // MergeSort mSort = new MergeSort();
    // QuickSort qSort = new QuickSort();
    HeapSort hSort = new HeapSort();
    // ModernSort newSort = new ModernSort();

    /* Benchmarking */
    startTime = System.nanoTime();
    
    /* InsertionSort */
    // iSort.naive(tc);

    /* SelectionSort */
    // sSort.naive(tc);

    /* MergeSort */
    // mSort.naive(tc);

    /* QuickSort */
    // qSort.naive(tc, 0, tc.length - 1);

    /* HeapSort */
    hSort.naive(tc);
    // hSort.buildMax(tc);

    /* Java built-in sorting methods */
    // newSort.pSort(tc); // Using Parallel sort
    // newSort.sort1(tc); // Using sort with Comparator
    // newSort.sort2(tc); // Using Lambda with sort
    // Arrays.sort(tc); //Built-in quick-sort

    endTime = System.nanoTime();
    duration = (endTime - startTime);
    seconds = (double) duration / secondsPrecision;
    System.out.println("\nTime elapsed: " + seconds + " seconds");
    // System.out.println("\nInputs: " + fin.length);

    Arrays.sort(fin); //Built-in quick-sort    
    for (int i=0; i<fin.length; i++) {
      if (fin[i] != tc[i]) {
        System.out.println("Sorting is incorrect at" + i);  
        break;
      }
    }
    System.out.println("Successful sort :D");
  }
}