package Repeticion_while;

public class Sumapares {
    public static void main(String[] args) {
        System.out.println("Suma de numeros pares del 2 al 100");
        int suma_pares = 0;
        int num = 2;
        while (num<=100){
            if (num%2==0){
                suma_pares = suma_pares + num;
            }
            num = num + 1;
        }
        System.out.println("la suma de los numeros pares es: "+ suma_pares);
    }
}
