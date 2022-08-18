package fundamentos;

import java.util.Scanner;

public class DesafioTamanhoDaArea {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular o tamanha da sua area!");
        System.out.println("Digite o tamanho dos metros da sua base.");
        double base = entrada.nextDouble();

        System.out.println("Digite o tamanho da altura.");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A sua Area total e de : " + area + " Metros.");
        entrada.close();
    }
}
