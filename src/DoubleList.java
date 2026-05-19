public class DoubleList {

  private class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
      this.data = data;
      this.next = null;
      this.prev = null;
  }
}

    private Node head;
    private Node tail;
 
  public DoubleList() {
    head = null;
    tail = null;



  }

  public void append(int data){ //add data to the tail
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
    }
    else {
    tail.next = newNode;
    newNode.prev = tail;
    }

    tail = newNode;


  }

  public int getFirst(){
    if(head == null){
      throw new IndexOutOfBoundsException("List is empty.");
    }

    return head.data;
  }

    public int getLast(){
    if(tail == null){
      throw new IndexOutOfBoundsException("Cannot get last data in list.");
    }

    return tail.data;
  }

  public void prepend(int data){ //add data to the beginning (head)
    Node newNode = new Node(data);
    if(tail == null){
      tail = newNode;
    }
    else{
    head.next = newNode;
    newNode.prev = head;
    }

    head = newNode;

  }


  @Override
  public String toString() {

    // Print every node in the list separated by spaces [x,y,z]
    return "To be implemented soon!";
  }
}