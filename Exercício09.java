package fundamentos;
import java.util.Scanner;

public class Exercício09 {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	System.err.println("Digite sua primeira nota: ");
	double n1 = entrada.nextDouble();
	System.err.println("Digite sua segunda nota: ");
	double n2 = entrada.nextDouble();
	double media = (n1 + n2) / 2;
	System.out.println("Sua media é: "+ media);
}	
}