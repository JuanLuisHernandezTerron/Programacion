package T3;
//Escribe un programa que lea un número n e imprima una pirámide de letras
//        con n filas como en la siguiente figura:
//
//     abcdcba
//      abcba
//       aba
//        a

import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int numero = teclado.nextInt();

        String letras="abcdcba";

        for (int i = 0; i <1 ; i++) {
            for (int j = 0; j <numero ; j++) {
                System.out.println(letras);
            }
        }
        for (int k = 0; k <1 ; k++) {
            for (int o = 0; o >0 ; o++) {
                if (numero/1>0){
                    System.out.println("");
                }
            }
        }
    }
}
