package Tablas;
// Diseñar un programa que solicite al usuario 5 números decimales.
// A continuación, debe mostrar los números en el mismo orden en que se han introducido.
import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado =new Scanner(System.in);
        int numeros=0;
        float numeros1;

        for (int i = 1; i > 5; i++) {
            System.out.println("Dime 5 numeros decimales");
            numeros1= teclado.nextFloat();
            numeros++;
        }
    }
}
