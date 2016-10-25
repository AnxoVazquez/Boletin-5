
package boletin5_2;

import javax.swing.JOptionPane;

public class Boletin5_2 {


    public static void main(String[] args) {
        short num1, num2;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Escriba un numero: "));
        num2 = Short.parseShort(JOptionPane.showInputDialog("Escriba un numero: "));

        if (num1 >= num2)
            System.out.println(num1 - num2);
        
        System.out.println(num1 + num2);
    }
    
}
