import java.io.*;
import java.util.Random;

public class RandomNumGen {
  public int nums[];
  public java.io.PrintStream ouf;
  public File dstFile;

  public RandomNumGen(int seed, int length, int limit, String file) {
    nums = new int[length];
    dstFile = new File(file);
    Random rand = new Random();
    rand.setSeed(seed);

    for (int i = 0; i < length; i++) {
      nums[i] = rand.nextInt(limit);
    }
  }

  public void generate() {
    try {
      ouf = new java.io.PrintStream(dstFile);
      for (int i = 0; i < this.nums.length; i++) {
        ouf.println(this.nums[i]);
      }
      ouf.flush();
      ouf.close();
    } catch (Exception e) {
      System.out.println("IO error");
    }
  }
}