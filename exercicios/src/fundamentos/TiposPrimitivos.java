package fundamentos;

public class TiposPrimitivos {
 public static void main(String[] args) {
	//Informacoes do fucionario
	 
	 //Tipos numericos
	 byte anosDeEmpressa = 23;
	 short numerosDeVoos = 542;
	 int id = 56789;
	 long pontosAcumulados = 3_134_845_223L;
	 
	 //tipos numericos reais
	 float salario = 11_445.44F;
	 double vendasAcumuladas =2_991_797_103.01;
	 
	 //tipos booleanos
	 boolean estaDeFerias = false; // true
	 
	 // Tipo caracter
	 char status = 'A'; // Ativo
	 
	 //Dias de emoresa
	 System.out.println(anosDeEmpressa * 365);
	 
	 //Numeros de viagens
	 System.out.println(numerosDeVoos / 2);
	 
	 // Ponto por real
	 System.out.println(pontosAcumulados / vendasAcumuladas);
	 
	 System.out.println(id + ": ganha -> " + salario);
	 
	 System.out.println("Ferias? " + estaDeFerias );
	 
	 System.out.println("Status " + status);
	 
}
}
