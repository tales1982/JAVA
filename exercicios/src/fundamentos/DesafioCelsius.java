package fundamentos;

import java.util.Scanner;

public class DesafioCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ola vamos converter de celsius para Fahrenheit ");
        System.out.println("Digite a temperatura em celsius ");
        double celsius = entrada.nextDouble();

        double res = ((celsius * 9) / 5) + 32;

        System.out.printf("A sua temperatura em Fahrenheit é %.2f",res);

        entrada.close();

    }
}
