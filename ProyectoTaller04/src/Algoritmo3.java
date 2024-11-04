import java.util.Scanner;
public class Algoritmo3 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Numero a mostrar su tabla de multiplicar: ");
        numero = teclado.nextInt();
        System.out.println(numero + " * 1 = " + (1 * numero));
        System.out.println(numero + " * 2 = " + (2 * numero));
        System.out.println(numero + " * 3 = " + (3 * numero));
        System.out.println(numero + " * 4 = " + (4 * numero));
        System.out.println(numero + " * 5 = " + (5 * numero));
        System.out.println(numero + " * 6 = " + (6 * numero));
        System.out.println(numero + " * 7 = " + (7 * numero));
        System.out.println(numero + " * 8 = " + (8 * numero));
        System.out.println(numero + " * 9 = " + (9 * numero));
        System.out.println(numero + " * 10 = " + (10 * numero));
        System.out.println(numero + " * 11 = " + (11 * numero));
        System.out.println(numero + " * 12 = " + (12 * numero));     
    }
}
/**
* Debug:
* Numero a mostrar su tabla de multiplicar: 9
* 9 * 1 = 9
* 9 * 2 = 18
* 9 * 3 = 27
* 9 * 4 = 36
* 9 * 5 = 45
* 9 * 6 = 54
* 9 * 7 = 63
* 9 * 8 = 72
* 9 * 9 = 81
* 9 * 10 = 90
* 9 * 11 = 99
* 9 * 12 = 108
 */