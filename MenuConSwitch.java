
package d08232022;

import java.util.Scanner;

public class MenuConSwitch {
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
                    float base,altura,area;

                    System.out.println("Dame la base: ");
                    base = s.nextFloat();
                    System.out.println("Dame la altura: ");
                    altura = s.nextFloat();

                    area = base * altura / 2F;
                    System.out.println("El area es: " + area);
                    break;
                case 2:
                    int a, b, c, d;
                    float x1, x2;

                    System.out.println("Inrese el primer valor: ");
                    a = s.nextInt();
                    System.out.println("Inrese el segundo valor: ");
                    b = s.nextInt();
                    System.out.println("Inrese el tercer valor: ");
                    c = s.nextInt();

                    if (a == 0) {
                        System.out.println("Es una ecuacion lineal");
                    } else {
                        d = b * b - 4 * a * c;
                        if (d >= 0) {
                            x1 = (-b + (float) (Math.sqrt(d))) / (2 * a);
                            x2 = (-b - (float) (Math.sqrt(d))) / (2 * a);

                            System.out.println("valor de x1: " + x1);
                            System.out.println("valor de x2 " + x2);
                        } else {
                            System.out.println("La solucion compleja");
                        }
                    }
                    break;
                case 3:
                    int ht;
                    float ph, salario, Dif, Extras, Fijo;

                    System.out.println("Dame las horas trabajadas: ");
                    ht = s.nextInt();
                    System.out.println("Inrese el pago por hora: ");
                    ph = s.nextFloat();

                    if (ht <= 40) {
                        salario = ht * ph;
                        System.out.println("El salario es: " + salario);

                        //Pago_doble
                    } else if (ht <= 50) {
                        //salario= 40*ph + (ht-40)*(2*ph);
                        Extras = ht - 40;
                        Fijo = Extras * ph + ph;
                        salario = 40 * ph + Fijo;
                        System.out.println("El salario es: " + salario);

                        //Pago_triple
                    } else if (ht <= 60) {
                        //salario = 40*ph + 10*(2*ph) +(ht-50) *(3*ph)
                        Extras = (ht - 50) * (ph + ph + ph); //Pago_triple
                        Dif = (50 - 40) * (ph + ph); //Pago_doble
                        Fijo = 40 * ph + Extras + Dif;

                        System.out.println("El salario es: " + Fijo);

                    } else {
                        System.out.println("Excedio el periodo permitido de jornada ");
                    }

                    break;
                case 4:
                    int n, i = 1, suma = 0;
                    System.out.println("Ingrese el valor de n");
                    n = s.nextInt();

                    while (i <= n) {
                        suma = suma + i;
                        i++;
                    }
                    System.out.println("la suma es: " + suma);
            
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
        //System.out.println("presione una tecla para continuar: ");
        //s.next();
    }

    
}
