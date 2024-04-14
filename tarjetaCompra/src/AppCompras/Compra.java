package AppCompras;

public class Compra implements Comparable<Compra> {
    private String nombre;
    private  double precio;

    public Compra(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Compra() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre= '" + nombre + '\'' +
                ", precio= " + precio;
    }

    @Override
    public int compareTo(Compra compra) {
        if(Double.compare(this.precio,compra.getPrecio()) < 0){
            return -1;
        }else if(Double.compare(this.precio,compra.getPrecio()) > 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
