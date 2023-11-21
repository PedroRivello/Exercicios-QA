package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite seu salário fixo: R$");
        float salariofixo=sc.nextFloat();

        System.out.println("Digite valor da comissão por venda de carro: R$");
        float Comissao=sc.nextFloat();

        System.out.println("Digite a quantidade de carros vendidos no mês: ");
        float quantCarro = sc.nextFloat();

        System.out.println("Digite o valor total vendido no mês: ");
        float valorT = sc.nextFloat();

        float totalComissao = quantCarro*Comissao;
        float porcenValor = valorT*5/100;
        float valorF= salariofixo+totalComissao+porcenValor;

        System.out.println("O valor final do salario é : R$"+valorF);

        sc.close(); 
	}

}
