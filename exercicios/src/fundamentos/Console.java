package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.print("Bom ");
		System.out.print("dia!\n");

		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);

		System.out.printf("Salario: %.3f\n", 1234.5678);

		// a entrada scaner e usada pra captura o teclado no casso oque eu digita.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");

		String nome = entrada.nextLine();

		System.out.println("Digite o seu Sobrenome: ");

		String sobrenome = entrada.nextLine();

		System.out.println("\n\n Nome = " + nome +" " + sobrenome);
	}
}
