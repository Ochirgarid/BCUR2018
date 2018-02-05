import java.io.*;

public class Run {
  public static void main(String[] args) {
    RandomNumGen r = new RandomNumGen(11, 5, 100, "data.in");
    r.generate();
  }
}