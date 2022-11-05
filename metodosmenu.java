package utilerias;

import java.util.Scanner;

public class metodosmenu {

    // no recibe pero si regresa
    public static void areaTriang() {
        Scanner s = new Scanner(System.in);
        int base, altura;
        float area;
        System.out.println("Dame la base: ");
        base = s.nextInt();
        System.out.println("Dame la altura: ");
        altura = s.nextInt();
        area = base * altura / 2F;
        System.out.println("El area es: " + area);
        //return area;
    }

    public static void ecuaccuadra(int a, int b, int c) {
        //public static float()
        float x1 = 0, x2, d;
        if (a == 0) {
            System.out.println("Es una ecuacion lineal");
        } else {
            d = b * b - 4 * a * c;
            if (d >= 0) {
                x1 = (-b + (float) (Math.sqrt(d))) / (2 * a);
                x2 = (-b - (float) (Math.sqrt(d))) / (2 * a);

                System.out.println("valor de x1: " + x1);

                System.out.println("valor de x2: " + x2);
            } else {
                System.out.println("La solucion es compleja UnU");
            }
        }
        //return x1;
    }

    public static void salario() {
        Scanner s = new Scanner(System.in);
        int ht;
        float ph, salario = 0, Extras, Fijo;

        System.out.println("Dame las horas trabajadas: ");
        ht = s.nextInt();
        System.out.println("Inrese el pago por hora: ");
        ph = s.nextFloat();

        if (ht <= 40) {
            salario = ht * ph;
            System.out.print("El salario es: ");

            //Pago_doble
        } else if (ht <= 50) {
            //salario= 40*ph + (ht-40)*(2*ph);
            Extras = ht - 40;
            Fijo = Extras * ph + ph;
            salario = 40 * ph + Fijo;
            System.out.print("El salario es: ");

            //Pago_triple
        } else if (ht <= 60) {
            salario = 40 * ph + 10 * (2 * ph) + (ht - 50) * (3 * ph);

            System.out.print("El salario es: ");

        } else {
            System.out.println("Excedio el periodo permitido de jornada ");
        }
        //return salario;
    }

    public static void sumatoria() {
        Scanner s = new Scanner (System.in);
        int n, i = 1, suma = 0;
        System.out.println("Ingrese el valor de n");
        n = s.nextInt();

        while (i <= n) {
            suma = suma + i;
            i++;
        }
        System.out.println("la suma es: " + suma);

        //return suma;
    }
}
