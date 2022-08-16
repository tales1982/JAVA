package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3 );
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double)b);// estou convertendo meu numero inteiro pra double para ter a resposta exata
		System.out.println(a % b );//o resultado e o resto da divisao. 8/3= no casso 6-> 2 pra cada sobra(2)..
	}
}
