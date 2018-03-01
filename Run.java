import java.io.*;

public class Run {
  public static void main(String[] args) {
    // int seed = Integer.parseInt(args[0]);
    // int length = Interer.parseInt(args[1]);
    // int limit = Integer.parseInt(args[2]);
    
    RandomNumGen r = new RandomNumGen(
      Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), "data.in");
    r.generate();
  }
}