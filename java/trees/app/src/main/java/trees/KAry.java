package trees;

import java.util.LinkedList;
import java.util.Queue;

public class KAry<T> {
  Knode<T> root;
  int k;


  public KAry(int max){
    if(max <=1) {
      max = 2;
    }
    this.k = max;
  }

  public void add(T value) {
    Knode<T> newNode = new Knode<>(value);
    if (this.root == null) {
      this.root = newNode;
      return;
    }
    Queue<Knode<T>> queueNodes = new LinkedList<>();
    queueNodes.add(root);
    while(!queueNodes.isEmpty()){
      Knode<T> current = queueNodes.poll();
      if(current.kChildren.size() < this.k){
        current.add(newNode);
        return;
      }
      else {
        queueNodes.addAll(current.kChildren);
      }
    }

  }


}
