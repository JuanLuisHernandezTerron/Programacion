package T3;
//Implementar la función divisoresPrimos() que muestra, por consola,
// todos los divisores primos del número que se le pasa como parámetro
import java.util.Scanner;
public class ej9Funciones {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero = teclado.nextInt();

        int contador=0;
        divisor_primos(numero,contador);

    }

    public static void divisor_primos(int numero, int contador) {

        for (int i = 1; i < numero; i++){
            System.out.println(i);
        }
    }
}