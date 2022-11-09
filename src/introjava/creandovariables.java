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
public class creandovariables {

    /**
     * @param args the command line arguments
     
     */
    public static void main(String[] args) {
    int num1;
    int num2;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el primer números: ");
    num1 = leer.nextInt();
    System.out.println("Ingrese el segundo números: ");
    num2 = leer.nextInt();
    if (num1 < 25 && num2 < 25){
        System.out.println("Los numeros son menores a  25");
    }else {
        System.out.println("Son mayores que 25");
    }
 }
}    
