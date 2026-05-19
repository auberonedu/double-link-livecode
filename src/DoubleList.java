public class DoubleList {

  //allowed to have private class inside class
// only able to access within doubly linked list
  private class Node {
    //instance variables
    public int data;
    public Node next;
    public Node prev;


    //constructor 
    public Node(int data){
      this.data = data;
    }
  }

  //instance variable on the double list
  private Node head;
  private Node tail;


  //constructor
  public DoubleList() {
    //instance variables dont need this because it knows its head
    // head = null;
    // tail = null;

  }

  //append add something to end
  //add a new data to the end of the list
  public void append(int data){
    //not a static method , its an instance method 
    Node newNode = new Node(data);

    if(head == null){
       head = newNode;
    } else {
    tail.next = newNode;
    //tail has not been updated so thats why prev points to old tail
    newNode.prev = tail;
    }
    tail = newNode;
  
  }

  //get first 
  public int getFirst(){
    //returns first piece of info
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get first data of empty list");
    }
    //return head the first node
    return head.data;
  }

  //get last
  public int getLast(){
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get last data of empty list");
    }
    //return tail the last node
    return tail.data;
  }

  //add new data to beginning of list
  public void prepend(int data){

    

  }

  @Override
  //tostrong method
  public String toString() {
    //print every node in this list , seperated by spaces
    return "To be implemented soon!";
  }
}