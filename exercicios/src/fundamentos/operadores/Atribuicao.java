package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		double a =  4.5;
		double b = a;
		double c =a + b;
		
		c += b;// C = C + B;
		c -= a;// C = C - A;
		c *= b;// C = C * B.
		c /= a;// C = A / A;
		System.out.println(c);
		
		c %= 2;// C = C % 2; RES 0 ou 1
		System.out.println(c);
	}
}
