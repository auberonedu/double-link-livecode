public class DoubleList {
  private class Node {
    public int data;
    public Node prev;
    public Node next;

    public Node (int data) {
      this.data = data;
    }
  }
    private Node head;
    private Node tail;

    public DoubleList() {
      // head = null;
      // tail = null;
    }

    // Add a new data to the end of the list
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

    // Add new data to beginning of list
    public void prepend (int data) {

    }

    public int getFirst() {
      if (head == null) {
        throw new IndexOutOfBoundsException("Cannot get first data of empty list");
      }
      return head.data;
    }

    public int getLast() {
      if (tail == null) {
        throw new IndexOutOfBoundsException("Cannot get last data of empty list");
      }
      return tail.data;
    }
  
  @Override
  public String toString() {
    //Print every node in the list, separated by spaces
    Node current = head;
    String result = "";
    while (current != null) {
      result = (current + " ");
    }
    
    return result;
  }
}
