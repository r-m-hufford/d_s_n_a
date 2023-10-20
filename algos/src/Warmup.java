import java.util.ArrayList;
import java.util.List;

public class Warmup {
  public static int add(int a, int b) {
    return a + b;
  }

  public static int simpleSumArray(List<Integer> ar) {
    var sum = 0;
    for (int i = 0; i < ar.size(); i++) {
      sum += ar.get(i);
    }
    return sum;
  }

  public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    List<Integer> scores = new ArrayList<>();

    int alice = 0;
    int bob = 0;

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        alice++;
      } else if (b.get(i) > a.get(i)) {
        bob++;
      }
    }
    scores.add(alice);
    scores.add(bob);

    return scores;
  }

  public static long aVeryBigSum(List<Long> ar) {
    long sum = ar.stream().reduce(0L, ((a, b) -> a + b));

    return sum;
  }
}
