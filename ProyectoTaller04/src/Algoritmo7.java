import java.util.Scanner;
public class Algoritmo7 {
    public static void main(String[] args) {
        float kWH, consumidos, costoT;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Costo de kilovatio/hora:  ");
        kWH = teclado.nextFloat();
        System.out.print("Numero de kilovatios consumidos:  ");
        consumidos = teclado.nextFloat();
        costoT = kWH * consumidos;
        System.out.println("Si es mayor a 65 años su valor a pagar menos el 10% es:  " + (costoT - (costoT * 0.10)));
    }
}
/**
 * Costo de kilovatio/hora:  5
 * Numero de kilovatios consumidos:  120000
 * Si es mayor a 65 a�os su valor a pagar menos el 10% es:  540000.0
 */