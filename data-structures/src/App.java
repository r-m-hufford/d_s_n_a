public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    LinkedList linkedList = new LinkedList(5);
    linkedList.add(6);
    linkedList.add(7);
    linkedList.add(8);
    System.out.println(linkedList.toString());
    boolean result = linkedList.contains(8);
    boolean reresult = linkedList.contains(9);
    System.out.println(result);
    System.out.println(reresult);

    System.out.println("get");
    int got = linkedList.get(2);
    System.out.println(got);
  }
}

// 8:18