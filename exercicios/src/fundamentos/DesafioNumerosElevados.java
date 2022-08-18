package fundamentos;

import java.util.Scanner;

public class DesafioNumerosElevados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ola vamos calcular seu numero elevado au quadrado e ao cubo! digite um numero. ");
        
        double numero = entrada.nextDouble();

        double res = Math.pow(numero, 2);
        double res2 = Math.pow(numero, 3);
        System.out.println("Seu numero elevado au quadrado é: " + res);
        System.out.println("Seu numero elevado au cubo é: " + res2);

        entrada.close();
    }
}
