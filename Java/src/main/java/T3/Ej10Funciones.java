package T3;
//Escribir una función que decida si dos números enteros positivos son amigos.
// Dos números son amigos si la suma de los divisores propios (distinto de él mismo)
// del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
import java.util.Scanner;
public class Ej10Funciones {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Dime el primer numero");
        int numero1 =teclado.nextInt();

        System.out.println("Dime el segundo numero");
        int numero2= teclado.nextInt();

        int contador1=0;
        int contador2=0;

        funcion1(numero1);
        funcion2(numero2);

        if(funcion1(contador1)==funcion2(contador2)){
            System.out.println("Son amigos");
            }else{
            System.out.println("No son amigos");
            }
        }

    public static int funcion1(int numero1){
        int contador1=0;
        for (int i = 1; i <numero1 ; i++) {
            if (numero1%2==0) {
                contador1+=0;
            }
        }
        return contador1;
    }
    public static int funcion2(int numero2){
        int contador2=0;
        for (int i = 1; i < numero2; i++) {
            if(numero2%2==0) {
                contador2+=0;
            }
        }
        return contador2;
    }
}

