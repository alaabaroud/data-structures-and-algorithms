package stackAndQueue;

public class Queue {

  Node front;
  Node rear;

  public Queue(Node front, Node rear) {
    this.front = front;
    this.rear = rear;
  }

  public Queue() {

  }


  public  void enqueue (String value){
    if(isEmpty()) {
      Node node = new Node (value);
      front = node;
      rear =node;
    }else{
      Node node = new Node(value);
      rear.setNext(node);
      rear = node;
    }
  }

  public String dequeue() {
    if(isEmpty()){
      return "empty";
    }else{
      String value = front.getValue();
      front = front.getNext();
      return value;
    }
  }
  public String peek() {
    if(isEmpty()){
      return "empty";
    }else {
      return front.getValue();
    }
  }

  public  boolean isEmpty(){
    return(front == null);

  }

//  @Override
//  public String toString() {
//    return "Queue{" +
//      "front=" + front +
//      ", rear=" + rear +
//      '}';
//
//
//  }

}

