import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyTestClass {
  @Test
  public void testAddition() {
    int result = Calculator.add(2, 3);
    assertEquals(5, result);
  }
}
