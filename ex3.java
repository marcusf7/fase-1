package controle;

import java.util.Scanner;

public class conversaoTemperatura {
	public static void main(String[ ] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		double celsius = (5.0 / 9.0) * (fahrenheit - 32);
		
		System.out.println("Temperatuta em Celsius é: " + celsius);
	}
}
