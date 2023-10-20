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

  public static int diagonalDifference(List<List<Integer>> arr) {
    int diag1 = 0;
    int diag2 = 0;

    for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
      List<Integer> currentArray = arr.get(i);
      diag1 += currentArray.get(i);
      diag2 += currentArray.get(j);
    }
    return Math.abs(diag1 - diag2);
  }

  public static double[] plusMinus(List<Integer> arr) {
    double len = arr.size();
    double posCount = 0;
    double negCount = 0;
    double zeroCount = 0;

    for (int i = 0; i < len; i++) {
      if (arr.get(i) > 0) {
        posCount++;
      } else if (arr.get(i) < 0) {
        negCount++;
      } else {
        zeroCount++;
      }
    }

    double[] dbls = { posCount, negCount, zeroCount };

    return dbls;
  }
}
