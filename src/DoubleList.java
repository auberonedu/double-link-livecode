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

  public int getFirst() {
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get first data of empty list");
    }

      return head.data;
  }

  public int getLast() {
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get last data of empty list");
    }

      return tail.data;
  }

  //add end list
  public void append(int data){
    Node newNode = new Node(data);

    if (head == null){
      head = newNode;
    } else{
      tail.next = newNode;
      newNode.prev = tail;
    }
  }

  //add beginning list
  public void prepend(int data){

  }

  //print every node in the list, seperated by spaces
  @Override
  public String toString() {
    return "To be implemented soon!";
  }
}