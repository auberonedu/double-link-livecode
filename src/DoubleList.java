public class DoubleList {

  private class Node{
    public Node next;
    public Node prev;
    public int data;

    public Node(int data){
      this.data = data;
    }
  }

  private Node head;
  private Node tail;

  public DoubleList() {
    // head = null;
    // tail = null;
  }

  //add new data to the end of the list
  public void append(int data){
    Node temp = new Node(data);
    if(head == null){
      head = temp;
    }else{
      tail.next = temp;
      temp.prev = tail;
    }
    tail = temp;
  }

  public int getFirst(){
    if(head == null){
      throw new IndexOutOfBoundsException("Cannot get first data of empty list");
    }
    return head.data;
  }

  public int getLast(){
    if(tail == null){
      throw new IndexOutOfBoundsException("Cannot get last data of empty list");
    }
    return tail.data;
  }

  //add new data to the beginning of the list
  public void prepend(int data){
    Node temp = new Node(data);
    if(tail == null){
      tail = temp;
    } else{
      head.prev = temp;
      temp.next = head;
    }
    head = temp;
  }

  //print every node in the list, seperated by spaces
  @Override
  public String toString() {
    String result = "";
    Node current = head;

    while(current != null){
      result += current.data + " ";
      current = current.next;
    }
    return result;
  }
}