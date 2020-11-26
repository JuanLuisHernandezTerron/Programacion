package Cadenas;
//Diseñar una actividad que pida al usuario que introduzca una frase por teclado e
// indique cuántos espacios en blanco tiene.
import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        String frase;

        int contador_espacios = 0;

        System.out.println("Dime una frase para ver los espacios que tienes vacios");
        frase = teclado.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador_espacios++;
            }
        }
        System.out.println("La frase tiene " + contador_espacios + " espacios en blanco.");
    }
}
