import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {
        System.out.println("Valor de a: ");
        Scanner ns = new Scanner(System.in);
        double a = ns.nextInt();
        System.out.println("Valor de b: ");
        double b = ns.nextInt();
        ns.close();
        double c = (a * a) + (b * b);
        double c2 = Math.sqrt(c);
        System.out.println("Su hipotenusa es: " + c2);

    }
}
