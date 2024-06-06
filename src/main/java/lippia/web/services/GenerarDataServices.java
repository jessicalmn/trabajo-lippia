package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;


public class GenerarDataServices {
    public static String nombre_tarea;
    public static void generarNombreTareaAletorio() {
        int longitud;
        longitud = 6;
        String nombre_tarea = "";
        for (int cont = 1; cont <= longitud; cont++) {
            int num = (int) ((Math.random() * (('z' - 'a') + 1)) + 'a');
            char letra = (char) num;
            nombre_tarea = nombre_tarea + letra;
        }


    }
}
