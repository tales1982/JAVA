package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("MiniDesafio...");
		System.out.println(++a == b--);// atencao na ordem de precedencia o (b) so vai incrementa depois q ele ja tiver feito a comparacao. 
		System.out.println(a == --b);
		System.out.println();
	}
}
