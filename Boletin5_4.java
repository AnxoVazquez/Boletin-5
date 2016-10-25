package boletin5_4;

import javax.swing.JOptionPane;

public class Boletin5_4 {

    public static void main(String[] args) {
        int persona1, persona2;
        persona1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        persona2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

        if(persona1 > persona2){
           System.out.println("Manolo pesa: "+ persona1 +"Kg"); 
           System.out.println("La diferencia es de: "+ (persona1 - persona2) +"Kg");
        }
        else{
            System.out.println("Jose pesa: "+ persona2);
            System.out.println("La diferencia es de: "+ (persona2 - persona1) +"Kg");
        }
    }
    
}
