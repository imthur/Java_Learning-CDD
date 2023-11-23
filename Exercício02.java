package fundamentos;
import java.util.Scanner;

public class Exercício02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.err.println("Digite um numero:");
		double resp = entrada.nextDouble();
		System.out.println(resp > 0 ? "Positivo" : "Negativo");
	}	
}