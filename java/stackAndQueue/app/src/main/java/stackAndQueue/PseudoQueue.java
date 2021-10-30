package stackAndQueue;

public class PseudoQueue {

  public Stack firstStack= new Stack();
  public Stack secondStack= new Stack();


  public void enqueue (String value) {
    firstStack.push( value);

  }

  public  String dequeue() {
    String returnValue = null;
    if(secondStack.isEmpty()) {
      while (!firstStack.isEmpty()){
        secondStack.push(firstStack.pop());
      }
      returnValue = secondStack.pop();
      while (!secondStack.isEmpty()){
        firstStack.push(secondStack.pop());
      }
    }
    return  returnValue;
  }

}
