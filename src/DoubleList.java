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
    head = null;
    tail = null;

  }

  // add new data to end of list
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
      throw new IndexOutOfBoundsException("Cannot get first data of empty list");
    }

    return head.data;
  }

    public int getLast() {
    if (head == null) {
      throw new IndexOutOfBoundsException("Cannot get first data of empty list");
    }

    return tail.data;
  }

  // add new data to beginning of list
  public void prepend(int data) {
     Node newNode = new Node(data);

    if (head == null) {
      tail = newNode;
    } else {
      head.prev = newNode;
      newNode.next = head;
    }
    
    head = newNode;
  }

  @Override
  public String toString() {
    // print every node in the list separated by spaces
    return "To be implemented soon!";
  }
}