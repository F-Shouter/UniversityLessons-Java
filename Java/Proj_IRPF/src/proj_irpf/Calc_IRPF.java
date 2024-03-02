/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_irpf;

/**
 *
 * @author Fujoshi Shouter
 */
public class Calc_IRPF {

    private String nome;
    private String CPF;
    private String endereco;
    private double salario;
    private double irpf;
    private double salarioFinal;

    //construtor 
    public Calc_IRPF(String n, String c, String e, double s) {
        nome = n;
        CPF = c;
        endereco = e;
        salario = s;
        irpf = 0;
        salarioFinal = 0;
    }

    //metodos de acesso
    public void setNome(String n) {
        nome = n;
    }
    public String getNome() {
        return nome;
    }
    public void setCPF(String c) {
        CPF = c;
    }
    public String getCPF() {
        return CPF;
    }
    public void setEndereco(String e) {
        endereco = e;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setSalario(double s) {
        salario = s;
    }
    public double getSalario() {
        return salario;
    }
    public double getIRPF(){
        return irpf;
    }
    public double getSalarioFinal(){
        return salarioFinal;
    }
    
    //metodo para calcular o IRPF da pessoa
    public void calcularIrpf(){
        if(salario <= 900){
            irpf = 0;
        }
        else {
            if(salario > 1800){
                irpf = salario*0.15; //15% do salario
            }
            else {
                irpf = salario*0.1; //10% do salario
            }
        }
    }
    public double calcSFinal(){
        return salario - irpf;
    }
    public void calcularSFinal(){
        salarioFinal = salario - irpf;
    }
    //public void imprimir(){
       // System.out.println("Nome.........: " + nome);
       // System.out.println("CPF..........: " + CPF);
       // System.out.println("Endereço.....: " + endereco);
       // System.out.println("Salário......: " + salario);
       // System.out.println("Imposto......: " + irpf);
       // System.out.println("---------------------");
       // System.out.println("Salário Final: " + salarioFinal);
       // System.out.println(calcSFinal());
    //}
}
