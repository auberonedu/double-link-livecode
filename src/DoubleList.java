public class DoubleList {

  private class Node {
    public int data;
    public Node prev;
    public Node next;

  public Node (int data){
    this.data = data;
  }
  
}
  private Node head;
  private Node tail;


  public DoubleList() {

  }

  //add data to end of list
  public void append (int data){
    Node newNode = new Node(data);

    if (head == null){
    head = newNode;
    }else{
    tail.next = newNode;
    newNode.prev = tail;
    }
    tail = newNode;
  }

  public int getFirst(){
    if (head == null){
      throw new IndexOutOfBoundsException("Cannot get first data of an empty list");
    }
    return head.data;

  }

  
  public int getLast(){
    if (tail == null){
      throw new IndexOutOfBoundsException("Cannot get last data of an empty list");
    }
    return tail.data;

  }

  //add data to beginning of list 
  public void prepend (int data){
    Node newNode = new Node(data);

    if (head == null){
    head = newNode;
    }
    head.prev = newNode;
    newNode.next = head;

    head = newNode;
  }

  @Override
  public String toString() {
    //print every node separated by spaces
    return "To be implemented soon!";
  }
}