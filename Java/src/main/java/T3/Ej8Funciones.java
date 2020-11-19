package T3;
//Escribir una función a la que se le pase un número entero y devuelva el
// número de divisores primos que tiene.
import java.util.Scanner;
public class Ej8Funciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        funcion(numero);
        System.out.println("es: "+funcion(numero));
    }
    public static int funcion(int numero) {
        int cont = 0;
        boolean primo = false;
        for (int i = 2; i <= numero; i++) {
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    primo = true;
                    break;
                }
            }
            if (!primo) {
                cont++;
            }
            primo = false;
        }
        return cont;
    }
}

