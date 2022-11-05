
package utilerias;

import java.io.*;

public class ManejoDeArchivo {
     //creo metodos para manejar los archivos

    public static void crearArchivo(String nombArc) {

        File archivo = new File(nombArc);

        try {
            //Creamos archivo
            PrintWriter salida = new PrintWriter(archivo); //Sirve para crear y escribir un archivo
            salida.close();//Cerramos el flujo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    //Escribir en el archivo creado
    public static void escribirArchivo(String nombAr, String contenido) {

        File a = new File(nombAr);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(a, true));//Cuando le añadimos el otro objetos 
            //hacemos que no se elimine ni se reescriba ademas añadimos true para que
            //siga escribiendo en ese mismo archivo
            salida.println(contenido);
            salida.close();//Cerramos el flujo
            System.out.println("Se escribio en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {//se añadio otra exception por la creacion de l otro objeto 
            ex.printStackTrace(System.out);
        }
    }

    //Para leer el archivo
    public static void leerArchivo(String nombAr) {

        File a = new File(nombAr);

        try {
            BufferedReader t = new BufferedReader(new FileReader(a));//Usamos Buffer para leer el archivo  
            String lectura = t.readLine();
            System.out.println("Se escribio en el archivo: ");
            while (lectura != null) {
                System.out.println(lectura);
                lectura = t.readLine();
            }
            t.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {//se añadio otra exception por la creacion de l otro objeto 
            ex.printStackTrace(System.out);
        }
    }

    //Para eliminar un archivo
    public static void eliminarArchivo(String nombAr) {
        File a = new File(nombAr);
        a.delete();
        System.out.println("Se elimino el archivo correctamente");
    }
}