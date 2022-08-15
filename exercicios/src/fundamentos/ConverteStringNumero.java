package fundamentos;

import javax.swing.JOptionPane;// JOptionPane.showInputDialog => esse e um import da caixa de dialogo que vai abrir para digitar o valor

public class ConverteStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");// meu numero vai vim em string
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		System.out.println(valor1 + valor2); // aqui meu numero e uma string sendo assim ele vai conctenar o resultado.
		
		double numero1 = Double.parseDouble(valor1);// Aqui estou passando o meu valor 1 para numero
		double numero2 = Double.parseDouble(valor2);//Aqui estou passando o valor 2 para numero
		double soma = numero1 + numero2;//Agora posso somar o valor1 com o valor2
		System.out.println("Soma e " + soma);// o resultado do valor que foi passado de string para numero.
		System.out.println("A media e " + soma / 2);
		
	}
}
