package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia X";
		s = s.replace("X", "Senhor ");//replaça o X por Senhora
		s = s.toUpperCase();//converte tudo para Maisculo OBS: Minha variavel s
		s = s.concat("!!!");
		
		//Obs estou adcionando operador a minha variavel =s= e nao declarando valores o unico valor que declarei foi bom dia
		
		System.out.println(s);
		
		
		String x = "Tales. ".toUpperCase();// converto para maiscula 
		System.out.println(x);
		
		
		String y = "Bom dia x".replace("x", "Tales").toUpperCase().concat("!!!");
		//posso ussar o comando tudo na mesma linha
		//Obs tipos primitivos nao tem operadores "."
		//exemplo (int-> double -> float -> char)
		System.out.println(y);
		
		
	}

}
