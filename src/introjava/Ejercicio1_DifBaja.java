/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
 import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Ejercicio1_DifBaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese dos números: ");
      Scanner leer = new Scanner (System.in); 
      int num1,num2;
      num1 = leer.nextInt();
      num2 = leer.nextInt();
        System.out.println("Su sumita da: " +  (num1+num2));   
    }
    
}
