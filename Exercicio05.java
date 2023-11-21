package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor inteiro para descobrir o seu antecessor: ");
		
		int valor=sc.nextInt();
		
		int resultado= valor-1;

		System.out.println("O antecessor do número que você digitou é: "+resultado);
		
		sc.close();
	}

}
