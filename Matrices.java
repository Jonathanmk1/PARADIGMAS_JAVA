
package d08302022;

import java.security.SecureRandom;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SecureRandom nA= new SecureRandom();
        int m[][], r, c;
        r=4;
        c=6;
        m= new int [r][c];
        
        for(int i = 0; i < r; i++){
            for(int j=0; j < c; j++){
                m[i][j]= nA.nextInt(10);
            }
        }
        for(int i = 0; i < r; i++){
            for(int j=0; j < c; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
