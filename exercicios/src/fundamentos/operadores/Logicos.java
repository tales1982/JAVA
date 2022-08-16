package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;//false 3 nao e maior que 7
		
		System.out.println(condicao1 && condicao2);//falso -> ambas tem que ser verdadeira para ser true senao e  false 
		System.out.println(condicao1 || condicao2);// true -> basta 1 ser verdadeiro para ser true
		System.out.println(condicao1 ^ condicao2);// true-> (xor) 
		System.out.println(!condicao1);//false-> falso mudar ser for verdadeiro passa ser falso 
		System.out.println(!condicao2);//true -> verdadeiro muda de falso para verdadeiro
		
		System.out.println("\nTabela Verdade AND --> E");
		System.out.println(true && true);
		System.out.println(true && false);
	//	System.out.println(false && true);
	//  System.out.println(false && false);
	
		System.out.println("\nTabela Verdade OR --> OU");
	//	System.out.println(true || true);
	//	System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade XOR --> OU Exclusivo");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela Verdade NOT --> NAO");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
