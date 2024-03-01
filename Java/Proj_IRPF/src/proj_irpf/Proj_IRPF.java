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
        c1 = new Calc_IRPF("Anne","000000000-00","Mogi das Cruzes",1800);
        c1.calcularIrpf();
        c1.imprimir();
    }
    
}
