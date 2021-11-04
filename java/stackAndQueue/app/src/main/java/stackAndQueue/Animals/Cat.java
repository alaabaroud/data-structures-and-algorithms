package stackAndQueue.Animals;

public class Cat extends Animals {
  public Cat (String catName){
    super(catName);
  }


  @Override
  public String toString(){
    return getAnimalName();
  }
}

