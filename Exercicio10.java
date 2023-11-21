package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de custo do automóvel(fabricação): R$");
		float valorAutomovel = sc.nextFloat();
		float fornecedor =valorAutomovel*28/100;
		float impostor =valorAutomovel*45/100;
		float valorF= valorAutomovel+ fornecedor+impostor;
		System.out.println("O valor final do automóvel corresponde a : R$"+valorF);

		sc.close();
	}

}
