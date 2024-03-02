## Responda as questões abaixo com base nessa aula:
**1) Quais os valores de saída se atribuirmos um salario de R$500,00?**
```
Nome.........: Anne Yukari Yamasaki
CPF..........: 000000000-00
Endereço.....: Mogi das Cruzes
Salário......: 500.0
Imposto......: 0.0
```
**2) Quais os valores de saída se atribuirmos R$2500,00?**
```
Nome.........: Anne Yukari Yamasaki
CPF..........: 000000000-00
Endereço.....: Mogi das Cruzes
Salário......: 2500.0
Imposto......: 375.0
```
**3) Qual o nome da classe que calcula o imposto de renda do contribuinte?**
```
Calc_IRPF
```
**4) Qual o nome da classe que instancia um objeto da classe Contribuinte?**
```
Proj_IRPF
```
**5) Qual o nome do objeto instanciado?**
```
 c1 
```
**6) Quais os métodos da classe Calc_IRPF que foram utilizados nesta aula?**
```Java
 public Calc_IRPF()
 public void calcularIrpf()
 public void imprimir()
```
**7) Por que o atributo irpf não deve ser passado como parâmetro para o construtor?**
```
Porque irpf irá ser calculado. Não faz sentido uma pessoa física passar o imposto que se submeterá sob seu salário.
```
**8) Quais valores serão impressos se a linha “c1.calcularIrpf();” for removida da 
classe Proj_IRPF?**
```Java
Nome.........: Anne Yukari Yamasaki
CPF..........: 000000000-00
Endereço.....: Mogi das Cruzes
Salário......: 2500.0
Imposto......: 0.0 //O imposto não é calculado.
```
**9) Por que não se deve implementar um método “setIrpf”?**
```
Não precisamos dizer o valor que queremos calcular. 
```
**10) Qual o nome da classe de negócio implementada nesta aula?**
```
Calc_IRPF
```
**11) Qual o nome da classe executável implementada nesta aula?** 
```
Proj_IRPF
```
## Desafios:
- [x] 1) Implementar os métodos de acesso que estão faltando na classe Calc_IRPF. 
Lembre-se de fortalecer o encapsulamento. 
```Java
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
```
- [x] 2) Modificar a classe Proj_IRPF para que ela exiba apenas o nome, o salário e 
o imposto de renda a ser cobrado.
```Java
System.out.println("Nome........: " + c1.getNome()); 
System.out.println("Salário.....: " + c1.getSalario());
System.out.println("Imposto.....: " + c1.getIRPF());
```
- [x] 3) Criar um método para calcular o salário líquido do contribuinte irá receber sem 
criar atributos extras.
```Java
 public double calcSFinal(){
        return salario - irpf;
    }
```
- [x] 4) Modificar o método imprimir() para exibir também o salário líquido.
```Java
// código para classe Calc_IRPF:
System.out.print("Salário líquido: " + calcSFinal());

// ou

// código para classe Proj_IRPF:
System.out.println("Salário líquido: " + c1.calcSFinal());
```
5) Alterar o método calcularIrpf() para que ele atenda a regra abaixo.
salario <= 1058 ➔ Contribuinte Isento
1058 < salario <=2100 ➔ 15% do salario
salario > 2100 ➔ 27,5% do salario.
```Java
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
```
