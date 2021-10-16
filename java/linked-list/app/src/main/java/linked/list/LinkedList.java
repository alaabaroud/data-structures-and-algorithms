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
            result+="{"+current.value+ "} --->";
            current =current.next;
        }
        result+="NULL";
        return result;
    }
}
