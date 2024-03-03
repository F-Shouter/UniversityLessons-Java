/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeequacao;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class TesteEquacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a: ");
        double va  = entrada.nextDouble();

        System.out.print("Digite b: ");
        double vb = entrada.nextDouble();

        System.out.print("Digite c: ");
        double vc = entrada.nextDouble();

        EquacaoSegundoGrau eq1 = new EquacaoSegundoGrau();

        eq1.setA(va);
        eq1.setB(vb);
        eq1.setC(vc);

        System.out.println("a = " + eq1.getA());
        System.out.println("b = " + eq1.getB());
        System.out.println("c = " + eq1.getC());

        if (eq1.calcularDelta() >= 0) {

            eq1.calcularX1();
            eq1.calcularX2();
            System.out.println("x1 = " + eq1.getX1());
            System.out.println("x2 = " + eq1.getX2());
        } else {
            
            System.out.println("Raízes não reais");
        }

    }

}
