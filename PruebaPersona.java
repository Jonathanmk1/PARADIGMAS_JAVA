package d09272022;

import utilerias.Persona;

/*
MENU
-altas de una persona
- reportes
- salir 
*/
public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.setId(1812963);
        p.setNombre("jonathan");
        p.setEdad((byte)18);
        p.setEstatura(1.61f);
        
        System.out.println(p);
    }
    
}
















/*
public static String leerNombre() {
        Persona p = new Persona();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        p.setNombre(s.nextLine());
        return p.getNombre();
    }
    public static int id(){
        Persona p = new Persona();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su id: ");
        p.setId(s.nextInt());
        return p.getId();
    }
    public static byte edad(){
        Persona p = new Persona();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        p.setId(s.nextByte());
        return p.getEdad();
    }
    public static short estatura(){
        Persona p = new Persona();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su estatura en cm: ");
        p.setId(s.nextInt());
        return p.getEstatura();
    }
    public static void main(String[] args) {
       
        Persona p = new Persona();
        
        System.out.println("los datos son:"
                + "Nombre: " + p.getNombre() + "id: " + p.getId() + 
                "Edad: " + p.getEdad() + "Estatura: " + p.getEstatura());
    }
*/