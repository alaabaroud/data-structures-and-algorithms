package stackAndQueue.Animals;

public class Dog extends Animals {
  public Dog (String dogName){
    super(dogName);
  }


  @Override
  public String toString(){
    return getAnimalName();
  }
}
