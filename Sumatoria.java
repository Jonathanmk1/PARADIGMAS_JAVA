
package d08232022;

import java.util.Scanner;

public class Sumatoria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i=1, suma=0;
        System.out.println("Ingrese el valor de n");
        n = s.nextInt();
        
         while(i <= n){
             suma= suma + i;
             i++;
        }
         System.out.println("la suma es: " + suma);
       
    }
}
