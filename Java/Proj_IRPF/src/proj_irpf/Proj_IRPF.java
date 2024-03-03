/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_irpf;
//@author Fujoshi Shouter
import java.util.Scanner;
public class Proj_IRPF {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("What your name?");
        String n1 = entrada.nextLine();
        
        System.out.println("And, what's your CPF: ");
        String n2 = entrada.nextLine();
        
        System.out.println("Where are you from Ms " + n1 + "?");
        String n3 = entrada.nextLine();
        
        System.out.println("What is the value of your current salary?");
        double n4 = entrada.nextDouble();
        
        Calc_IRPF c1 = new Calc_IRPF();
        //c1 = new Calc_IRPF("Anne Yukari Yamasaki", "000000000-00", "Mogi das Cruzes", 2500);
        
        c1.setNome(n1);
        c1.setCPF(n2);
        c1.setEndereco(n3);
        c1.setSalario(n4);
        
        c1.calcularIrpf();
        c1.calcSFinal();
        //c1.imprimir();
        
        System.out.println("------------------------");
        System.out.println("Your income tax has calculated!" + "\nMs, " + c1.getNome() + ", you have to pay: ");
        System.out.println("R$ " + c1.getIRPF() + " reais");
        
        //System.out.println("Nome.........: " + c1.getNome());
        //System.out.println("Nome.........: " + c1.getCPF());
       // System.out.println("Nome.........: " + c1.getEndereco());
       // System.out.println("CPF..........: " + c1.getSalario());
       //System.out.println("Endereço.....: " + c1.getIRPF());
       // System.out.println("Salário líquido: " + c1.calcSFinal());
        
        //System.out.println("Imposto......: " + irpf);
        //System.out.println("---------------------");
        //System.out.println("Salário Final: " + salarioFinal);
        //System.out.println(calcSFinal());
        System.out.println("Are you going to pay the IRPF now?" + "\n [YES] or [NO]");
        int n5 = entrada.nextInt();
        c1.setResposta(n5);
        c1.respostaFinal();
    }

}
