package Lists;
import TestList.Node;
public class LinkedList <T> implements List{
    private Node<T> head;
    private Node<T> tail;
    private int cant;

    public LinkedList() {

    }
    public void add( T data){
        if(( head == null) && (tail == null)){
            head = new Node<T>(data);
            tail = head; // apuntan al mismo nodo
        }else{
            Node<T> aux = new Node<T>(data);
            if(head == tail){
                head.setNext(aux);
                tail = head.getNext(); // SI HAY UN PRIMER ELEMENTO. se linkea a caheza y lueo tail apunta
            }else{
                tail.setNext(aux);
                tail = aux;
            }
        }
        cant++;
    }

    public Node<T> getHead() {
        return head;
    }
    public Node<T> getTail() {
        return tail;
    }

    public int getCant() {
        return cant;
    }

    public void printList(){
        Node<T> aux = head;
        while(aux!= null){
            System.out.println("nodo con numero : " + aux.getData());
            aux = aux.getNext();
        }
    }
}
