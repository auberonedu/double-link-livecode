public class DoubleList {

  private class Node {
    public int dat;
    public Node nxt;
    public Node prv;

    public Node(int dat) {
      this.dat = dat;
    }
  }

  private Node head;
  private Node tail;

  public DoubleList() {
    this.head = null;
    this.tail = null;
  }

  public void append(int dat) {
    Node newNode = new Node(dat);

    if (head == null) {
      head = newNode;
    } else {
      tail.nxt = newNode;
      newNode.prv = tail;
    }

    tail = newNode;
  }

  public int getFirst() {
    if (head == null) { throw new IndexOutOfBoundsException("Node in null list does not exist."); }
    return head.dat;
  }

  public int getLast() {
    if (head == null) {
      throw new IndexOutOfBoundsException("Node in null list does not exist.");
    }

    return tail.dat;
  }

  public void prepend(int dat) {
    
  }

  @Override
  public String toString() {
    // print everything in the list, seperated by spaces
    String output = "";
    Node curr = head;
    while (curr != null) {
      output = output + curr.dat + " ";
      curr = curr.nxt;
    }
    return output;
  }
}