package T3;
//Escribe un programa que, dado un número entero, diga cuáles son y cuánto
//suman los dígitos pares por un lado, y los impares por otro. Los dígitos
//se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int
//donde sea necesario para admitir números largos.
//
//Ejemplo 1:
//Por favor, introduzca un número entero positivo: 94026782
//Dígitos pares: 4 0 2 6 8 2
//Dígitos impares: 9 7
//Suma de los dígitos pares: 22
//Suma de los dígitos impares: 16

import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int contador_par=0;
        int contadorImpar=0;

        System.out.println("Dime un numero entero positivo, por favor");
        long numero= teclado.nextInt();

        for (numero = 0; numero <0 ; numero++) {
            }
             if (numero%2==0){
                contador_par++;
        }
        for ( numero = 0; numero >1 ; numero++) {
            }
                if(numero%2!=0){
                  contadorImpar++;
        }
        System.out.println("Hay "+contador_par+" pares");
        System.out.println("Hay "+contadorImpar+" impares");
        System.out.println("Suma de los digitos pares: "+contador_par+contador_par);
        System.out.println("Suma de los dígitos impares: "+contadorImpar+contadorImpar);
    }
}
