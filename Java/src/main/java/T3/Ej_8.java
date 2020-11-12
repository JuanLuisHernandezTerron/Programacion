package T3;
//Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
import java.util.Scanner;
public class Ej_8 {
    public static void main(String[] args) {
        Scanner Teclado;
        Teclado=new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero= Teclado.nextInt();

        int contador=0;

        primo(numero, contador);
        no_primo(numero1, contador1);
    }
    public static int primo(int numero, int contador){
        for (int i = 1; i <numero ; i++) {
            if (numero%i ==0)
                if (primo(i)==true)
                contador ++;
        }
    }

}
