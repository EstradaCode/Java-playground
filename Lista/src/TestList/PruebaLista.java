package TestList;

public class PruebaLista {
    public static void main(String[]args){
        LinkList<Integer>lista = new LinkList<>();
        lista.add(5);
        lista.add(3);
        lista.add(2);
        lista.printList();
        System.out.println(lista.getCant());
        System.out.println("segunda vez");
        lista.add(7);
        lista.add(1);
        lista.printList();
        System.out.println(lista.getCant());
    }
}
