/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fujoshi Shouter
 */
public class Contribuinte {
    private String nome;
    private String CPF;
    private String endereco;
    private double salario;
    private double irpf;
    
    //construtor
    public Contribuinte(String n, String c, String e, double s){
        nome = n;
        CPF = c;
        endereco = e;
        salario = s;
        irpf = 0;
    }
    
    //metodos de acesso
    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
     public void setCPF(String c){
        CPF = c;
    }
    public String getCPF(){
        return CPF;
    }
     public void setEndereco(String e){
        endereco = e;
    }
    public String getEndereco(){
        return endereco;
    }
     public void setSalario(double s){
        salario = s;
    }
    public double getSalario(){
        return salario;
    }
    public double getIrpf(){
        return irpf;
    }
    
    //metodo para calcular o irpf
    public void calcularIrpf(){
        irpf = salario * 0.1;
    }
    
    //metodo imprimir
    public void imprimir(){
        System.out.println("Nome..............: " + nome);
        System.out.println("CPF...............: " + CPF);
        System.out.println("Endereço..........: " + endereco);
        System.out.println("Salário...........: " + salario);
        System.out.println("Imposto a ser pago: " + irpf);
        
    }
}
   
   
   
   
