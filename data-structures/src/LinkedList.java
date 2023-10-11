public class LinkedList {
  private Node head;
  private Node tail;

  private class Node {
    public int data;
    public Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public LinkedList(int data) {
    this.head = new Node(data);
    this.tail = head;
  }

  public void add(int data) {
    Node node = new Node(data);
    tail.next = node;
    tail = node;
  }

  public void print() {
    Node node = this.head;
    while (node != null) {
      System.out.println(node.data);
      node = node.next;
    }
  }

  public String toString() {
    Node node = this.head;
    String list = "";
    while (node != null) {
      list += node.data;
      node = node.next;
    }
    return list;
  }

  public boolean contains(int data) {
    Node node = this.head;
    while (node != null) {
      if (node.data == data) {
        return true;
      }
      node = node.next;
    }
    return false;
  }

  // get(index)
  // traverse from start to count
  public int get(int index) {
    if (index == 0) {
      return head.data;
    } else {
      Node node = this.head;
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
      return node.data;
    }
  }

  public int getFirst() {
    return this.head.data;
  }

  public int getLast() {
    return this.tail.data;
  }

  public void clear() {
    Node currentNode = this.head;

    while (currentNode != null) {
      // store current node.net
      // delete current node .data and .next
    }
  }

  // getfirst

  // getlast

  // index of(value)
  // loop throgh and find value
}
