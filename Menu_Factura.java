package d11082022;

import Empleado.Empleado;
import java.io.IOException;
import java.util.ArrayList;
import utilerias.Archivo;
import utilerias.Lectura;

public class Menu_Factura {

    public static void main(String[] args) throws IOException {
        int op;
        int id;
        String nombreProducto;
        float precioProducto;
        int cantidad;
        Factura fa;
        //tenemos que generar un arraylist de tipo empleado para guardar todos los registros de los empleados, esto ya que
        // la clase empleado es la madre de todas las demas clases y nos guardara estos datos
       
        ArrayList<Empleado> em = new ArrayList();
        
        ArrayList<Factura> f;
        f = new ArrayList();
        
        do {
            op = Lectura.leerInt("Menu:\n1.Altas\n2.Reportes\n3.Salir");
            switch (op) {
                case 1:
                    Archivo.leer("factura.dat");
                    
                    id = Lectura.leerInt("Ingrese el ID");
                    nombreProducto= Lectura.leerString("Ingrese el nombre del producto");
                    precioProducto = Lectura.leerfloat("Ingrese el precio del producto");
                    cantidad = Lectura.leerInt("Ingrese la cantidad");
                    fa = new Factura(id, nombreProducto, precioProducto, cantidad);
                    f.add(fa);
                    Archivo.guardar(f, "factura.dat");
                    
                    break;
                case 2:
                    for (int i = 0; i < f.size(); i++) {
                        
                        Lectura.imprimirString(f.get(i).toString());
                    }
            }
        } while (op != 3);
    }
}
