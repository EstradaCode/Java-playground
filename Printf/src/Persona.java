public class Persona {
    private int dni;
    private String nombre;
    private String edad;
    private String domicilio;

    public Persona() {
    }
    public Persona(int dni, String nombre, String edad, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }
}
