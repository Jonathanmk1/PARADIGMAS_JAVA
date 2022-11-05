package d08252022;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float califs[];
        float suma = 0, prom = 1;
        int n, i;

        System.out.println("Alumnos: ");
        n = s.nextInt();
        califs = new float[n];
        for (i = 0; i < califs.length; i++) {
            System.out.println("Dame la calificacion: ");
            System.out.println(i + ":");
            califs[i] = s.nextFloat();
            suma += califs[i];
        }
        prom = suma / n;
        for (i = 0; i < califs.length; i++) {
            System.out.println(califs[i]);
        }
        System.out.println("promedio: " + prom);
    }
}
