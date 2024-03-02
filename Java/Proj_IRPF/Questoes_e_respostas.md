## Responda as questões abaixo com base nessa aula:
***
`1) Quais os valores de saída se atribuirmos um salario de R$500,00?`

```java
public static void main (String [] args)
```


2) Quais os valores de saída se atribuirmos R$2500,00?
3) Qual o nome da classe que calcula o imposto de renda do contribuinte?
4) Qual o nome da classe que instancia um objeto da classe Contribuinte?
5) Qual o nome do objeto instanciado?
6) Quais os métodos da classe Contribuinte que foram utilizados nesta aula?
7) Por que o atributo irpf não deve ser passado como parâmetro para o construtor?
8) Quais valores serão impressos se a linha “c1.calcularIrpf();” for removida da 
classe ReceitaFederal?
9) Por que não se deve implementar um método “setIrpf”?
10) Qual o nome da classe de negócio implementada nesta aula?
11) Qual o nome da classe executável implementada nesta aula?
Desafios: 
1) Implementar os métodos de acesso que estão faltando na classe Contribuinte. 
Lembre-se de fortalecer o encapsulamento.
2) Modificar a classe ReceitaFederal para que ela exiba apenas o nome, o salário e 
o imposto de renda a ser cobrado.
3) Criar um método para calcular o salário líquido do contribuinte irá receber sem 
criar atributos extras.
4) Modificar o método imprimir() para exibir também o salário líquido.
5) Alterar o método calcularIrpf() para que ele atenda a regra abaixo.
salario <= 1058 ➔ Contribuinte Isento
1058 < salario <=2100 ➔ 15% do salario
salario > 2100 ➔ 27,5% do salario.