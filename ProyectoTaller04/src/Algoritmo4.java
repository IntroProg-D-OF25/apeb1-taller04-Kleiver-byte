import java.util.Scanner;
public class Algoritmo4 {
    public static void main(String[] args) {
        float costomin, costoTotal;
        int  minutosconsumidos;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el costo por minutos : ");
        costomin = teclado.nextFloat();
        System.out.print("Minutos consumidos en el mes: ");
        minutosconsumidos = teclado.nextInt();
        costoTotal = costomin * minutosconsumidos;
        System.out.print("Total de la planilla: " + costoTotal );
    }
}
/**
 * Debug: 
 * Ingrese el costo por minutos : 10
 * Minutos consumidos en el mes: 80 
 * Total de la planilla: 800.0
 */