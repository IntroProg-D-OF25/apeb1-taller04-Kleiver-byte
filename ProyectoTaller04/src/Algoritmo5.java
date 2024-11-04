import java.util.Scanner;
public class Algoritmo5 {
    public static void main(String[] args) {
        float cpu, cost_teclado, pantalla, raton, cost_total;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Costo del CPU: ");
        cpu = teclado.nextFloat();
        System.out.print("Costo del teclado: ");
        cost_teclado = teclado.nextFloat();
        System.out.print("Costo del pantalla: ");
        pantalla = teclado.nextFloat();
        System.out.print("Costo del raton: ");
        raton = teclado.nextFloat();
        cost_total = cpu + pantalla + raton + cost_teclado;
        System.out.print("El costo total de la computadora de escritorio es: " + cost_total);
    }
}
/**
 * Debug:
* Costo del CPU: 500
* Costo del teclado: 50
* Costo del pantalla: 200
* Costo del raton: 30
* El costo total de la computadora de escritorio es: 780.0
 */