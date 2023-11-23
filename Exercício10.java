package fundamentos;
import java.util.Scanner;

public class Exercício10 {
public static void main(String[] args) {
	int grau = 0;
	System.out.println("Digite '1' para sim ou '2' para não.");
	Scanner scanner = new Scanner(System.in);
	System.err.println("Telefonou para a Vítima?");
	int resposta = scanner.nextInt();
	if (resposta == 1) {
		grau += 1;
	}
	System.err.println("Esteve no local do crime?");
	resposta = scanner.nextInt();
	if (resposta == 1) {
		grau += 1;
	}
	System.err.println("Mora perto da vítima?");
	resposta = scanner.nextInt();
	if (resposta == 1) {
		grau += 1;
	}
	System.err.println("Devia para a vítima?");
	resposta = scanner.nextInt();
	if (resposta == 1) {
		grau += 1;
	}
	System.err.println("Já trabalhou com a vítima?");
	resposta = scanner.nextInt();
	if (resposta == 1) {
		grau += 1;
	}
	if (grau < 2) {
		System.out.println("O reu eh INOCENTE.");
	}
	if (grau == 2) {
		System.out.println("O reu eh SUSPEITO.");
	}
	if (grau > 2 && grau < 5) {
		System.out.println("O reu eh CUMPLICE.");
	}
	if (grau == 5) {
		System.out.println("O reu eh ASSASSINO.");
	}
}
}