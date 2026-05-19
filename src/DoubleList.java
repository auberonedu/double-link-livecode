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

  }

  // Add new data to the end of the list
  public void append(int data) {
    Node newNode = new Node(data);
    if (tail == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
    }
  }

  public int getFirst() {
    if (head == null) throw new IndexOutOfBoundsException("Cannot get data from empty list.");
    return head.data;
  }

  public int getLast() {
    if (tail == null) throw new IndexOutOfBoundsException("Cannot get data from empty list.");
    return head.data;
  }

  // Add new data to the beginning of the list
  public void prepend(int data) {

  }

  @Override
  public String toString() {
    // Print every node in the list, seperate by " "
    return "To be implemented soon!";
  }
}