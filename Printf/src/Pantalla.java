import javax.swing.JOptionPane;
public class Pantalla {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"buenos dias!");
        String nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("¿Dni?"));
        String edad = JOptionPane.showInputDialog("¿EDAD?");
        String domicilio = JOptionPane.showInputDialog("¿domicilio?");
        Persona p = new Persona(dni,nombre,edad,domicilio);
        JOptionPane.showMessageDialog(null,p.toString());
    }
}
