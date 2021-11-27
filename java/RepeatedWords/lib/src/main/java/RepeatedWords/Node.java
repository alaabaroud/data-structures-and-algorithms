package RepeatedWords;


  public class Node <F,J>{
    public F getKey() {
      return key;
    }

    public void setKey(F key) {
      this.key = key;
    }

    public J getValue() {
      return value;
    }

    public void setValue(J value) {
      this.value = value;
    }

    public int getHashCode() {
      return hashCode;
    }

    public Node<F, J> getNext() {
      return next;
    }

    public void setNext(Node<F, J> next) {
      this.next = next;
    }

    F key;
    public J value;
    final int hashCode;
    public Node<F,J> next;

    public Node(F key, J value, int hashCode) {
      this.key = key;
      this.value = value;
      this.hashCode = hashCode;
    }
  }

