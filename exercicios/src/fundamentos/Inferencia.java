package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;//valor inicial
		System.out.println(a);
		
		a = 12;// novo valor
		System.out.println(a);
		
		var b = 4.5;// numero double
		System.out.println(b);
		
		b = 90;// posso declarar numero inteiro tb
		System.out.println(b);
		
		/*var f = 600; //variavel inteiro declarado
		f = 42.5; */
		//nao aceita porque esta declarada um numero inteiro nao posso declara outro como float ou double
		
		
		var c = "Texto";
		System.out.println(c);
		
		
		c = "tales".toUpperCase(); //aqui declaro e converto para maiusculo
		System.out.println(c);
		
		double d;//aqui declaro uma variavel d mais nao dou valor a ela
		d = 123.456;//aqui passo o valor da variavel d
		System.out.println(d);// variavel usada
		
		var e = 123.4567;
		System.out.println(e);
	}
}
