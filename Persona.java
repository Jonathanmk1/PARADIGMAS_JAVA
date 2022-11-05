package utilerias;

public class Persona implements java.io.Serializable {
    private int id;
    private String nombre;
    private byte edad;
    private float estatura;

    public Persona(int id, String nombre, byte edad, float estatura) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona() {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString(){
        System.out.printf("%-5s %-10s %-5s %-10s", "id", "nombre", "edad", "estatura\n");
        return String.format("%-5d %-10s %-5d %-10.2f", id, nombre, edad, estatura);
    }
}
