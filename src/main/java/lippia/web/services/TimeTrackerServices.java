package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TimeTrakerConstants;

import static lippia.web.services.GenerarDataServices.nombre_tarea;

public class TimeTrackerServices {
    public static void elClienteIngresaDescripcionDeLaTarea() {
        GenerarDataServices.generarNombreTareaAletorio();
        WebActionManager.click(TimeTrakerConstants.NOMBRE_TAREA);
        WebActionManager.setInput(TimeTrakerConstants.NOMBRE_TAREA, nombre_tarea);
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
        WebActionManager.isPresent(TimeTrakerConstants.MSJ_CREACION_TASK_EXITOSO);
    }

    public static void ingresaHoraDeInicioYFin() {
        WebActionManager.click(TimeTrakerConstants.INICIO_TASK);
        WebActionManager.setInput(TimeTrakerConstants.INICIO_TASK,"0800");
        WebActionManager.click(TimeTrakerConstants.FIN_TASK);
        WebActionManager.setInput(TimeTrakerConstants.FIN_TASK,"1200");
    }

    public static void elClienteSeleccionaLaOpcionDeTareaManual() {
        WebActionManager.click(TimeTrakerConstants.OPCION_TASK_MANUAL);
    }

    public static void haceClickEnElBotonAdd() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.BOTON_ADD_TASK);
        Thread.sleep(3000);
    }

    public static void seleccionaFecha() {
        WebActionManager.click(TimeTrakerConstants.CALENDARIO);
        WebActionManager.click(TimeTrakerConstants.FECHA_DISPONIBLE);
    }

    public static void elClienteSeleccionaLaOpcionDeTareaConContador() {
        WebActionManager.click(TimeTrakerConstants.OPCION_TASK_CONTADOR);
    }

    public static void haceClickEnElMenuYLaOpcionParaDescartar() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.MENU_TASK);
        WebActionManager.click(TimeTrakerConstants.OPCION_DISCARD);
        WebActionManager.click(TimeTrakerConstants.CONFIRMAR_DISCARD);
        Thread.sleep(2000);
    }

    public static void laTareaSeCancelaExitosamente() {
        WebActionManager.isPresent(TimeTrakerConstants.MSJ_CANCELACION_TASK);
    }
}
