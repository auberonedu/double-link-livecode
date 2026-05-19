public class DoubleList {
  private class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
      this.data = data;
    }
  }

  private Node head;
  private Node tail;

  public DoubleList() {
    // head = null;
    // tail = null;
  }

  // add to end
  public void append(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
    }

    tail = newNode;
  }

  public int getFirst() {
    if (head == null) {
      throw new IndexOutOfBoundsException("Cannot get first data of empty list.");
    }

    return head.data;
  }

  // add to beginning
  public void prepend(int data) {
    Node newNode = new Node(data);

    if (tail == null) {
      tail = newNode;
    } else {
      head.prev = newNode;
      newNode.next = head;
    }

    head = newNode;
  }

  public int getLast() {
    if (tail == null) {
      throw new IndexOutOfBoundsException("Cannot get last data of empty list.");
    }

    return tail.data;
  }

  @Override
  public String toString() {
    // Print every node in the list, separated by spaces and commas
    return "To be implemented soon!";
  }
}