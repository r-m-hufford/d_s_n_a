public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    LinkedList linkedList = new LinkedList();
    linkedList.insert(20);
    linkedList.insert(4);
    linkedList.insert(7);
    linkedList.insert(2);
    linkedList.insert(13);
    linkedList.insert(3);
    System.out.println(linkedList.toString());

    LinkedList lunkedLerst = new LinkedList();
    lunkedLerst.insert(6);
    lunkedLerst.insert(41);
    lunkedLerst.insert(1);
    lunkedLerst.insert(12);
    lunkedLerst.insert(9);
    System.out.println(lunkedLerst.toString());

    linkedList.mergeLists(lunkedLerst);
    System.out.println(linkedList.toString());
  }
}