package exerciciosFaccat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        double celsius= (fahrenheit-32)/1.8; 

        System.out.printf("a temperatura em Celsius é de: "+new DecimalFormat(".#").format(celsius)+"°C.");

        sc.close();
	}

}
