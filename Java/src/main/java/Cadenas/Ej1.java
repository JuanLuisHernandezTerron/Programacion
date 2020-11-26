package Cadenas;
//Introducir por teclado una frase palabra a palabra, y mostrar la frase completa
// separando las palabras introducidas con espacios en blanco. Terminar de leer la
// frase cuando la palabra introducida sea "fin" escrita con cualquier combinación
// de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        String frase=" ",letras;

        System.out.println("Dime palabra a palabra para poder crear la frase");
         letras=teclado.nextLine();

         while (!letras.toLowerCase().equals("fin")){

             frase=frase+" "+letras;
             System.out.println("Dime mas palabras");
             letras =teclado.nextLine();
         }
        System.out.print(frase);
    }
}
