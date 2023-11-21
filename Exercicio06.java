package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		
		System.out.println("\nDigite o valor da base do retângulo: ");
		float baseR=sc.nextFloat();
		System.out.println("Digite o valor da altura do retângulo: ");
		float altR=sc.nextFloat();
		
		float areaR=baseR*altR;
		
		System.out.println("O valor da area do retangulo é: "+areaR);
		
		sc.close();
	}

}
