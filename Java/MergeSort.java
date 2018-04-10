import java.util.ArrayList;
import java.util.List;

public class MergeSort {
  public void naive(int[] fin) {
    if (fin.length <= 1)
      return;
    int midInd = fin.length / 2 + fin.length % 2;
    int[] lowerHalf = new int[midInd];
    int[] upperHalf = new int[fin.length - midInd];

    split(fin, lowerHalf, upperHalf);
    naive(lowerHalf);
    naive(upperHalf);

    merge(fin, lowerHalf, upperHalf);
  }

  public void split(int[] fin, int[] lowerHalf, int[] upperHalf) {
    int ind = 0;
    int lowerInd = lowerHalf.length;
    for (int elm : fin) {
      if (ind < lowerInd)
        lowerHalf[ind] = fin[ind];
      else
        upperHalf[ind - lowerInd] = fin[ind];
      ind++;
    }
  }

  public void merge(int[] fin, int[] lowerHalf, int[] upperHalf) {
    int mergeInd = 0;
    int lowerHalfInd = 0;
    int upperHalfInd = 0;

    while (lowerHalfInd < lowerHalf.length && upperHalfInd < upperHalf.length) {
      if (lowerHalf[lowerHalfInd] < upperHalf[upperHalfInd]) {
        fin[mergeInd] = lowerHalf[lowerHalfInd];
        lowerHalfInd++;
      } else if (upperHalfInd < upperHalf.length) {
        fin[mergeInd] = upperHalf[upperHalfInd];
        upperHalfInd++;
      }
      mergeInd++;
    }

    if (lowerHalfInd < lowerHalf.length) {
      while (mergeInd < fin.length) {
        fin[mergeInd++] = lowerHalf[lowerHalfInd++];
      }
    }
    if (upperHalfInd < upperHalf.length) {
      while (mergeInd < fin.length) {
        fin[mergeInd++] = upperHalf[upperHalfInd++];
      }
    }
  }

  public List<Integer> mergeL(List<Integer> lowerHalf, List<Integer> upperHalf, List<Integer> accumulator) {
    if (lowerHalf.isEmpty()) {
      accumulator.addAll(upperHalf);
    } else if (upperHalf.isEmpty()) {
      accumulator.addAll(lowerHalf);
    } else {
      if (lowerHalf.get(0) <= upperHalf.get(0)) {
        accumulator.add(lowerHalf.get(0));
        return mergeL(lowerHalf.subList(1, lowerHalf.size()), upperHalf, accumulator);
      } else {
        accumulator.add(upperHalf.get(0));
        return mergeL(lowerHalf, upperHalf.subList(1, upperHalf.size()), accumulator);
      }
    }
    return accumulator;
  }

  public List<Integer> mergeSort(List<Integer> fin) {
    int mid = fin.size() / 2;
    if (mid == 0)
      return fin;
    return mergeL(mergeSort(fin.subList(0, mid)), mergeSort(fin.subList(mid, fin.size())), new ArrayList<Integer>());
  }
}