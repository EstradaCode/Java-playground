package AppCompras;

public class Tarjeta {
    private double saldo;
    private boolean insuficiente;

    public Tarjeta(double saldo) {
        this.saldo = saldo;
        this.insuficiente = false;
    }

    public Tarjeta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean comprar(Compra compra){
        if(!insuficiente && compra.getPrecio() < this.getSaldo()){
            this.saldo -= compra.getPrecio();
            return true;
        }else{
            insuficiente= true;
            return false;
        }
    }
}
