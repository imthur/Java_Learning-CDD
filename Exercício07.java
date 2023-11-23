package fundamentos;
import java.util.Scanner;

public class Exercício07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.err.println("Digite um número: ");
		int num1 = entrada.nextInt();
		System.err.println("Digite um número: ");
		int num2 = entrada.nextInt();
		System.err.println("Digite um número: ");
		int num3 = entrada.nextInt();
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("Maior:" + num1 + "Menor:" + num3);
			}
			else if (num3 > num2) {
				System.out.println("Maior:" + num1 + "Menor" + num2);
			}
		}
		else if (num2 > num1 && num2 > num3) {
			if (num1 > num3) {
				System.out.println("Maior:" + num2 + "Menor:" + num3);
			}
			else if (num3 > num1) {
				System.out.println("Maior:" + num2 + "Menor" + num1);
			}
		}
		else if (num3 > num1 && num3 > num2) {
			if (num2 > num1) {
				System.out.println("Maior:" + num3 + "Menor:" + num1);
			}
			else if (num1 > num2) {
				System.out.println("Maior:" + num3 + "Menor" + num2);
			}
		}

	}
}
