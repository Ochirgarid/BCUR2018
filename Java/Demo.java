import java.io.*;
import java.util.*;

public class Demo {
  public static void main(String[] args) throws IOException {
    try (BufferedReader fin = new BufferedReader(new FileReader("../data.in"));
        PrintWriter fout = new PrintWriter("data.out");) {

      String line = null;
      while ((line = fin.readLine()) != null)
        System.out.println(line);
      
    }
  }
}