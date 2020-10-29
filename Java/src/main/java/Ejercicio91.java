//Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
import java.util.Scanner;
public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado=new Scanner(System.in);

        System.out.println("Dime una palabra");
        String palabra=teclado.nextLine();

        System.out.println("Dime otra palabra");
        String palabra1=teclado.nextLine();



        if (palabra.length()>palabra1.length()){
            palabra1=palabra;
            System.out.println(palabra+"Es la mas corta");
    }
    }
}
