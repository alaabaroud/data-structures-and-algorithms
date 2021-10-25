package StackQueue;

public class Stack{
  private Npde top;

  public Stack (Node top) {
    this.top = top;



    public void push(String value){
      if(isEmpty()){
        Node node= new Node(value);
        top= node;
      }else{
        Node node= new Node(value);
        node.setNext(top);
        top= node;
      }
    }

    public String pop(){
      if (isEmpty()){
        throw new IllegalArgumentException("its Empty");
      }else {
        String data = top.getData();
        top = top.getNext();
        return data;
      }
    }
    public String peek(){
      if(isEmpty()){
        throw new IllegalArgumentException("Empty");
      }else {
//            Node node= new Node(top.getData());
        return top.getData();
      }
    }
    public boolean isEmpty(){
      return top==null;
    }


  }
}
