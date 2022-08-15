package fundamentos;

public class ConversaoNumerosString {
	public static void main(String[] args) {
		
		Integer num1 = 1000;// Valor Wappers(encapsulamento)	
		System.out.println(num1.toString().length());
		
		int num2 = 10000;//Valor Primitivo 
		System.out.println(Integer.toString(num2).length());
		
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
	}
}
