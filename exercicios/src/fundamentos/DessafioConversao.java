package fundamentos;

import java.util.Scanner;

public class DessafioConversao {
	public static void main(String[] args) {
		
		Scanner mediasalario = new Scanner (System.in);// met(odo scaner para o cliente poder digitar 
		System.out.println("Ola digite o primeiro salario");
		
		String valor1 = mediasalario.next().replace(",",".");//se o cliente digitar uma vigula ja vai ser substituido pelo ponto
		
		System.out.println("Agora digite o segundo salario");
		String valor2 = mediasalario.next().replace(",",".");//Poderia cria direto uma variavel double assim nao presisaria converter string para numeros.
		
		System.out.println("Agora digite o terceiro salario");
		String valor3 = mediasalario.next().replace(",",".");
		
		double salario1 = Double.parseDouble(valor1);//aqui estou convertendo uma stringer para numeros.
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("A soma do seu salario e de " + soma  + " Euros   \nE A media do seu salario e de " + soma / 3 + " Euros Mensal.." );
		
		mediasalario.close();// fechamento do metodo scanner
		
	}
}
