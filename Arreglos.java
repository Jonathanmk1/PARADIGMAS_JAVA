package d08252022;

//int edades[];
//edades= new int [];
import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int i, n;
        float Suma=0, prom=1;
        int max= Integer.MAX_VALUE;
        System.out.println("Ingrese el numero de calificaciones: ");
        n = s.nextInt();
        float promedio []= new float[n];
        
        for(i=0; i<promedio.length; i++){
            System.out.println("Ingrese la calificacion");
            promedio[i]= s.nextFloat();
            Suma = Suma + promedio[i];
        }
        prom = Suma / n; 
        for(i=0; i<promedio.length; i++){
            System.out.println(i+ "::" + promedio[i]);
        }
        System.out.println("El promedio es: " + prom);
    }

}
