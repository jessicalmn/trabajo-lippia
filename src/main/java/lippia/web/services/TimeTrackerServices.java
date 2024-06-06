package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.TimeTrakerConstants;
import oracle.jdbc.dcn.TableChangeDescription;

public class TimeTrackerServices {
    public static void elClienteIngresaDescripcionDeLaTarea() {
        WebActionManager.click(TimeTrakerConstants.TAREA);
        WebActionManager.setInput(TimeTrakerConstants.TAREA,"Tarea ingresada");
    }

    public static void haceClickEnStart() {
        WebActionManager.click(TimeTrakerConstants.BOTON_START);
    }

    public static void esperaTiempoDeCarga() throws InterruptedException {
        Thread.sleep(20000);
    }

    public static void haceClickEnStop() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.BOTON_STOP);
        Thread.sleep(3000);
    }

    public static void laTareaDeCargaExitosamenteEnElProyecto() {
        WebActionManager.isPresent(TimeTrakerConstants.MSJ_EXITOSO);
    }

    public static void ingresaHoraDeInicioYFin() {
        WebActionManager.click(TimeTrakerConstants.INICIO_TASK);
        WebActionManager.setInput(TimeTrakerConstants.INICIO_TASK,"0800");
        WebActionManager.click(TimeTrakerConstants.FIN_TASK);
        WebActionManager.setInput(TimeTrakerConstants.FIN_TASK,"1200");
    }

    public static void elClienteSeleccionaLaOpcionDeTareaManual() {
        WebActionManager.click(TimeTrakerConstants.TASK_MANUAL);
    }

    public static void haceClickEnElBotonAdd() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.BUTTON_ADD_TASK);
        Thread.sleep(3000);
    }

    public static void seleccionaFecha() {
        WebActionManager.click(TimeTrakerConstants.CALENDARIO);
        WebActionManager.click(TimeTrakerConstants.FECHA_DISPONIBLE);
    }

    public static void elClienteSeleccionaLaOpcionDeTareaConContador() {
        WebActionManager.click(TimeTrakerConstants.TASK_CONTADOR);
    }
}
