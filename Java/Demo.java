import java.io.*;
import java.util.*;

import com.google.caliper.Benchmark;
import com.google.caliper.runner.CaliperMain;


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

  public static void main(String[] args) throws IOException {
    // int[] fin = getData();

    CaliperMain.main(DemoBenchmark.class, args);

    // InsertionSort iSort = new InsertionSort();
    // SelectionSort sSort = new SelectionSort();
    // MergeSort mSort = new MergeSort();
    // QuickSort qSort = new QuickSort();
    // HeapSort hSort = new HeapSort();
    // ModernSort nSort = new ModernSort();

    // int[] fin1 = fin.clone();
    // int[] fin2 = fin.clone();
    // int[] fin00 = fin.clone();

    /* InsertionSort */
    // long startTime = System.nanoTime();
    // iSort.naive(fin1);
    // long endTime = System.nanoTime();
    // long duration = (endTime - startTime);
    // System.out.println("\nInsert: " + duration);

    /* Quicksort */    
    // startTime = System.nanoTime();
    // qSort.naive(fin2, 0, fin.length - 1);    
    // endTime = System.nanoTime();
    // duration = (endTime - startTime);
    // System.out.println("\nQuick : " + duration);

    /* Java built-in sorting methods */
    // startTime = System.nanoTime();
    // nSort.pSort(fin00); // Using Parallel sort
    // endTime = System.nanoTime();
    // duration = (endTime - startTime);
    // System.out.println("\npSort : " + duration);
  }

  @Benchmark
  void timeStringBuilder(int reps) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < reps; i++) {
      sb.setLength(0);
      sb.append("hello world");
    }
  }
}