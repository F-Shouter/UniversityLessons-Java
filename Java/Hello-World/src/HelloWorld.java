/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello.world;

import java.util.Scanner;

/**
 *
 * @author Fujoshi Shouter
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello-World");
        Scanner entrance = new Scanner (System.in);
        
        System.out.print("Enter an integer: ");
        int v1 = entrance.nextInt();
        
        System.out.print("Enter another integer: ");
        int v2 = entrance.nextInt();
        
        int soma = v1 + v2;
        System.out.println("The sum of two values is: " + soma);
    }
    
}
