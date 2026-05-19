public class DoubleList {
  private Node head;
  private Node tail;
  private class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
      this.data= data;
    }
  }
  public DoubleList() {
      head=null;
      tail=null;
  }
  //adds to end of list
  public void append(int data){
    Node newNode= new Node(data);
    if(head==null){
      head=newNode;
    }
    else{
      tail.next=newNode;
      newNode.prev=tail;  
    }
    tail=newNode;
  }
  public int getFirst(){
    if (head==null){
      throw new IndexOutOfBoundsException("Cannot get first data of an empty list");
    }
    return head.data;
  }

  public int getLast() {
    if (tail == null) {
      throw new IndexOutOfBoundsException("Cannot get last data of an empty list");
    }
    return tail.data;
  }

  //adds to begining of list
  public void prepend(int data){
    Node newNode = new Node(data);
    if (head == null) {
      tail = newNode;
    }
    else{
      head.prev=newNode;
      newNode.next=head;
      
    }
    head=newNode;

  }

  @Override
  public String toString() {
    //print all nodes
    String nodes ="";
    Node current=head;
    
    return "To be implemented soon!";
  }
}