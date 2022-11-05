package d08252022;

import java.util.Scanner;

public class Alumnos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, n;
        float C1, C2, promedio, suma=0;
        
        System.out.println("cuantos alumnos son: ");
        n = s.nextInt();
        String alumnos[] = new String[n];
        for(i=0; i< alumnos.length; i++){
            System.out.println("Nombre");
            System.out.print(i + ": ");
            alumnos[i]= s.next();
        }
        System.out.println("Calificaciones de los alumnos: ");
        for(i=0; i< alumnos.length; i++){
            System.out.println(alumnos[i] + " calificacion C1");
            C1= s.nextFloat();
            C1++;
            System.out.println(alumnos[i] + " calificacion C2");
            C2= s.nextFloat();
            C2++;
            suma= C1+C2;
        }
        promedio= suma /2;
        System.out.println("el promedio es de: " + promedio);
    }
}
//for(int i: 