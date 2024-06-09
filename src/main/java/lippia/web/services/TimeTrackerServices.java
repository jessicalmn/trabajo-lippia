package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TimeTrakerConstants;

import static lippia.web.services.GenerarDataServices.nombre_tarea;

public class TimeTrackerServices {
    public static void ingresarDescripcionDeLaTarea() {
        GenerarDataServices.generarNombreTareaAletorio();
        WebActionManager.click(TimeTrakerConstants.NOMBRE_TAREA);
        WebActionManager.setInput(TimeTrakerConstants.NOMBRE_TAREA, nombre_tarea);
    }

    public static void inicializarContadorTarea() {
        WebActionManager.click(TimeTrakerConstants.BOTON_START);
    }

    public static void ejecutarTiempoEspera() throws InterruptedException {
        Thread.sleep(20000);
    }

    public static void detenerContadorTarea() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.BOTON_STOP);
        Thread.sleep(3000);
    }

    public static void mensajeConfirmacionCreacionExitosa() {
        WebActionManager.isPresent(TimeTrakerConstants.MSJ_CREACION_TASK_EXITOSO);
    }

    public static void ingresaHoraDeInicio() {
        WebActionManager.click(TimeTrakerConstants.INICIO_TASK);
        WebActionManager.setInput(TimeTrakerConstants.INICIO_TASK,"0800");

    }
    public static void ingresaHoraDeFin() {
        WebActionManager.click(TimeTrakerConstants.FIN_TASK);
        WebActionManager.setInput(TimeTrakerConstants.FIN_TASK,"1200");
    }

    public static void seleccionarTareaManual() {
        WebActionManager.click(TimeTrakerConstants.OPCION_TASK_MANUAL);
    }

    public static void agregarTarea() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.BOTON_ADD_TASK);
        Thread.sleep(3000);
    }

    public static void seleccionaFecha() {
        WebActionManager.click(TimeTrakerConstants.CALENDARIO);
        WebActionManager.click(TimeTrakerConstants.FECHA_DISPONIBLE);
    }

    public static void seleccionarTareaContador() {
        WebActionManager.click(TimeTrakerConstants.OPCION_TASK_CONTADOR);
    }

    public static void menuTareaContador() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.MENU_TASK);
    }
    public static void descartarTarea() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.OPCION_DISCARD);
        WebActionManager.click(TimeTrakerConstants.CONFIRMAR_DISCARD);
        Thread.sleep(2000);
    }

    public static void cancelacionTareaExitosa() {
        WebActionManager.isPresent(TimeTrakerConstants.MSJ_CANCELACION_TASK);
    }

    public static void actualizarNombreTareaExistente() throws InterruptedException {
        GenerarDataServices.generarNombreTareaAletorio();
        WebActionManager.click(TimeTrakerConstants.NOMBRE_TASK_EXISTENTE);
        WebActionManager.setInput(TimeTrakerConstants.NOMBRE_TASK_EXISTENTE, nombre_tarea, true);
        Thread.sleep(2000);
        WebActionManager.click(TimeTrakerConstants.INICIO_TASK_EXISTENTE);
        WebActionManager.isPresent(TimeTrakerConstants.CONFIRMACION_ACTUALIZACION_NOMBRE);
        Thread.sleep(2000);
    }

    public static void actualizarhorarioTareaExistente() throws InterruptedException {

        WebActionManager.click(TimeTrakerConstants.INICIO_TASK_EXISTENTE,true);
        WebActionManager.setInput(TimeTrakerConstants.INICIO_TASK_EXISTENTE, "1600", true);
        Thread.sleep(2000);
        WebActionManager.setInput(TimeTrakerConstants.FIN_TASK_EXISTENTE, "1800",true);
        Thread.sleep(2000);
    }

    public static void actualizarFechaTareaExistente() throws InterruptedException {
        WebActionManager.click(TimeTrakerConstants.CALENDARIO_TASK_EXISTENTE);
        Thread.sleep(2000);
        WebActionManager.click(TimeTrakerConstants.FECHA_DISPONIBLE);
        Thread.sleep(2000);
    }

    public static void confirmacionActualizacionTarea() {
        WebActionManager.isPresent(TimeTrakerConstants.CONFIRMACION_ACTUALIZACION_FECHA);
    }
}
