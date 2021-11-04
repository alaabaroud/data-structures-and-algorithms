package stackAndQueue.Animals;

import stackAndQueue.Queue;

public class AnimalShelter {

  public Queue catQueue = new Queue();
  public Queue dogQueue = new Queue();



  //////////////////////////////

  public void enqueue(Animals animals) {

    if (animals instanceof Cat){
      catQueue.enqueue(animals);
    }else if (animals instanceof Dog){
      dogQueue.enqueue(animals);
    }

  }

  public Object dequeue (String pref){
    if (pref.equals("cat")){
      return catQueue.dequeue();
    }else if (pref.equals("dog")){
      return dogQueue.dequeue();
    }
    return null;
  }

  @Override
  public String toString(){
    if (catQueue.isEmpty() && dogQueue.isEmpty()){
      return null;
    }

    return " Dog list => "+ dogQueue + "|||  Cat list => " + catQueue;
  }
}
