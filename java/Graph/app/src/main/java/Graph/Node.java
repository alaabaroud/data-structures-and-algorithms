package Graph;

import java.util.Objects;

public class Node <T> {
  public Node next;

  public T value;

  public Node() {}

  public Node(T value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Node<T> node = (Node<T>) obj;
    return Objects.equals(value, node.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return "" + value;
  }

}
