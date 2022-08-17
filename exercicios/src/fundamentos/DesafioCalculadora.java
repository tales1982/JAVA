package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ola digite um numero");
        double num1 = entrada.nextDouble();

        System.out.println("Ola digite outro numero");
        double num2 = entrada.nextDouble();

        System.out.println("Agora digite a operação que voçer quer fazer");
        String operador = entrada.next();

        // Logica
        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f ", num1, operador, num2, resultado);

        // System.out.println("O resultado é: " + resultado) ;

        entrada.close();

    }
}
