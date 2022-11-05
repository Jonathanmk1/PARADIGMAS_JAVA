package d09062022;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_vect {
    
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList();
        ArrayList<Float> C1 = new ArrayList();
        ArrayList<Float> C2 = new ArrayList();
        ArrayList<Float> Promedio = new ArrayList();
        Scanner s = new Scanner(System.in);
        int c = 0;
        float rango=0, rango1=0, rango2=0, rango3=0, rango4=0
                , rango5=0, rango6=0, rango7=0, rango8=0, rango9=0, rango10=0;
        String resp;

        do {
            System.out.println("Nombre:");
            nombre.add(s.nextLine());
            System.out.println("Calificacion 1° parcial: ");
            C1.add(s.nextFloat());
            System.out.println("Calificacion 2° parcial: ");
            C2.add(s.nextFloat());
            Promedio.add((C1.get(c) + C2.get(c)) / 2);
            System.out.println("Quiere ingresar otro alumno?: ");
            resp = s.nextLine();
            resp = s.nextLine();

        } while (resp.equalsIgnoreCase("si"));
        System.out.printf("%-30s %-10s %-10s %-10s\n",
                "\033[36mNOMBRE", "PARCIAL 1", "PARCIAL 2", "PROMEDIO\033[0m");
        for (int i = 0; i < nombre.size(); i++) {
            System.out.printf("%-30s %-10.2f %-10.2f %-10.2f\n",
                    "\033[34m" + nombre.get(i) , C1.get(i), C2.get(i), Promedio.get(i) , "\033[0m");
        }
            if (Promedio.get(c) < 1) {
                rango++;
            } else if (Promedio.get(c) < 2) {
                rango2++;
            } else if (Promedio.get(c) < 3) {
                rango3++;
            } else if (Promedio.get(c) < 4) {
                rango4++;
            } else if (Promedio.get(c) < 5) {
                rango5++;
            } else if (Promedio.get(c) < 6) {
                rango6++;
            } else if (Promedio.get(c) < 7) {
                rango7++;
            } else if (Promedio.get(c) < 8) {
                rango8++;
            } else if (Promedio.get(c) < 9) {
                rango9++;
            } else if (Promedio.get(c) < 10) {
                rango1++;
            } else if (Promedio.get(c) == 10) {
                rango10++;
            }else{
                System.out.println("valor fuera de rango");
            }
        
        System.out.println("\033[36m-----------------------------------------------\033[0m");
        System.out.printf("%-14s %-10s\n", "|---RANGO----|", "|Cantidad|");
        System.out.printf("%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n"+
                "%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n"+"%-14s %-10.2f\n",
                "|0.0 - 9.0|", rango , "\n|10.0 - 19.0|" , rango2 , "\n|20.0 - 29.0|" , rango3 , "\n|30.0 - 39.0|" , rango4 ,
                "\n|40.0 - 49.0|" , rango5 , "\n|50.0 - 59.0|" , rango6 , "\n|60.0 - 69.0|" , rango7 , "\n|70.0 - 79.0|" , rango8 , 
                "\n|80.0 - 89.0|" , rango9 , "\n|90.0 - 99.0|" , rango1 , "\n|   100|  " , rango10);
        
        }
}
