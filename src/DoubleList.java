public class DoubleList {
  // private class is only visible inside the DoubleList class
  private class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
      this.data = data; //by default, next and prev are null
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

    if(head == null) {
      head = newNode;
    } else {
      tail.next = newNode; // if tail is null, this does nothing
      newNode.prev = tail;
    }
    tail = newNode; // tail is now the new node
  }



  public int getFirst() {
    if (head == null) { // list is empty
      throw new IndexOutOfBoundsException("Cannot get first data of empty list"); //throw exception
    } 
    return head.data; // return the data of the head node
  }


// Get the last data in the list
  public int getLast() {
    if (tail == null) { // list is empty
      throw new IndexOutOfBoundsException("Cannot get last data of empty list"); //throw exception
    } 
    return tail.data; // return the data of the tail node
  }

    // Add a new data to the beginning of the list
  public void prepend(int data) {

  }


  @Override
  public String toString() {
    // Print every node in the list, separated by spaces
    return "To be implemented soon!";
  }
}