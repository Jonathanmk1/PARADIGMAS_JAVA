
package d09082022;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class M_profe {
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList();
        ArrayList<Float> C1 = new ArrayList();
        ArrayList<Float> C2 = new ArrayList();
        ArrayList<Float> Promedio = new ArrayList();
        Scanner s = new Scanner(System.in);
        SecureRandom na = new SecureRandom();
        int frecuencia[] = new int[11];
        
        for( int i=0; i < 5; i++){
            //System.out.println("Nombre:");
            nombre.add(String.valueOf(na.nextInt(500)));
            //System.out.println("Calificacion 1° parcial: ");
            C1.add((float)na.nextInt(101));
            //System.out.println("Calificacion 2° parcial: ");
            C2.add((float)na.nextInt(101));
            Promedio.add((C1.get(C1.size()-1) + C2.get(C2.size()-1))/2);
        }  
        for(Float c: Promedio){//float en MAYUS "Float"
            //frecuencia[c.intValue()/10]= frecuencia [c.intValue()/10]+1;
            frecuencia[c.intValue()/10]++;
        }
            
        System.out.printf("%-30s %-10s %-10s %-10s\n",
                "\033[36mNOMBRE", "PARCIAL 1", "PARCIAL 2", "PROMEDIO\033[0m");
        for (int i = 0; i < nombre.size(); i++) {
            System.out.printf("%-30s %-10.2f %-10.2f %-10.2f\n",
                    "\033[34m" + nombre.get(i) , C1.get(i), C2.get(i), Promedio.get(i) , "\033[0m");
        }
        for(int i: frecuencia){
            System.out.printf("%10s %10s" , "Rango" ,  "Alumnos");
            System.out.printf("%-5s %-5d"+"%-5s %-5d"+"%-5s %-5d"+"%-5s %-5d"+"%-5s %-5d"+"%-5s %-5d","%-5s %-5d"+"%-5s %-5d"
                    +"%-5s %-5d"+"%-5s %-5d"+
                    "0", i);
        }
}
    }
   
