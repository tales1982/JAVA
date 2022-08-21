package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Por vafor digite as notas da sua classe,\nsomente notas de 0 --> 10.  ");

        int quatidadedenotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {//aqui e onde estou dizendo pra sai do codigo quando digitar -1 meu codigo sai.
            System.out.print("Informe a nota ");
            nota = in.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                quatidadedenotas++;
            }else if (nota != -1){
                System.out.println("Nota invalida");
            }

        }
        //QUANDO SAI DO LOOPINGH ELE VEM DIRETO PRA CA  
        // Calcular media
        double media = total / quatidadedenotas;
        System.out.println("Media = " + media);
        in.close();
    }
}
