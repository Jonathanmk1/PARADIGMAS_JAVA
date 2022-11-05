package utilerias;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MetodoExamen {

    ArrayList<String> nomb = new ArrayList();
    ArrayList<Integer> tip = new ArrayList();
    ArrayList<Float> cost = new ArrayList();

    public static void Calificacion() throws IOException {
        ArrayList<String> nombre = new ArrayList();
        ArrayList<Float> examen = new ArrayList();
        ArrayList<Float> Promedio = new ArrayList();
        ArrayList<Float> calificacion = new ArrayList();
        Scanner s = new Scanner(System.in);
        int c = 0, exam, ejercicios;
        String resp, nomb;

        do {
            nomb = Lectura.leerString("Ingrese Su nombre ");
            nombre.add(nomb);
            //porcentaje obtenido en el examen
            exam = Lectura.leerInt("Ingrese que porcentaje obtuvo en su examen (<=100%): ");
            examen.add((float) (exam * 50) / 100);
            //entrega de ejercicios
            ejercicios = Lectura.leerInt("Ingrese cuantos ejercicios entrego (en total fueron 25 ejercicios): ");
            calificacion.add(((float) ejercicios * 50) / 25);
            //promedio resultante
            Promedio.add((float) (examen.get(c) + calificacion.get(c)));
            System.out.println("Quiere ingresar otro alumno?: ");
            resp = s.nextLine();

        } while (resp.equalsIgnoreCase("si"));
        System.out.printf("%-30s %-12s %-10s %-10s\n",
                "\033[36mNOMBRE", "Calf_examen", "Calf_ejer", "PROMEDIO\033[0m");
        for (int i = 0; i < nombre.size(); i++) {
            System.out.printf("%-30s %-12.0f %-10.0f %-10.0f\n",
                    "\033[34m" + nombre.get(i), examen.get(i), calificacion.get(i), Promedio.get(i), "\033[0m");
        }

    }

    public static void Computadoras() throws IOException {

        Scanner s = new Scanner(System.in);
        String nombre, resp;
        int tipo;
        float costo;

        do {
            nombre = Lectura.leerString("Ingrese su nombre: ");
            //nomb.add(nombre);
            tipo = Lectura.leerInt("Que tipo de cliente es? (tipo: 1 o 2 o 3): ");
            //tip.add(tipo);
            costo = Lectura.leerfloat("Ingrese el costo de la computadora");
            //cost.add(costo);
            System.out.println("Quiere ingresar otro alumno?: ");
            resp = s.nextLine();

        } while (resp.equalsIgnoreCase("si"));

    }
    public static void imrpimir(){
        
    }

}
