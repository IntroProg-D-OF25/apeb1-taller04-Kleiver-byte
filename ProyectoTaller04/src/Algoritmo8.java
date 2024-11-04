import java.util.Scanner;
public class Algoritmo8 {
    public static void main(String[] args) {
        float netflix, youtube, dropbox, spotify, pago_mensual;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor mensual de Netflix:  ");
        netflix = teclado.nextFloat();
        System.out.print("Valor mensual de Youtube Premium:  ");
        youtube = teclado.nextFloat();
        System.out.print("Valor mensual de DropBox:  ");
        dropbox = teclado.nextFloat();
        System.out.print("Valor mensual de Spotify:  ");
        spotify = teclado.nextFloat();
        pago_mensual = (dropbox + netflix + spotify + youtube);
        System.out.println("Si es menor a 30 años su valor a pagar menos el 20% es: " + (pago_mensual-(pago_mensual*0.20)));
    }
}
/**
 * Valor mensual de Netflix:  12
* Valor mensual de Youtube Premium:  10
* Valor mensual de DropBox:  8
* Valor mensual de Spotify:  16
* Si es menor a 30 a�os su valor a pagar menos el 20% es: 36.8
 */