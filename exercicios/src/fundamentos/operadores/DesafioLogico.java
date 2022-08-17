package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		//
		
		boolean terca = true;
		boolean quinta = true;
		
		if (terca && quinta == true ) {
			
			System.out.println("Vamos no shopping compra uma tv de 50 polegadas e tomar soverte.");
			
		}else if (terca || quinta == true ){
			System.out.println("So vou poder compra uma tv de 32 polegadas e tomar sorvete.");
			
		}else{
			System.out.println("Nao posso compra agora desculpe vamos so tomar um sorvete na soverteria.");
		} 
		
	}
}
