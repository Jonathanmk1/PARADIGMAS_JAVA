
package d10252022;

import Empleado.*;

public class MenuEmpleados {
    public static void main(String[] args) {
       
        Empleado e = new Empleado(2, "Maria", "lopez");
        EmpleadoPorComision epc = new EmpleadoPorComision(1, "juan", "peres", 1000, 10);
        EmpleadoPorHora ep = new EmpleadoPorHora(3, "jose", "Flores", 2, 100);
        EmpleadoAsalariado a = new EmpleadoAsalariado(4, "Raul", "Martinez", 200);
        EmpleadoBasemComision c = new EmpleadoBasemComision(6, "Fernando", "Jimenez", 2000, 15, 780);
        System.out.println(e);
        System.out.println(epc);
        System.out.println(ep);
        System.out.println(a);
        System.out.println(c);
    }
}
