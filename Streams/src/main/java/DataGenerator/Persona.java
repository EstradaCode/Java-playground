package DataGenerator;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String Apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        Apellido = apellido;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

