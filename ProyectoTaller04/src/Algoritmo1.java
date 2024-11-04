import java.util.Scanner;
public class Algoritmo1 {
    public static void main(String[] args) {
        double base_tri, altura_tri, area;
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Deme la base del triangulo: ");
        base_tri = teclado.nextDouble();
        System.out.print("Deme la altura del triangulo: ");
        altura_tri = teclado.nextDouble();
        area = (base_tri * altura_tri)/2 ;
        System.out.print("El area total del triangulo es : " + area);       
    }
}
/**
 * Debug:
 * Deme la base del triangulo: 8
 * Deme la altura del triangulo: 5
 * El area del triangulo es : 20.0
 */