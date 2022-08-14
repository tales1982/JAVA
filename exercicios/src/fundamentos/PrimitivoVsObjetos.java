package fundamentos;

public class PrimitivoVsObjetos {

	public static void main(String[] args) {
		
		//tudo em java e objeto menos os 8 tipos primitivos 
		// Wrappers sao a versao objeto dos tipos
		// Primitivos

		String s = new String("Texto");
		s.toUpperCase();
		System.out.printf("Escreva um %s ",s);
		//toda veis que eu presisar concatenar uma variavel tenho que imprimir (PRINTF)-->(F)

		int a = 123;
		System.out.println(a);

	}
}
