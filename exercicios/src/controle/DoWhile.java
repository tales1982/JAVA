package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String texto = "";
        do {
            System.out.println("Voce precisa falar "+"as palavras magicas...");
            System.out.println("Quer sai? ");
            texto = in.nextLine();
        }while(!texto.equalsIgnoreCase("Por favor"));

        System.out.println("Obrigado");
        in.close();
    }
}
