import java.util.Scanner;
public class Algoritmo6 {
    public static void main(String[] args) {
        float prestamo, interes, pago_mens;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Monto del prestamo: ");
        prestamo = teclado.nextFloat();
        System.out.print("Interes mensual: ");
        interes = teclado.nextFloat();
        pago_mens = (((prestamo/12)*interes)/100) + (prestamo / 12);
        System.out.print("El pago mensual sera: " + pago_mens);
    }
}
/**
 * Debug:
 * Monto del prestamo: 6000
 * Interes mensual: 4
 * El pago mensual sera: 520.0
 */