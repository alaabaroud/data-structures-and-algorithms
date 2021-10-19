package linked.list;


import java.util.*;


public class LinkedList <T>{
    Node<T> head;

    public LinkedList(){
        this.head = null;

    }

    public void insert (T value){
    Node<T> newNode = new Node<T>(value);
    newNode.next = head;
    head = newNode;
    }

    boolean includes(T value){
        Node<T> current = head;
        while (current != null){
        if (current.value.equals(value)){
             return true;

        }
    current = current.next;
    }
    return false;
    }


    public String toString(){
        Node<T> current = head;
        String result ="";
        while (current != null){
            result+=" {"+current.value+ "} --->";
            current =current.next;
        }
//         result+="NULL";
        return result;
    }

    public void append(T value){
        Node<T> newNode = new Node<>(value);
if (head == null) {
    head = newNode;
}else {
    Node<T> current = head;
    while (current.next !=null){

        current = current.next;
    }
    current.next= newNode;
}
}


public void insertBefore (T value, T newValue){
    Node<T> newNode = new Node<>(newValue);
    if (head== null) {
        head = newNode;

    }else if (head.value == value){
        Node<T> rightNode = head;
        head=newNode;
        newNode.next = rightNode;

    }else {
        Node<T> current= head;
        while (current.next != null) {
            if (current.next.value == value) {
                Node<T> righNode= current.next;
                current.next = newNode;
                newNode.next = righNode;
            }
            current=current.next;
        }
    }


}

public void insertAfter(T value, int newValue) {
Node<T> newNode = new Node(newValue);
if (head == null){
    head= newNode;

}else {
    Node<T> current = head;
    while (current!= null){
        if (current.value== value) {
            Node<T> rightNode = current.next;
            current.next = newNode;
            newNode.next = rightNode;
        }
        current = current.next;
    }
}

}

public String kth (int K) {
    Node <T> current = head;
    int counter =0;
    while(current.next != null) {
        current = current.next;
        counter++;
    }
if ( K > counter || K <0){
    return "error";

}else{
    current =head;
    for (int i = 0; i <= counter-K; i++) {
        if (i== counter - K) {
            return  ""+current.value+"" ;
        }
        current = current.next;
    }
}
return "";

}

public LinkedList<T> zip( LinkedList<T> listA, LinkedList<T> listB){
Node<T> currentListA = listA.head;
Node<T> currentListB = listB.head;
if (currentListA == null) {
    insert(currentListB.value);
}else if (currentListB==null){
    insert(currentListA.value);
}else if (currentListA != null && currentListB != null  ) {
    listB.insertBefore(currentListA.value, currentListB.value);
    currentListB = currentListB.next;
    currentListA = currentListA.next;

} else if (currentListA!= null){
    listB.append(currentListA.value);
}
listA.head = currentListA;
    return listB;
}




}
