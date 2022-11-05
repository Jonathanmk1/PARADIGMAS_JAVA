package d10182022;

import java.io.*;
import utilerias.Persona;
import java.util.ArrayList;
import utilerias.Archivo;
import utilerias.Busqueda;
import utilerias.Lectura;

public class MenuPersonasArchivos {

    public static void main(String[] args) throws IOException {
        byte opc, edad;
        int id;
        String nom;
        float est;
        Persona p;
        //Persona pers[];
        //pers = new Persona[10];
        ArrayList<Persona> pers;
        pers = new ArrayList();
        do {
            Lectura.imprimirString("MENU:\n1.Altas\n2.Bajas\n3.Consultar\n4.Modificar\n5.Reportes\n6.Salir");
            opc = Lectura.leerbyte("Dame una opcion:");

            switch (opc) {
                case 1: {
                    Archivo.leer("personas.dat");
                    id = Lectura.leerInt("Dame Id:");
                    nom = Lectura.leerString("Nombre:");
                    edad = Lectura.leerbyte("Dame Edad:");
                    est = Lectura.leerfloat("Dame Estatura:");
                    p = new Persona(id, nom, edad, est);
                    pers.add(p);
                    Archivo.guardar(pers, "personas.dat");
                }
                break;
                case 2: {
                    int po;
                    Archivo.leer("personas.dat");
                    id = Lectura.leerInt("Dame al id a borrar:");
                    po = Busqueda.buscarIdArrayList(pers, id);
                    if (po != -1) {

                        pers.remove(po);
                        Archivo.guardar(pers, "personas.dat");
                        Lectura.imprimirString("El id=" + id + " se borro satisfactoriamente");
                    } else {
                        Lectura.imprimirString("El id=" + id + " no existe");
                    }

                }
                break;
                case 3: {
                    Archivo.leer("personas.dat");
                    int po = -1;
                    id = Lectura.leerInt("Dame Id a consultar:");
                    //po = Busqueda.buscarIdVector(pers, id, n);
                    po = Busqueda.buscarIdArrayList(pers, id);
                    if (po != -1) {
                        //Lectura.imprimirString(pers[po].toString());
                        Lectura.imprimirString(pers.get(po).toString());
                    } else {
                        Lectura.imprimirString("El id=" + id + " no existe");
                    }

                }
                break;
                case 5: {
                    pers = Archivo.leer("personas.dat");
                    for (int i = 0; i < pers.size(); i++) {
                        //Lectura.imprimirString(pers[i].toString());
                        Lectura.imprimirString(pers.get(i).toString());
                    }

                }
                break;
                case 4: {
                    pers=Archivo.leer("personas.dat");
                    int op, po;
                    do {
                        op = Lectura.leerInt("Que desea modificar?\n1.Nombre\n2.Edad\n3.Estatura\n4.Regresar\nDame una opcion:");
                        switch (op) {
                            case 1:
                                id = Lectura.leerInt("Dame el id de la persona a modificar");
                                po = Busqueda.buscarIdArrayList(pers, id);
                                if (po != -1) {
                                    nom = Lectura.leerString("Dame el nuevo nombre: ");
                                    pers.get(po).setNombre(nom);
                                    Archivo.guardar(pers, "personas.dat");
                                    Lectura.imprimirString("El Nombre de = " + id + "se modifico satisfactoriamente");
                                } else {
                                    Lectura.imprimirString("El id=" + id + "no existe");
                                }
                        }
                    }while(op !=4);
                    
                        }
                        break;
                      case 6: {
                    Lectura.imprimirString("Adios...");
                }
                break;
                default:
                    Lectura.imprimirString("Opcion no valida");
            }
        
                }
                while (opc != 6);

            }

        }
