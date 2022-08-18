package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana");

        String dia = entrada.next();

            //.equalsIgnoreCase(dia)equals e a mezsma coisa q == so que usada para string
            //.equalsIgnoreCase(dia) e ai nesse casso estou perguntando se e igual e estou mandando iguinora as letras maiusculas
        if ("domingo".equalsIgnoreCase(dia)) {
            System.out.println("1");

        } else if ("segunda".equalsIgnoreCase(dia)) {
            System.out.println("2");

        } else if ("terca".equalsIgnoreCase(dia) || "terça".equalsIgnoreCase(dia) ){
            System.out.println("3");

        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println("4");


        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println("5");
            
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println("6");

        } else if ("sabado".equalsIgnoreCase(dia)) {
            System.out.println("7");

        } else {
            System.out.println("Digite um dia da semana correto!");
        }

        entrada.close();
    }
}
