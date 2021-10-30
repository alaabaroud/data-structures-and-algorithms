package stackAndQueue;

public class Stack<T> {
  Node<T> top;

  public Stack(Node<T> top) {
    this.top = top;
  }

  public Stack() {

  }

  public void push(String value){
    if(isEmpty()){
      top = new Node<T> (value);

    }else {
      Node<T> node = new Node<T> (value);
      node.setNext(top);
      top = node;

    }
  }
  public String pop() {
    if (top == null){
      return "empty Stack";
    }else {
    String value = top.getValue();
      top = top.getNext();
      return value;
    }
  }

  public  String peek () {
    if ( isEmpty()) {
      return "empty Stack";
    }else{
      return top.getValue();
    }
  }

  public  boolean isEmpty() {
    return  top == null;
  }

  @Override
  public String toString() {
    if (top == null) return  "null";
    String List = "Top =";
    Node<T> current = top;
    while (current != null){
      List += current.value+ " = > ";
      current = current.next;
    }
    List+= "null";
    return List;
  }

}
