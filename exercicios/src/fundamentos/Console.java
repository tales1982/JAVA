package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
/*
		System.out.print("Bom ");
		System.out.print("dia!\n");

		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);

		System.out.printf("Salario: %.3f\n", 1234.5678);
		System.out.printf("Nome: %s\n","João");
		
		// a entrada scaner e usada pra captura o teclado no casso oque eu digita.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");

		String nome = entrada.nextLine();

		System.out.print("Digite o seu Sobrenome: ");

		String sobrenome = entrada.nextLine();

		System.out.print("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos. \n", nome, sobrenome, idade );
		
		entrada.close();
		*/
		Scanner teste = new Scanner (System.in);
		System.out.println("Ola Prazer em tem conhecer. Como voce se Chama? ");
		String nome = teste.nextLine().toUpperCase();
		System.out.printf("Seja Bem vindo! %s %n", nome);
		
		System.out.printf("%s Qual e a sua idade ", nome);
		int idade = teste.nextInt();
		System.out.printf("%s Parabens, %d anos e uma bella idade!!", nome, idade);
		teste.close();
		
		
	}
}
