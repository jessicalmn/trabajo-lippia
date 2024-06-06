package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.GenerarDataServices;
import lippia.web.services.ProjectServices;
import lippia.web.services.TimeTrackerServices;

import java.sql.Time;

public class TimeTrackerSteps extends PageSteps {

    @Given("El cliente ingresa descripcion de la tarea")
    public void elClienteIngresaDescripcionDeLaTarea()
    {
        GenerarDataServices.generarNombreTareaAletorio();
        TimeTrackerServices.elClienteIngresaDescripcionDeLaTarea();
    }

    @And("hace click en start")
    public void haceClickEnStart() {

        TimeTrackerServices.haceClickEnStart();
    }

    @And("espera tiempo de carga")
    public void esperaTiempoDeCarga() throws InterruptedException {
        TimeTrackerServices.esperaTiempoDeCarga();
    }

    @When("hace click en stop")
    public void haceClickEnStop() throws InterruptedException {
        TimeTrackerServices.haceClickEnStop();
    }

    @Then("la tarea de carga exitosamente en el proyecto")
    public void laTareaDeCargaExitosamenteEnElProyecto() {
        TimeTrackerServices.laTareaDeCargaExitosamenteEnElProyecto();
    }

    @And("ingresa hora de inicio y fin")
    public void ingresaHoraDeInicioYFin() {

        TimeTrackerServices.ingresaHoraDeInicioYFin();
    }

    @Given("El cliente selecciona la opcion de tarea manual")
    public void elClienteSeleccionaLaOpcionDeTareaManual() {
        TimeTrackerServices.elClienteSeleccionaLaOpcionDeTareaManual();
    }

    @When("hace click en el boton Add")
    public void haceClickEnElBotonAdd() throws InterruptedException {
        TimeTrackerServices.haceClickEnElBotonAdd();
    }

    @And("selecciona fecha")
    public void seleccionaFecha() {

        TimeTrackerServices.seleccionaFecha();
    }

    @Given("El cliente selecciona la opcion de tarea con contador")
    public void elClienteSeleccionaLaOpcionDeTareaConContador() {
        TimeTrackerServices.elClienteSeleccionaLaOpcionDeTareaConContador();

    }
}
