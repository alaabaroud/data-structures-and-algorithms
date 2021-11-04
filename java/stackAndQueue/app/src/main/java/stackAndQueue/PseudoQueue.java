package stackAndQueue;

public class PseudoQueue <T> {
  public Stack<T> stackOne = new Stack<T>();
  public Stack<T> stackTwo = new Stack<T>();


  public void enqueue(T value){
    stackOne.push(value);
  }
  public T dequeue(){
    T returnValue = null;
    if (stackTwo.isEmpty()){
      while (!stackOne.isEmpty()){
        stackTwo.push(stackOne.pop());
      }
      returnValue=stackTwo.pop();
      while (!stackTwo.isEmpty()){
        stackOne.push(stackTwo.pop());
      }
    }
    return returnValue;
  }
}
