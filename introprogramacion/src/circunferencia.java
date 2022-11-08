
import java.util.Scanner;

public class circunferencia {
    public static void main(String[] args) {
        System.out.println("ingresar valor");
        Scanner ns = new Scanner(System.in);
        double radio = ns.nextInt();
        ns.close();
        double pi = 3.1416;
        double area = pi * (radio * radio);
        System.out.println("El area es: " + area);

    }
}
