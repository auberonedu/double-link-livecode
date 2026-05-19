public class DoubleList {
  private class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
      this.data = data;
    }
  }

  private Node head;
  private Node tail;

  public DoubleList() {

  }

  public void append(int data) {
    Node newNode = new Node(data);

    if(head == null) head = newNode;
    else {
      //merrying the nodes
      tail.next = newNode;
      newNode.prev = tail;
    }
    tail = newNode;
  }

  public void prepend(int data){
    Node newHead = new Node(data);

    if(head == null) {
      head = newHead;
      tail = newHead;
    }
    newHead.next = head;
    head.prev = newHead;
    head = newHead;
  }

  public int getFirst(){
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get first data of an empty list");
    }
    return head.data;
  }
  public int getLast(){
    if(tail == null){
      throw new IndexOutOfBoundsException("Cannot get last data of an empty list");
    }
    return tail.data;
  }

  @Override
  public String toString() {
    return "To be implemented soon!";
  }
}