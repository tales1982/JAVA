package controle;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Informe o nuemro");//chama uma caixa de dialogo para digitar o valar, o valor esta em string tenho que passar para int 
        int numero = Integer.parseInt(valor);//aqui recebo a variavel e ja tranformo em int.
        
        if (numero % 2 == 0){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero Impar");
        }

    }
}
