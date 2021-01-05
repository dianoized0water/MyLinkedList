public class Node{
  private String data;
  private Node next, prev;

  public Node(int value, Node next, Node prev){
    data = value;
    this.next = next;
    this.prev = prev;
  }

  public int getValue(){
    return data;
  }

  public Node getNext(){
    return next;
  }

  public Node getPrev(){
    return prev;
  }

  public void setNext(Node newNode){
    next = newNode;
  }

  public void setValue(int newValue){
    data = newValue;
  }

  public void setPrev(Node newNode){
    prev = newNode;
  }
}
