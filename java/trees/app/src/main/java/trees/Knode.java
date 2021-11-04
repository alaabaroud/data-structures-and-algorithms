package trees;

import java.util.ArrayList;
import java.util.List;

public class Knode<T> {

  T value;
  List<Knode<T>> kChildren = new ArrayList<>();

  public Knode(T value) {
    this.value = value;

  }

  public List<Knode<T>> getkChlidren() {
    return kChildren;
  }
  public void add(Knode<T> node) {
    this.kChildren.add(node);
  }
}
