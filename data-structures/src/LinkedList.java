public class LinkedList {
  private Node head;
  private Node tail;
  private int size;

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
    this.size = 1;
  }

  // INSERTION
  public void insert(int data) {
    Node node = new Node(data);
    tail.next = node;
    tail = node;
    this.size++;
  }

  public void insertAtHead(int data) {
    Node node = new Node(data);
    node.next = this.head;
    this.head = node;
    this.size++;
  }

  public void insertAt(int index, int data) {
    Node node = new Node(data);
    Node originalNode = this.head;
    int counter = 0;

    if (index == 0) {
      this.insertAtHead(data);
      return;
    }

    if (index == this.size) {
      this.insert(data);
      return;
    }

    while (originalNode != null) {
      if (counter == index - 1) {
        node.next = originalNode.next;
        originalNode.next = node;
        this.size++;
        break;
      } else {
        originalNode = originalNode.next;
        counter++;
      }
    }
    return;
  }

  // DELETION
  public void clear() {
    Node currentNode = this.head;

    while (currentNode != null) {
      // store current node.net
      // delete current node .data and .next
    }
  }

  public void deleteNode(int index) {
  }

  // TRAVERSAL

  public int size() {
    return 0;
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

  public int indexOf(int value) {
    Node node = this.head;
    int count = 0;
    while (node != null) {
      if (node.data == value) {
        return count;
      }
      count++;
      node = node.next;
    }

    return -1;
  }
}
