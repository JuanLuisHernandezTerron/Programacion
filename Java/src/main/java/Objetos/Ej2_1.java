package Objetos;
import java.util.Arrays;
public class Ej2_1 {
    public static void main(String[] args) {

        int t1[] = {8, 41, 37};int t2[] = {8, 41, 37};
        System.out.println(t1 == t2);
        System.out.println(Arrays.equals(t1, t2));
    }
}
