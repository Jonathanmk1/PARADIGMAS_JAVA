
package d08162022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaTriangulo {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader t = new BufferedReader(isr);
        
        int base, altura;
        float area;
        
        System.out.println("Dame la base: ");
        base = Integer.parseInt(t.readLine());
        System.out.println("Dame la altura: ");
        altura = Integer.parseInt(t.readLine());

        /*
        base = 1;
        altura = 4;
        area = (float)base * altura / 2;
        area = (float)(base * altura / 2.0);
        */
       area = base * altura / 2F;
       System.out.println("El area es: " + area);
        
    }
    
}
