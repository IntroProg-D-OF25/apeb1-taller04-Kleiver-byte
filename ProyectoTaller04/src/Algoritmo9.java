import java.util.Scanner;
public class Algoritmo9 {
    public static void main(String[] args) {
        float base_tri, altura_rect, areaT_poligono;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Base del triangulo: ");
        base_tri = teclado.nextFloat();
        System.out.print("Altura del rectangulo: ");
        altura_rect = teclado.nextFloat();
        areaT_poligono = (((base_tri * altura_rect)/2)*3) + (base_tri * base_tri) + (base_tri * altura_rect);
        System.out.print("El area del poligono es : "+ areaT_poligono);
    }
}
/**
 * Debug:
 * Base del triangulo: 3
 * Altura del rectangulo: 4
 * El area del poligono es : 39.0
 */
