package fundamentos;

import java.util.Scanner;

public class TiposStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next();//Obs quando eu usso o .next altomaticamente ele iguinora espacos em branco
		//agora se eu ussar o .nextLine ele vai contar com espacos em bracos semdo assim podendo dar um erro 
		//muito importante que quando for fazer comparacao de strings ussar o .next e .equals
		System.out.println("2" == s2.trim());//O trim iguinora o espaco entao quando eu quizer iguinora usso o trim()
		System.out.println("2".equals(s2.trim()));
		//Muito cuidado quando for fazer comparacao de string (==) usse o equals
		entrada.close();

	}
}
