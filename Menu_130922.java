package d09132022;

import java.util.Scanner;
import utilerias.metodosmenu;

public class Menu_130922 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp;
        System.out.println("\033[31mSeleccione la opcion que desee entrar:\033[0m ");
        System.out.println("\033[35m1. Area de un Triangulo\033[0m");
        System.out.println("\033[36m2. Sol Ec Cuadratica\033[0m");
        System.out.println("\033[35m3. Salario de un trabajador\033[0m");
        System.out.println("\033[36m4. Sumatoria\033[0m");
        System.out.println("\033[34m5. Salir\033[0m");
        resp = s.nextInt();

        while (resp != 5) {
            switch (resp) {
                case 1:
                    metodosmenu.areaTriang();
                    break;
                case 2:
                    int a, b, c;
                    float xs[];
                    System.out.println("Ingrese el primer valor: ");
                    a = s.nextInt();
                    System.out.println("Ingrese el segundo valor: ");
                    b = s.nextInt();
                    System.out.println("Ingrese el tercer valor: ");
                    c = s.nextInt();
                    metodosmenu.ecuaccuadra(a, b, c);
                    break;
                case 3:
                    metodosmenu.salario();
                    break;
                case 4:
                    metodosmenu.sumatoria();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("valor fuera del rango (1-5)");
                    break;
            }
            System.out.println("--------------------");
            System.out.println("\033[31mSeleccione la opcion que desee entrar:\033[0m ");
            System.out.println("\033[35m1. Area de un Triangulo\033[0m");
            System.out.println("\033[36m2. Sol Ec Cuadratica\033[0m");
            System.out.println("\033[35m3. Salario de un trabajador\033[0m");
            System.out.println("\033[36m4. Sumatoria\033[0m");
            System.out.println("\033[34m5. Salir\033[0m");
            resp = s.nextInt();
        }
    }

}
