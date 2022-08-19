package meusexercicios;

import javax.swing.JOptionPane;

public class LerIdade {
    public static void main(String[] args) {
        // System.out.println("Ola digite sua idade");

        String valor1 = JOptionPane.showInputDialog("Ola digite sua idade");
        int idade = Integer.parseInt(valor1);

        String valor2 = JOptionPane.showInputDialog("Ola digite quantos meses");
        int meis = Integer.parseInt(valor2);

        String valor3 = JOptionPane.showInputDialog("Ola digite quantos dias");
        int dia = Integer.parseInt(valor3);

        int res = ((idade * 365)+(meis * 30))+dia;
        System.out.println("Voce ja viveu " + res + " dias.");
    }
}
