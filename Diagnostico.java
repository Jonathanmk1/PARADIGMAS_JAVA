package d08092022;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Diagnostico {
    String contenido = "";
    
    public void Area() {
        double ladoa, ladob, ladoc, semip, area, area2;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese lado a ");
        ladoa = s.nextDouble();
        System.out.println("Ingrese lado b");
        ladob = s.nextDouble();
        System.out.println("Ingrese lado c");
        ladoc = s.nextDouble();

        semip = (ladoa + ladob + ladoc) / 2;
        area = (semip * (semip - ladoa) * (semip - ladob) * (semip - ladoc));
        area2 = Math.sqrt(area);
        //en raiz negativa no da el resultado 
        System.out.println("El area del tringulo es: " + area2);
    }

    public void Sumatoria() {
        Scanner s = new Scanner(System.in);
        int n, i;
        
        System.out.println("Ingrese el valor de a: ");
        n= s.nextInt();
        for(i=1; i<=n; i++){
            System.out.println("valor de "+ i);
        }

    }

    public void ArchivoContenido() {
        Scanner s = new Scanner(System.in);
        String resp1, resp2;
        System.out.println("Ingrese id del alumno: ");
            resp1 = s.nextLine();
            System.out.println("Ingrese el nombre completo del alumno: ");
            resp2 = s.nextLine();
            contenido = resp1 + " " + resp2;
            
        try {
            File archivo = new File ("C:\\Users\\USER\\OneDrive - Universidad Autónoma del Estado de México\\Pictures\\Archivos\\contenido.txt");
            //si el archivo no existe es creado

            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("  ID " + "     " + "NOMBRE COMPLETO" + "\n");
            bw.write(contenido);
            bw.close();

        } catch (Exception e) {
            System.out.println("Error al crear archivo");

        }
    }
    public void AbrirArchivo() {
        try {

            File archivo = new File("C:\\Users\\USER\\OneDrive - Universidad Autónoma del Estado de México\\Pictures\\Archivos\\contenido.txt");
            Scanner s = new Scanner(archivo);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error al abir el archivo");

        }

    }

    public static void main(String[] args) {
        Diagnostico dg = new Diagnostico();
        Scanner s = new Scanner(System.in);
        int resp;
        System.out.println("Seleccione una opcion");
        System.out.println("1= Area de un tringulo");
        System.out.println("2= Sumatoria");
        System.out.println("3= Alta de Alumno");
        System.out.println("4= Reportes de Alumnos");
        System.out.println("5= Salir");
        resp = s.nextInt();
        while (resp != 5) {
            
            if (resp == 1) {
                dg.Area();
            } else if (resp == 2) {
                dg.Sumatoria();
            } else if (resp == 3) {
                dg.ArchivoContenido();
            } else if (resp == 4) {
                dg.AbrirArchivo();
            } else {
            }
        
            System.out.println("Seleccione una opcion");
            System.out.println("1= Area de un tringulo");
            System.out.println("2= Sumatoria");
            System.out.println("3= Alta de Alumno");
            System.out.println("4= Reportes de Alumnos");
            System.out.println("5= Salir");
            resp = s.nextInt();
        }

    }
}
