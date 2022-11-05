
package utilerias;

import java.util.Scanner;

public class Metodos {
    
   
       //no recibe y no regresa
    public static void areaTriangulo(){
        
    }
   
    //recibe y regresa
    public static float areaTriangulo(int base, int altura){
        float area;
        area = base * altura / 2F;
        return area;
    }
    // recibe pero no regresa
    public static void areaTriangulo2(float base, int altura){
        float area;
         area = base * altura / 2F;
         System.out.println("el area es : " + area);
    }
    //no recibe pero si regresa
    public static float areaTriangulo2() {
     Scanner s = new Scanner(System.in);
        int base, altura;
        float area;
        System.out.println("Dame la base: ");
        base =s.nextInt();
        System.out.println("Dame la altura: ");
        altura = s.nextInt();
        area = base * altura / 2F;
       System.out.println("El area es: " + area);   
       return area;
     
    }
   
}
