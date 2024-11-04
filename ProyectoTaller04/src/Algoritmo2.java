import java.util.Scanner;
public class Algoritmo2 {
    public static void main(String[] args) {
        double gastos1, gastos2, gastos3, gastosT;
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Gastos del hijo 1: ");
        gastos1 = teclado.nextDouble();
        System.out.print("Gastos del hijo 2: ");
        gastos2 = teclado.nextDouble();
        System.out.print("Gastos del hijo 3: ");
        gastos3 = teclado.nextDouble();
        gastosT = gastos1 + gastos2 + gastos3;
        System.out.print("Los gastos totales son: " + gastosT);
    }
}
/**
 * Debug:
 * Gastos del hijo 1: 20
 * Gastos del hijo 2: 30
 * Gastos del hijo 3: 80
 * Los gastos totales son: 130.0 
 */