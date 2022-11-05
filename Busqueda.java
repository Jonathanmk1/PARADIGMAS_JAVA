package utilerias;

import java.io.IOException;
import java.util.ArrayList;

public class Busqueda {

    public static int buscarIdVector(Persona pers[], int id, int n) throws IOException {
        int po = -1;        
        for (int i = 0; i < n; i++) {
            if (pers[i].getId() == id) {
                po = i;
                break;
            }
        }
        return po;
    }
   public static int buscarIdArrayList(ArrayList<Persona> pers, int id) throws IOException {
        int po = -1;        
        for (int i = 0; i < pers.size(); i++) {
            if (pers.get(i).getId() == id) {
                po = i;
                break;
            }
        }
        return po;
    }
}
