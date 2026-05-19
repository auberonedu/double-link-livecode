public class DoubleList {

  private class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
      this.data = data;
    }
  }
  private Node head;
  public Node tail;

  public DoubleList() {
    head = null;
    tail = null;

  }
  //add new data to the end of the list 
  public void append(int data){
    Node newNode = new Node(data);
    if (head == null){
      head = newNode;
  
    }else{
    tail.next = newNode;
    newNode.prev =tail;
    
  }
  tail = newNode;
  }

  public int getFirst(){
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get first data of empty list ");
      
    }
    return head.data;
  }
  public int getLast(){
    if(tail == null){
      throw new IndexOutOfBoundsException("Cannot get first data of empty list ");
      
    }
    return tail.data;
  }
// add new sata to beginging of list 
  public void prepend(int data){

  }

  //print ever node in list separated by spaces
  @Override
  public String toString() {
    return "To be implemented soon!";
  }
}