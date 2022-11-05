
package d08182022;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numero;
        System.out.println("Ingrese el nombre del numero");
        numero = s.nextLine();
       
        switch(numero){
            case "Uno":
                System.out.println("el valor es: 1");
                break;
            case "Dos":
                System.out.println("el valor es: 2");
                break;  
            case "Tres":
                System.out.println("el valor es: 3");
                break;  
            case "Cuatro":
                System.out.println("el valor es: 4");
                break;  
            case "Cinco":
                System.out.println("el valor es: 5");
                break;  
            default:
                System.out.println("valor fuera del rango (1-5)");
        }
    }
    
}
