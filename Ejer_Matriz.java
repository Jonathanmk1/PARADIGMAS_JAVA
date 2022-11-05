package d08302022;

import java.util.Scanner;

public class Ejer_Matriz {

    public void ejeresu(){
        Scanner s = new Scanner(System.in);
        String noms[];
        int f, c;
        float [][] m;
        System.out.println("Determine el numero de alumnos");
        f = s.nextInt();
        noms = new String[f];
        //System.out.println("numero de datos a calcular(columnas)");
        //c = s.nextInt();
        m = new float[f][3];
        
        for (int i = 0; i < noms.length; i++) {
            System.out.println("Nombres: ");
            noms[i] = s.nextLine();
            noms[i] = s.nextLine();
            System.out.println("Calif del parcial 1: ");
            m[i][0]= s.nextFloat();
            System.out.println("Calif del parcial 2: ");
            m[i][1]= s.nextFloat();
            m[i][2]= (m[i][0]+m[i][1])/2;
        }
        System.out.printf("%-30s %-10s %-10s %-10s\n",
                "\033[36mNOMBRE", "PARCIAL 1", "PARCIAL 2", "PROMEDIO\033[0m");
        
        for(int i = 0; i < noms.length; i++){
            System.out.printf("%-30s %-10.2f %-10.2f %-10.2f\n",
                "\033[34m" + noms[i] + "\033[0m", m[i][0], m[i][1], m[i][2]);
        
        }

    }
   public void hehcoxmi(){
       Scanner s = new Scanner(System.in);
        String noms[];
        int f, c;
        float [][] m;

        System.out.println("Determine el numero de alumnos");
        f = s.nextInt();
        noms = new String[f];
        System.out.println("numero de datos a calcular(columnas)");
        c = s.nextInt();
        m= new float[f][c];
       for (int i = 0; i < noms.length; i++) {
            System.out.println("Nombres: ");
            noms[i] = s.nextLine();
            noms[i] = s.nextLine();
            for (int j = 0; j < m.length; j++) {
            System.out.println("Calif del parcial 1: ");
            m[i][j]= s.nextFloat();
            System.out.println("Calif del parcial 2: ");
            m[i][j]= s.nextFloat();
            m[i][j]= (m[i][0]+m[i][1])/2;
            }
            
       }    
   }
    public static void main(String[] args) {
        Ejer_Matriz em = new Ejer_Matriz();
        em.ejeresu();
    }
}
