package bol5.pkg1;


import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Bol51 {

    public static void main(String[] args) {
        Coche obj = new Coche ();
        JOptionPane.showMessageDialog(null,"Velocidad inicial "+obj.getVelocidad()+" Km/h");
        String respuesta1 = JOptionPane.showInputDialog("Introduce velocidad a aumentar: ");
        obj.acelerar (Integer.parseInt(respuesta1));
        JOptionPane.showMessageDialog(null, "La velocidad tras acelerar es : "+obj.getVelocidad());
        String respuesta2 = JOptionPane.showInputDialog("Introduce velocidad a disminuir: ");
        obj.frenar (Integer.parseInt(respuesta2));
        JOptionPane.showMessageDialog(null,"Velocidad final "+obj.getVelocidad()+" Km/h");
        
    }
    
}
