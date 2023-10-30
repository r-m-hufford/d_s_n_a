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

  public LinkedList() {
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
    this.checkBounds(index);
    Node node = new Node(data);
    Node initialNode = this.head;
    int counter = 0;

    if (index == 0) {
      this.insertAtHead(data);
    } else if (index == this.size) {
      this.insert(data);
    } else {
      while (initialNode != null) {
        if (counter == index - 1) {
          node.next = initialNode.next;
          initialNode.next = node;
          this.size++;
          break;
        } else {
          initialNode = initialNode.next;
          counter++;
        }
      }
    }
  }

  // DELETION
  public void clear() {
    Node current = this.head;
    Node next = current.next;

    while (current != null) {
      next = current.next;
      current.next = null;
      current = next;
    }

    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void deleteNode(int index) {
    this.checkBounds(index);
    Node initialNode = this.head;
    int counter = 0;

    if (index == 0) {
      this.head = this.head.next;
      initialNode.next = null;
    } else {
      while (initialNode != null) {
        if (counter == index - 1) {
          Node delete = initialNode.next;
          initialNode.next = initialNode.next.next;
          delete.next = null;
          this.size--;
          break;
        } else {
          initialNode = initialNode.next;
          counter++;
        }
      }
    }
  }

  // TRAVERSAL
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

  public int getFirst() {
    return this.head.data;
  }

  public int getLast() {
    return this.tail.data;
  }

  public int get(int index) {
    this.checkBounds(index);

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

  // SIZE CHECKS
  public int size() {
    return this.size;
  }

  public boolean isEmpty() {
    if (size == 0)
      return true;
    return false;
  }

  // UPDATE
  public void update(int index, int data) {
    this.checkBounds(index);

    Node initialNode = this.head;
    int counter = 0;

    if (index == 0) {
      this.head.data = this.head.data;
    } else {
      while (initialNode != null) {
        if (counter == index) {
          initialNode.data = data;
          break;
        } else {
          initialNode = initialNode.next;
          counter++;
        }
      }
    }
  }

  // REVERSAL
  public void reverse() {
    Node current = this.head;
    Node previous = null;
    Node next = null;

    while (current != null) {
      next = current.next;
      current.next = previous;

      previous = current;
      current = next;
    }

    this.head = previous;
  }

  // SORT - merge sort
  public LinkedList sort() {
    if (this.size == 1) {
      return this;
    }

    Node middle = findMiddle(this.head);

    Node leftHead = this.head;
    Node rightHead = middle;

    LinkedList left = new LinkedList();
    left.head = leftHead;
    left.size = calculateSize(leftHead);

    LinkedList right = new LinkedList();
    right.head = rightHead;
    right.size = calculateSize(rightHead);

    LinkedList sorted = new LinkedList(0);

    if (l.data <= r.data) {
      sorted.insert(l.data);
    } else {
      sorted.insert(r.data);
    }
    System.out.println(sorted);

    System.out.println(middle.data);
    System.out.println(end.data);
    return this;
  }

  // HELPERS
  private void checkBounds(int index) {
    if (index > this.size) {
      throw new Error("requested index is out of bounds");
    }
  }

  private Node findMiddle(Node head) {
    if (head == null) {
      return null;
    }

    Node slow = head;
    Node fast = head;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }

  private int calculateSize(Node head, Node tail) {
    return -1;
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

}
