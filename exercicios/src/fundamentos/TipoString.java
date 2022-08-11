package fundamentos;

public class TipoString {
	public static void main(String[] args) {
	
		System.out.println("ola pessoal".charAt(2));// Mostra a segunda letra do minha string posso mudar () colocar o valor que eu quizer.
		
		
		String s = "Boa Tarde";//declaro uma variavel.
		System.out.println(s.concat("!!!"));//concateno a variavel com !!!.
		System.out.println(s + "!!!");//Outra maneira de concatenar minha variavel.
		System.out.println(s.startsWith("Boa"));//Estou perguntando se minha variavel comesar com (Boa) vai dizer verdadeiro ou falso.
		System.out.println(s.toLowerCase().startsWith("boa"));//posso converter para minusculo e pergunta se e verdadeiro.
		System.out.println(s.length());// Me retorna quantas letras tem minhas variavel.
		System.out.println(s.endsWith("dia!"));//Estou perguntando se ternima com dia.
		System.out.println(s.equals("boa tarde"));//estou perguntando e e igual a minha variavel, no caso nao (FALSE)porque o b e minusculo.
		System.out.println(s.equalsIgnoreCase("boa tarde"));//Estou perguntado se e igual a minha variavel e que iguinore letras maiscula e minusculas.
		
		//Outras Maneiras de concatenar
		var nome = "Tales";
		var sobrenome = "Lima";
		var idade = 33;
		var salario = 2.875;
		
		//Obs \n pula linha na concatenacao
		//modelos de concatenação
		System.out.println("Eu me chamo " + nome + " "+sobrenome + "\ne tenho " + idade + " anos" + "\nMeu salario e de " + salario + " Euros.");
		
		
		//System.out.printf com (F) no final e as junçoes (%s) o (s) endica o tipo de variavel no casso string pode ser tb (%d) (d) dfe double
		//toda veis que adciuonar uma variavel tenho que ussar (,) para adcionar outra. 
		
		System.out.printf("O senhor %s %s tem %d anos e ganha %f euros.",nome, sobrenome, idade, salario);
		//resposta O senhor Tales Lima tem 33 anos e ganha 2,875000 euros.
	}
}
