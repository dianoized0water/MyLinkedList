import java.util.*;

public class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node n = new Node(value);
    if (size==0){
      n.setNext(null);
      n.setPrev(null);
      size++;
      start = n;
      end = n;
      return true;
    }
    else{ //if no index specified, append to the end.
      n.setNext(null);
      n.setPrev(end);
      end.setNext(n);
      end = n;
      size++;
      return true;
    }
  }

  private Node getNode(int index){
    int i = 0;
    Node n = start;
    if (n!=null){
      while (i<index){
        n = n.getNext();
        i++;
      }
    }
    return n;
  }

  public boolean add(int index, String value){
    Node n = new Node(value);
    if (index==0){
      n.setNext(start);
      n.setPrev(null);
      start.setPrev(n);
      start = n;
      size++;
      return true;
    }
    if (index==size){
      add(value);
    }
    if (size==0){
      n.setNext(start);
      n.setPrev(null);
      start.setPrev(n);
      start = n;
      size++;
      return true;
    }
    else{
      n.setNext(getNode(index));
      n.setPrev(getNode(index-1));
      getNode(index).setPrev(n);
      getNode(index-1).setNext(n);
      size++;
      return true;
    }
  }

  public String get(int index){
    return getNode(index).getValue();
  }

  public String set(int index, String value){
    String original = getNode(index).getValue();
    getNode(index).setValue(value);
    return original;
  }

  public String toString(){
    String str = "";
    Node n = start;
    for (int i=0; i<size; i++){
      str += n.getValue();
      if(i.getNext()!=null){
        str +=", ";
      }
      n = n.getNext();
    }
    return str;
  }
}
