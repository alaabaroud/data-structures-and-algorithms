package stack.and.queue;

import java.io.*;
// java.util.Stack;
import java.util.*;

public class Stack {
private Node top;
// private int [] stackArray;

public Stack(){
}


public void push (String value) {
  if (isEmpty()) {
    Node node = new Node(value);
    top =node;
    
  }else {
    Node node = new Node(value);
    node.setNext(top);
    top = node;

  }
}

public String pop() {
  if (isEmpty()){
    throw new IllegalArgumentException("Empty");
}else {
    String data = top.getData();
    top = top.getNext();
    return data;
}
}


public String peek() {
  if(isEmpty()){
    throw new IllegalArgumentException("Empty");
}else {
  return top.getData();
}
}



private boolean isEmpty() {
  return false;
}
}
 


  

  
