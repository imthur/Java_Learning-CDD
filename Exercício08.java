package fundamentos;
import java.util.Scanner;

public class Exercício08 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	System.err.println("Digite um número de 1 a 7:");
	int digito = entrada.nextInt();
	if (digito == 1) {
		System.out.println("Domingo");
	}
	if (digito == 2) {
		System.out.println("Segunda-feira");
	}
	if (digito == 3) {
		System.out.println("Terça-feira");
	}
	if (digito == 4) {
		System.out.println("Quarta-feira");
	}
	if (digito == 5) {
		System.out.println("Quinta-feira");
	}
	if (digito == 6) {
		System.out.println("Sexta-feira");
	}
	if (digito == 7) {
		System.out.println("Sábado");
	}
	else {
		System.out.println("Dígito inválido");
	}
}
}