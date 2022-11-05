
package d10252022;

import Empleado.EmpleadoPorComision;

public class EmpleadoBasemComision extends EmpleadoPorComision {
    private float salariobase;

    public EmpleadoBasemComision(int id, String nombre, String apellido, 
            float ventastotal, float tarifasporcomision, float salariobase) {
        super(id, nombre, apellido, ventastotal, tarifasporcomision);
        this.salariobase = salariobase;
    }

    public float getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(float salariobase) {
        this.salariobase = salariobase;
    }
    
    public float fijo(){
        return salariobase + super.sueldo();
        //return (ventastotal * tarifasporcomision / 100) + salariobase;
        //super.getVentastotal()*super.getTarifasporcomision();
        //para no quitar el private de los atributos de la clase padre, podemos usar los geter 
    }
    @Override
    public String toString(){
        return String.format("%s %-10.2f",super.toString(), fijo());
    }
}
