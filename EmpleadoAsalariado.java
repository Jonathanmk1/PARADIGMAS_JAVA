
package Empleado;

import d10252022.Empleado;

public class EmpleadoAsalariado extends Empleado{
    private float salario;

    public EmpleadoAsalariado(int id, String nombre, String apellido, float salario) {
        super(id, nombre, apellido);
        this.salario = salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    public float sueldo(){
        return salario;
    }
    @Override
    public String toString(){
        return String.format("%s %-10.2f",super.toString(), salario);
    }
    
}
