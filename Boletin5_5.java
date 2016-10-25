package boletin5_5;


import javax.swing.JOptionPane;

public class Boletin5_5 {


    public static void main(String[] args) {
        int numero1, numero2, numero3;
        int mayor;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero 2: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero 3: "));
        
        if (numero1 > numero2){
            mayor = numero1;
            if (numero3 > numero1)
                mayor = numero3;
        }
        else if (numero2 > numero3)
            mayor = numero2;
        else
            mayor = numero3;
        
        System.out.println(mayor);
    }
    
}
