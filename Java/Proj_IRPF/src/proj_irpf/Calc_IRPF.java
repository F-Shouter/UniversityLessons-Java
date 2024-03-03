/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_irpf;

/**
 *
 * @author Fujoshi Shouter
 */
import java.util.Scanner;
public class Calc_IRPF {

    public String nome;
    private String CPF;
    private String endereco;
    private double salario;
    private double irpf;
    //private double salarioFinal;
    private int resposta;

    //construtor 
    public Calc_IRPF(String n, String c, String e, double s, int r) {
        nome = n;
        CPF = c;
        endereco = e;
        salario = s;
        irpf = 0;
        //salarioFinal = 0;
        resposta = r;
    }
    
    public Calc_IRPF(){}
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
    //public double getSalarioFinal(){
        //return salarioFinal;
    //}
    public void setResposta(int r){
        resposta = r;
    }
    public int getResposta(){
        return resposta;
    }
    
    //metodo para calcular o IRPF da pessoa
    public void calcularIrpf(){
        if(salario <= 1058){
            irpf = 0;
        }
        else {
            if(salario <= 2100){
                irpf = salario*0.15; //15% do salario
            }
            else {
                irpf = salario*0.27; //27% do salario
            }
        }
    }
    public double calcSFinal(){
        return salario - irpf;
    }
    //public void calcularSFinal(){
        //salarioFinal = salario - irpf;
    //}
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
    
    public void respostaFinal(){
       if (resposta == 1){
           System.out.println("aham");
       }
       else{
           if (resposta == 2){
               System.out.println("meme");
           }
           else {
               while (resposta != 1 && resposta != 2){
                   Scanner input = new Scanner(System.in);
                   System.out.println("Are you going to pay the IRPF now?" + "\n [YES] or [NO]");
                   int rr = input.nextInt();
                   setResposta(rr);
                   respostaFinal();
               }
           }
       }
    }
}
