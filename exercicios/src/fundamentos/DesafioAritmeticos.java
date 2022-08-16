package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double n1 = (3 + 2) * 6;
		double n2 = Math.pow(n1, 2);
		double n3 =3 * 2 ;
		double res1 = n2 / n3;
		
		System.out.println(res1);
		
		double nun1 = (1 - 5) * (2 - 7);
		double nun2 = (nun1/2);
		double res2 = Math.pow(nun2, 2);
		
		System.out.println(res2);
		
		double total1 = res1  - res2;
		double total2 = Math.pow(total1, 3);
		double total3 = Math.pow(10, 3);
		double somatotal = total2 / total3;
		
		System.out.println("O total exato e de " + somatotal);
		
		/*
		 * poderia tambem no n1 declara assim
		 * Math.pow(6 * (3 + 2),2) declarando n1 e n2 juntos
		 * 
		 * */
		
		
		
	}
}
