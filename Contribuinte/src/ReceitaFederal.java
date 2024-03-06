/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C;
/**
 
 * @author Fujoshi Shouter
 */
public class ReceitaFederal {
    public static void main(String[] args){
        Contribuinte c1;
        c1 = new Contribuinte("Yukari", "123456-78","Sp",1500);
        c1.calcularIrpf();
        c1.imprimir();
    }
}
