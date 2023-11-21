package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite quantos anos você tem: ");
		int ano = sc.nextInt();
		
		System.out.println("Digite quantos meses você viveu após fazer aniversario: ");
		int mes = sc.nextInt();
		
		System.out.println("Digite quantos dias passaram após seu mêsversario: ");
		int dia = sc.nextInt();
		
		int total = ano*365+mes*30+dia;
		
		System.out.println("você viveu : "+total+ " dias");
		
		sc.close();
	}

}
