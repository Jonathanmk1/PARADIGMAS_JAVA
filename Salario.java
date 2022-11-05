package d08182022;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
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
    }
}

//sintaxis de while, do while y for

