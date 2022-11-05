package d09272022;

import java.util.Scanner;
import utilerias.Persona;

public class MenuOyP {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp, n;
        String res, nombre;

        System.out.println("*********MENU***************");
        System.out.println("Que desea realizar: ");
        System.out.println("1: Dar de alta alumno: ");
        System.out.println("2: Ver reporte alumno: ");
        System.out.println("3: Salir");
        resp = s.nextInt();

        System.out.println("Determine el numero de personas: ");
        n = s.nextInt();
        Persona p = new Persona();
        Persona per[] = new Persona[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el id: ");
            p.setId(s.nextInt());
            System.out.println("Ingrese el nombre: ");
            p.setNombre(s.nextLine());
            p.setNombre(s.nextLine());
            System.out.println("Ingrese su edad: ");
            p.setEdad(s.nextByte());
            System.out.println("Ingrese su estatura: ");
            p.setEstatura(s.nextFloat());
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            System.out.println("Los datos son: " + p);
        }
    }

}
