package stackAndQueue;

public class Node<T> {
  public String value;
  Node <T> next;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public Node (String value){
    this.value =value;
  }
}
