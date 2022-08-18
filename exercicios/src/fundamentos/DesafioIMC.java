package fundamentos;




import java.util.Scanner;

public class DesafioIMC {
    /**
     * @param args
     */
    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Ola vamos calcula o seu IMC");

        System.out.println("Porfavor digite o seu peso");
        double peso = entrada.nextDouble();

        System.out.println("Agora digite sua altura");
        double altura = entrada.nextDouble();

        double imc = peso/(altura * altura)  ;
        System.out.printf(" O seu imc e de %.1f",imc);

        if (imc <= 18.4){
            System.out.println(" Sua Classificação é de Magreza");
        }else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println(" Sua Classificação Está Dentro do Normal");
        }else if(imc >=25 && imc <=29.9){
            System.out.println(" Sua Classificação é de Sobrepeso");
        }else if (imc >=30 && imc <=34.9){
            System.out.println(" Sua Classificação é de Obesidade grau I");
        }else if (imc >=35 && imc <=39.9){
            System.out.println(" Sua Classificação é de Obesidade grau II");
        }else if(imc >=40){
            System.out.println(" Sua Classificação é de Obesidade grau III");
        }else{
            System.out.println("erro");
        }

        
        entrada.close(); 
        /*
        double peso = 100;
        double altura = 1.80;
        double imc = peso / (altura * altura);
        System.out.println(imc);*/
    }
}
