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
    // defualts too null
    // head = null;
    // tail = null;
  }

  // add new data to the end of the list
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
      throw new IndexOutOfBoundsException("Cannot get first data of an emtpy list.");
    }

    return head.data;
  }

  public int getLast() {
    if(head == null) {
      throw new IndexOutOfBoundsException("Cannot get last data of an emtpy list.");
    }

    return tail.data;
  }

  // add new data at the front of the list
  public void prePend(int data) {

  }

  @Override
  public String toString() {


    return "To be implemented soon!";
  }
}