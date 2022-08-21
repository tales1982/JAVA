package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String res = "";

        while(!res.equalsIgnoreCase("sair") ){
            System.out.println("Voçe diz: ");
            res = in.nextLine();
        }
        in.close();
    }
}
