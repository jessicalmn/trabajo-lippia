package lippia.web.constants;

public class TimeTrakerConstants {

    public static final String TAREA = "xpath://input[@id='undefined']";
    public static final String BOTON_START = "xpath:(//button[contains(.,'Start')])[1]";
    public static final String BOTON_STOP = "xpath:(//button[contains(.,'Stop')])[1]";
    public static final String MSJ_EXITOSO = "xpath://div[@aria-label='Time entry has been created']";
    public static final String TASK_MANUAL = "xpath://IMG[@alt='Add time manually not selected']";
    public static final String TASK_CONTADOR = "xpath://img[@alt='Track time using timer selected']";
    public static final String INICIO_TASK = "xpath:(//input[@tabindex='0'])[2]";
    public static final String FIN_TASK = "xpath:(//input[@tabindex='0'])[3]";
    public static final String BUTTON_ADD_TASK = "xpath:(//BUTTON[@type='button'][text()=' Add '])[1]";
    public static final String CALENDARIO = "xpath:(//img[@alt='Select date from calendar'])[1]";
    public static final String FECHA_DISPONIBLE = "xpath://*[@class='available']";
}
