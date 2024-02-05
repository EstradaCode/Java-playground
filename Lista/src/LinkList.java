public class LinkList <T>{
    private Node<T> head;
    private Node<T> tail;
    private int cant;

    public LinkList() {
    }
    public void add( T data){
        if(( head == null) && (tail == null)){
            head = new Node<T>(data);
            tail = head; // apuntan al mismo nodo
        }else{
            Node <T> aux = new Node<T>(data);
            if(head == tail){
               head.setNext(aux);
               tail = head.getNext(); // SI HAY UN PRIMER ELEMENTO. se linkea a caheza y lueo tail apunta
            }else{
                tail.setNext(aux);
                tail = aux;
            }
        }
    }
    public void printList(){
        Node <T> aux = head;
        while(aux!= null){
            System.out.println("nodo con numero : " + aux.getData());
            aux = aux.getNext();
        }
    }
}
