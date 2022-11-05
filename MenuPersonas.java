package d10112022;

import utilerias.Persona;
import java.io.IOException;
import utilerias.Busqueda;
import utilerias.Lectura;

public class MenuPersonas {

    public static void main(String[] args) throws IOException {
        byte opc, edad, n;
        int id;
        String nom;
        float est;
        Persona p;
        Persona pers[];
        pers = new Persona[10];
        n = 0;

        do {
            Lectura.imprimirString("MENU:\n1.Altas\n2.Reportes\n3.Buscar\n4.Bajas\n5.Modificar\n6.Salir");
            opc = Lectura.leerbyte("Dame una opcion");

            switch (opc) {
                case 1: {
                    id = Lectura.leerInt("Dame Id:");
                    nom = Lectura.leerString("Dame Nombre:");
                    edad = Lectura.leerbyte("Dame Edad:");
                    est = Lectura.leerfloat("Dame Estatura:");
                    p = new Persona(id, nom, edad, est);
                    pers[n] = p;
                    n++;
                }
                break;
                case 2: {
                    for (int i = 0; i < n; i++) {
                        Lectura.imprimirString(pers[i].toString());
                    }
                }
                break;
                case 3: {
                    int po = -1;
                    id = Lectura.leerInt("Dame Id a consultar:");
                    po = Busqueda.buscarIdVector(pers, id, n);
                    if (po != -1) {
                        Lectura.imprimirString(pers[po].toString());
                    } else {
                        Lectura.imprimirString("El id=" + id + " no existe");
                    }

                }
                break;
                case 4: {
                    int po;
                    id = Lectura.leerInt("Dame el id a borrar");
                    po = Busqueda.buscarIdVector(pers, id, n);
                    if (po != -1) {
                        for (int i = po; i < n - 1; i++) {
                            pers[i] = pers[i + 1];
                        }
                        n--;
                        Lectura.imprimirString("El id=" + id + "se borro satisfactoriamente");
                    } else {
                        Lectura.imprimirString("El id=" + id + "no existe");
                    }
                }
                break;
                case 5: {
                    int op, po;
                    do {
                        op = Lectura.leerInt("Que desea modificar?\n1.Nombre\n2.Edad\n3.Estatura\n4.Regresar\nDame una opcion:");
                        switch (op) {
                            case 1:
                                id = Lectura.leerInt("Dame el id de la persona a modificar");
                                po = Busqueda.buscarIdVector(pers, id, n);
                                if (po != -1) {
                                    nom = Lectura.leerString("Dame el nuevo nombre: ");
                                    //¿donde lo guardo?
                                    //p.setNombre(nom);
                                    //pers[po]= nom;
                                    pers[po].setNombre(nom);
                                    Lectura.imprimirString("El Nombre de = " + id + "se modifico satisfactoriamente");
                                } else {
                                    Lectura.imprimirString("El id=" + id + "no existe");
                                }
                                break;
                            case 2:
                                id = Lectura.leerInt("Dame el id de la persona a modificar");
                                po = Busqueda.buscarIdVector(pers, id, n);
                                if (po != -1) {
                                    edad = edad = Lectura.leerbyte("Dame la nueva Edad:");
                                    pers[po].setEdad(edad);
                                    //¿donde lo guardo?
                                    //p.setNombre(nom);
                                    //pers[po]= nom;
                                    
                                    Lectura.imprimirString("la edad de = " + id + "se modifico satisfactoriamente");
                                } else {
                                    Lectura.imprimirString("El id=" + id + "no existe");
                                }
                                break;
                            case 3:
                                id = Lectura.leerInt("Dame el id de la persona a modificar");
                                po = Busqueda.buscarIdVector(pers, id, n);
                                if (po != -1) {
                                    est = Lectura.leerfloat("Dame la nueva Estatura:");
                                    pers[po].setEstatura(est);
                                    //¿donde lo guardo?
                                    //p.setNombre(nom);
                                    //pers[po]= nom;
                                    //o tengo que volver a crear el objeto volviendo a poner las avriables y asi ser sustituidas?
                                    Lectura.imprimirString("la estatura de = " + id + "se modifico satisfactoriamente");
                                } else {
                                    Lectura.imprimirString("El id=" + id + "no existe");
                                }
                                break;
                            case 4:
                                 //p = new Persona(id, nom, edad, est);
                                 Lectura.imprimirString("Ha salido de MODIFICACION");
                            default:
                                Lectura.imprimirString("Opcion no valida, solo se permite (1-4)");
                        }
                    } while (op != 4);
                }
                break;
                case 6: {
                    Lectura.imprimirString("Adios...");
                }
                break;
                default:
                    Lectura.imprimirString("Opcion no valida");
            }
        } while (opc != 6);
    }

}
