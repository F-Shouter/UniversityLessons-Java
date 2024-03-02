/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_irpf;

/**
 *
 * @author Fujoshi Shouter
 */
public class Proj_IRPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc_IRPF c1;
        c1 = new Calc_IRPF("Anne Yukari Yamasaki", "000000000-00", "Mogi das Cruzes", 2500);
        c1.calcularIrpf();
        //c1.calcularSFinal();
        //c1.imprimir();
        System.out.println("Nome.........: " + c1.getNome());
        System.out.println("CPF..........: " + c1.getSalario());
        System.out.println("Endereço.....: " + c1.getIRPF());
        System.out.println("Salário líquido: " + c1.calcSFinal());
        
        //System.out.println("Imposto......: " + irpf);
        //System.out.println("---------------------");
        //System.out.println("Salário Final: " + salarioFinal);
        //System.out.println(calcSFinal());
    }

}
