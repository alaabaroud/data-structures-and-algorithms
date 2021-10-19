package linked.list;


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

}
