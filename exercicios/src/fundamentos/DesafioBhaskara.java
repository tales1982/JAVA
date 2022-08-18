package fundamentos;

public class DesafioBhaskara {
    public static void main(String[] args) {

        System.out.println("Vamos fazer uns calculos usando a formula de bhaskara.");

        double a = 1;
        double b = 12;
        double c = -13;
        double calc1 = Math.pow(b, 2);
        double calc2 = (-4) * a * (c);
        double delta = calc1 + calc2;
        System.out.printf("O valor de delta e de: %.0f ", delta);
        // System.out.println(calc2);

        System.out.println("\nAgora vamos achar o valor de X1 e X2 :");

        double d = Math.sqrt(delta);

        double e = (-b + d) / 2;
        double f = (-b - d) / 2;
        // double calc3 =
        System.out.printf("O valor de X1 é %.0f %nE o valor de X2 é %.0f ",e  ,f);

        // System.out.println("rais de delta " + Math.sqrt(delta));

    }
}
