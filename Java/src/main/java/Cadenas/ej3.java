package Cadenas;
//Pedir el nombre completo (nombre y apellidos) al usuario.
// El programa debe eliminar cualquier vocal del nombre. Por ejemplo: "Álvaro Pérez" se mostrará
// como "lvr Prz". Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas).
// El resto de caracteres no se modifican.

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado =new Scanner(System.in);

        String letras;

        System.out.println("Dime tu nombre y apellido por favor");
        letras = teclado.nextLine();

        char vocales=' ';

        for (int i = 0; i <letras.length(); i++) {

            vocales=letras.charAt(i);

            if ((vocales== 'a') || (vocales== 'e') || (vocales=='i') || (vocales== 'o') || (vocales=='u')){
                vocales =' ';
            }
            System.out.println(vocales);
        }
    }
}
