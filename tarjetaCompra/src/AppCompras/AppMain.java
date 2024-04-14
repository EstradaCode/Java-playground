package AppCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        List<Compra> listaDeCompras = new ArrayList<Compra>();
        Scanner in = new Scanner(System.in);
        System.out.println("escriba el monto de su tarjeta!");
        Tarjeta tarjeta = new Tarjeta(in.nextDouble());
        System.out.println("A comprar!");
        boolean SeguirComprando = true;
        Compra compra; String nombre; double precio;
        while(SeguirComprando){
            System.out.println("nombre de la compra!");
            nombre= in.next();
            System.out.println("precio de la compra!");
            precio= in.nextDouble();
            compra = new Compra(nombre,precio);
            SeguirComprando = tarjeta.comprar(compra);
            if(SeguirComprando) listaDeCompras.add(compra);
            else{
                System.out.println("saldo insuficiente!");
            }
        }
        for(Compra c : listaDeCompras){
            System.out.println(c);
        }
    }
}
