import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    int addUp = Warmup.add(2, 2);
    System.out.println(addUp);

    List<Integer> saslist = new ArrayList<>();
    saslist.add(1);
    saslist.add(1);
    saslist.add(1);
    saslist.add(1);
    int sas = Warmup.simpleSumArray(saslist);
    System.out.println(sas);
  }
}
