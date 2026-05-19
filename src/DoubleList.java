
public class DoubleList {
  
  private class Node{
    public int data;
    public Node next = null;
    public Node prev = null;
    
    public Node(int _data){
      this.data = _data;
    }
  }

  private int size = 0;
  private int capacity = 0;
  
  private Node head = null;
  private Node tail = null;

  public DoubleList() {
    capacity = 10;
  }

  public DoubleList(int _capacity) {
    capacity = _capacity;
  }

  public void append(int data){
    Node toAdd = new Node(data);
    size++;
    //check capacity
    head = head == null? toAdd : head;

    if(tail != null){
      tail.next = toAdd;
      toAdd.prev = tail;    
    }
    tail = toAdd;
  }
  public void prepend(int data){

  }
 
  public int getFirst(){
    if(head == null){ throw new IndexOutOfBoundsException("head null"); }
      return head.data;
  }
  
  public int getLast(){
    if(tail == null){ throw new IndexOutOfBoundsException("tail null");}
    return tail.data;
  }

  @Override
  public String toString() {
    // print all nodes in list separated by spaces
    String s = "";
    Node h = head;
    while(h != null) {
      s += h.data ;
      if(h != tail){
        s += ", ";
      }
      h = h.next;
    }
    return s;
  }
}

