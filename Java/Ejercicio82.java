//Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
// Se introducirán las edades de los alumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de
// las edades, la media de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.
import java.util.Scanner;
public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int edades = 0;
        int mayoreadad = 0;



        while (edades!=0) {
            System.out.println("Dime una edad");
            edades = teclado.nextInt();

            if (edades > 20) {
                edades++;
            }
            if (edades>17){
                mayoreadad++;
            }
            if
        }
        System.out.println("El numero introducido es negativo, por eso el programa finaliza");
        System.out.println("La suma de las edades es: "+edades );
        System.out.println("La media de las edades es: " + edades / 2);
        System.out.println("Hay" + mayoreadad + "mayores de edad");
    }
}
