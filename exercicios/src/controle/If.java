package controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
            System.out.println("Informe a media: ");
            double media = entrada.nextDouble();

            if (media <=10 && media >= 7){
                System.out.println("Aprovado \nParabens");
            }else if (media <7 && media >=4.5){
                System.out.println("Recuperação");
            }else if (media <4.5){
                System.out.println("Reprovado");
            }else{System.out.println("erro");}

            entrada.close();
    }
}
