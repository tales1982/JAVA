package meusexercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Digita sua primeira nota!");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite sua segunda nota!");
        double nota2 = entrada.nextDouble();
        double media1 = (nota1 + nota2) / 2;
        System.out.println("Sua media do primeiro simestre foi de " + media1);
        
        System.out.println("Digite sua terçera nota!");
        double nota3 = entrada.nextDouble();
        
        System.out.println("Digite sua quarta nota!");
        double nota4 = entrada.nextDouble();
        double media2 = (nota3 + nota4) / 2;
        System.out.println("Sua segunda media do simestre foi de " + media2);

        double mediafinal = (media1 + media2) / 2;
        System.out.println("Sua media final foi de " + mediafinal );
        
        if (mediafinal <=10 && mediafinal >=7){
            System.out.println("Parabens voçe passou de ano!");
        }else if (mediafinal >=5 && mediafinal <7){
            System.out.println("Voçe esta de recuperação! ");

        }else if(mediafinal <4.9){
            System.out.println("Voçe esta reprovado! ");
        }else {
            System.out.println("Nota invalida! ");
        }


        entrada.close();
    }
}
