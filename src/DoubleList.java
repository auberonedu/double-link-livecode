public class DoubleList {

  private class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  private Node head;
  private Node tail;

  public DoubleList() {

  }

  //add new data to end of the list
  public void append(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
    }
    tail = newNode;
  }

  public int getFirst() {
    if(head == null) {
      throw new IndexOutOfBoundsException("List is empty");
    }
    return head.data;
  }

  public int getLast() {
    if(tail == null) {
      throw new IndexOutOfBoundsException("List is empty");
    }
    return tail.data;
  }

  //Put somethning in beginning of the list
  public void prepend(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  @Override
  public String toString() {
    //Print every node in list separated by spaces 
    return "";
  }
}