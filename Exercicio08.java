package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de eleiores do municipío: ");
		int quantEleitores = sc.nextInt();

		System.out.println("Digite a quantidade de votos brancos pelo municipío: ");
		int quantBrancos = sc.nextInt();

		System.out.println("Digite a quantidade de votos nulos: ");
		int quantNulos = sc.nextInt();

		System.out.println("Digite a quantidad de votos válidos pelo municipío: ");
		int quantVotosValidos = sc.nextInt();

		double porcen = quantBrancos*100/quantEleitores;

		System.out.println("A porcentagem de votos brancos é: " + porcen);

		sc.close();
	}

}
