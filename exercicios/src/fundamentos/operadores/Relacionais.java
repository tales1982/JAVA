package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);//a e igual a b --> true
		System.out.println(3 > 4);// 3 e maior que 4 --> false
		System.out.println(3 >= 3);// 3 e maior ou igual a 3 --> true
		System.out.println(3 < 7);//3 e menor que 7 --> true
		System.out.println(30 <= 7);// 30 e menor ou igual a 7 --> false
		System.out.println(30 != 7);// 30 e diferente ou igual a 7 --> true
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto) ;
	}
}
