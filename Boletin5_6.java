package boletin5_6;

import javax.swing.JOptionPane;

public class Boletin5_6 {


    public static void main(String[] args) {
        int consumo;
        consumo = Integer.parseInt(JOptionPane.showInputDialog("Escriba el consumo: "));
        
        if (consumo <= 100)
            System.out.println("Baixo");
        else if (consumo <= 500)
            System.out.println("Medio");
        else if (consumo <= 1000)
            System.out.println("Alto");
        else if (consumo > 1000)
            System.out.println("Primera necesidad"); 
    }
    
}
