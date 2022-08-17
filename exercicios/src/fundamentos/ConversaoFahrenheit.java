package fundamentos;

import java.util.Scanner;

public class ConversaoFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ola vamos converter a temperatura de Fahrenheit para Celsius");
        System.out.println("Digite a temperatura em Fahrenheit ");
        double temperatura = entrada.nextDouble();

        double res = ((temperatura - 32) * 5 ) / 9;  
        
        System.out.printf("Sua temperatura em celsius e de %.2f ", res);

        entrada.close();
    }
}
