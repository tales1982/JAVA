package controle;

public class WhileDeterminado {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int contador = 0;
        while(contador <=9){
            contador ++; //pode ser tamben assim --> i = i + 1;
            System.out.println( contador );
        }
        System.out.println("fim");
    }
}
