package stackAndQueue;

public class Brackets {
  public static boolean brackets(String bracketsString) {
    if (bracketsString.isEmpty()) return true;

    Stack<String> checkStack = new Stack<>();
    String[] checkArr = bracketsString.split("");
    for (String value: checkArr) {
      if ((value.equals("}") || value.equals("]") || value.equals(")")) && checkStack.isEmpty()) {
        return false;
      }
      if (value.equals("{") || value.equals("[") || value.equals("(")) {
        checkStack.push(value);
      } else if (value.equals("}")) {
        if (checkStack.top.value.equals("{")) checkStack.pop();
        else return false;


      } else if (value.equals(")")) {


        if (checkStack.top.value.equals("(")) checkStack.pop();
        else return false;
      } else if (value.equals("]")) {


        if (checkStack.top.value.equals("[")) checkStack.pop();
        else return false;
      }
    }
    return checkStack.isEmpty();
  }

}
