package exerciciosFaccat;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu sálario: ");
		double salario=sc.nextFloat();
		
		System.out.println("Digite a porcentagem de reajuste do seu salário: ");
		double porcen=sc.nextDouble();
		
		double reajuste= salario*porcen/100;
		
		double salarioF=reajuste+salario;
		
		System.out.println("O valor do novo salario é: "+salarioF);
		
		sc.close();
	}

}
