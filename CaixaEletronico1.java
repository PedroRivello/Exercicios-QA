package caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Caixa Eletrônico Braços Curtos da UniPaulistana");
		System.out.println("");
		System.out.println("");
		System.out.println("1 - Abastecimento");
		System.out.println("");
		System.out.println("2 - Saque imediato");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite a opção desejada:");
		
		int opcao=sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu Abstecimento");
			break;
		case 2:
			System.out.println("Você escolheu Saque imediato");
			break;
		default:
			System.out.println("A opção escolhida não existe!! \nSelecione apenas 1 ou 2");
			break;
		}
		
		sc.close();
	}

}
