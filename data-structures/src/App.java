public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    LinkedList linkedList = new LinkedList(5);
    linkedList.insert(15);
    linkedList.insert(10);
    linkedList.insert(5);
    linkedList.insert(20);
    linkedList.insert(3);
    linkedList.insert(2);
    System.out.println(linkedList.toString());

    linkedList.sort();
    System.out.println(linkedList.toString());
  }
}