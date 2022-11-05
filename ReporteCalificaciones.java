
package d08302022;

import java.util.Scanner;

public class ReporteCalificaciones {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String noms[];
        //float c1[], c2[], prom[], n;
        float[] c1, c2, prom;
        int n;
        
        System.out.println("Alumnos?: ");
        n= s.nextInt();
        noms= new String[n];
        c1= new float[n];
        c2= new float[n];
        prom= new float[n];
        
        for(int i=0; i < noms.length; i++){
            System.out.println("Nombres: ");
            noms[i]= s.nextLine();
            noms[i]= s.nextLine();
            System.out.println("Calif del parcial 1: ");
            c1[i]= s.nextFloat();
            System.out.println("Calif del parcial 2: ");
            c2[i]= s.nextFloat();
            prom[i]= (c1[i]+c2[i])/2;
            
        }
        System.out.printf("%-30s %-10s %-10s %-10s\n",
                 "\033[36mNOMBRE", "PARCIAL 1", "PARCIAL 2", "PROMEDIO\033[0m");
        
        for(int i = 0; i < noms.length; i++){
            System.out.printf("%-30s %-10.2f %-10.2f %-10.2f\n",
                "\033[34m" + noms[i] + "\033[0m", c1[i], c2[i], prom[i]);
        }
    }
    
}
