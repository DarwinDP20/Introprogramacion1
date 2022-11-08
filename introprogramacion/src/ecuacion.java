import java.util.Scanner;

public class ecuacion {
    public static void main(String[] args) {
        System.out.println("Valor de a: " );
        Scanner ns = new Scanner(System.in);
        double a = ns.nextInt();
        System.out.println("Valor de b: " );
        double b = ns.nextInt();
        System.out.println("Valor de c: " );
        double c = ns.nextInt();
        double x1 = (- b + Math.sqrt(( b * b - 4 * a * c )))/2;
        double x2 = (- b - Math.sqrt(( b * b - 4 * a * c )))/2;
        System.out.println("X1 es: " + x1);
        System.out.println("X2 es: " + x2);
    }
}
