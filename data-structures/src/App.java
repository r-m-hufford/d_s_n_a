public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    LinkedList linkedList = new LinkedList(5);
    linkedList.insert(6);
    linkedList.insert(7);
    linkedList.insert(8);
    linkedList.insert(9);
    System.out.println(linkedList.toString());

    linkedList.insertAt(3, 11);
    System.out.println(linkedList.toString());
  }
}