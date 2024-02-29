/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_equacao2grau;
import java.util.Scanner;
/**
 *
 * @author Fujoshi Shouter
 */
public class Proj_Equacao2Grau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double ca = entrada.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double cb = entrada.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double cc = entrada.nextDouble();
        
        
        Equacao2Grau eq1 = new Equacao2Grau(ca, cb, cc);
        eq1.calcularX1();
        eq1.calcularX2();
       // eq1.imprimir();
       
       if ( eq1.calcularDelta() > 0 ){
            System.out.println("x1= "+ eq1.getX1());
            System.out.println("x2= "+ eq1.getX2());
       }
       else {
           System.out.println("As raízes são complexas, por isso não quero mostrá-las");
       }
    }
    
}
