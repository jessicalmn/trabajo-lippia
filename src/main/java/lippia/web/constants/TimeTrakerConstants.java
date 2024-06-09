package lippia.web.constants;

public class TimeTrakerConstants {

    public static final String NOMBRE_TAREA = "xpath://input[@id='undefined']";

    public static final String OPCION_TASK_CONTADOR = "xpath://img[@alt='Track time using timer selected']";
    public static final String BOTON_START = "xpath:(//button[contains(.,'Start')])[1]";
    public static final String BOTON_STOP = "xpath:(//button[contains(.,'Stop')])[1]";

    public static final String OPCION_TASK_MANUAL = "xpath://IMG[@alt='Add time manually not selected']";
    public static final String INICIO_TASK = "xpath:(//input[@tabindex='0'])[2]";
    public static final String FIN_TASK = "xpath:(//input[@tabindex='0'])[3]";
    public static final String CALENDARIO = "xpath:(//img[@alt='Select date from calendar'])[1]";
    public static final String FECHA_DISPONIBLE = "xpath://*[@class='available']";
    public static final String BOTON_ADD_TASK = "xpath:(//BUTTON[@type='button'][text()=' Add '])[1]";

    public static final String MSJ_CREACION_TASK_EXITOSO = "xpath://div[@aria-label='Time entry has been created']";

    public static final String MENU_TASK = "xpath://img[@src='assets/ui-icons/menu-dots-vertical.svg']";
    public static final String OPCION_DISCARD = "xpath://a[@tabindex='-1'][contains(.,'Discard')]";
    public static final String CONFIRMAR_DISCARD = "xpath://button[@type='button'][contains(.,'Discard')]";
    public static final String MSJ_CANCELACION_TASK = "xpath://div[contains(@aria-label,'Timer cancelled')]";

    public static final String NOMBRE_TASK_EXISTENTE = "xpath:(//input[@type='text'])[6]";
    public static final String INICIO_TASK_EXISTENTE = "xpath:(//input[@type='text'])[7]";
    public static final String FIN_TASK_EXISTENTE = "xpath:(//input[@type='text'])[8]";
    public static final String CALENDARIO_TASK_EXISTENTE = "xpath:(//img[@alt='Select date from calendar'])[2]";

    public static final String CONFIRMACION_ACTUALIZACION_NOMBRE = "xpath://div[@aria-label='Successfully updated description']";
    public static final String CONFIRMACION_ACTUALIZACION_FECHA = "xpath://div[@aria-label='Successfully updated date and time']";

}
