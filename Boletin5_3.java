
package boletin5_3;

import javax.swing.JOptionPane;

public class Boletin5_3 {

    public static void main(String[] args) {
        int num3;
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero porfavor: "));

        if (num3 > 0)
            System.out.println("+");
        else if (num3 < 0)
            System.out.println("-");
        else
            System.out.println("Cero");
    }
    
}
