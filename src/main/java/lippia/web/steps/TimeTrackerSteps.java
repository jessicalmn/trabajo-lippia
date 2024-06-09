package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TimeTrackerServices;

public class TimeTrackerSteps extends PageSteps {


    @And("El cliente ingresa descripcion de la tarea")
    public void elClienteIngresaDescripcionDeLaTarea()
    {
        TimeTrackerServices.ingresarDescripcionDeLaTarea();
    }

    @And("hace click en start")
    public void haceClickEnStart()
    {
        TimeTrackerServices.inicializarContadorTarea();
    }

    @And("espera tiempo de carga")
    public void esperaTiempoDeCarga() throws InterruptedException
    {
        TimeTrackerServices.ejecutarTiempoEspera();
    }

    @When("hace click en stop")
    public void haceClickEnStop() throws InterruptedException
    {
        TimeTrackerServices.detenerContadorTarea();
    }

    @Then("la tarea de carga exitosamente en el proyecto")
    public void laTareaDeCargaExitosamenteEnElProyecto()
    {
        TimeTrackerServices.mensajeConfirmacionCreacionExitosa();
    }

    @And("ingresa hora de inicio y fin")
    public void ingresaHoraDeInicioYFin()
    {
        TimeTrackerServices.ingresaHoraDeInicio();
        TimeTrackerServices.ingresaHoraDeFin();
    }

    @Given("El cliente selecciona la opcion de tarea manual")
    public void elClienteSeleccionaLaOpcionDeTareaManual()
    {
        TimeTrackerServices.seleccionarTareaManual();
    }

    @When("hace click en el boton Add")
    public void haceClickEnElBotonAdd() throws InterruptedException {
        TimeTrackerServices.agregarTarea();
    }

    @And("selecciona fecha")
    public void seleccionaFecha() {
        TimeTrackerServices.seleccionaFecha();
    }

    @Given("El cliente selecciona la opcion de tarea con contador")
    public void elClienteSeleccionaLaOpcionDeTareaConContador() {
        TimeTrackerServices.seleccionarTareaContador();

    }

    @When("hace click en el menu y la opcion para descartar")
    public void haceClickEnElMenuYLaOpcionParaDescartar() throws InterruptedException {
        TimeTrackerServices.menuTareaContador();
        TimeTrackerServices.descartarTarea();
    }

    @Then("la tarea se cancela exitosamente")
    public void laTareaSeCancelaExitosamente() {
        TimeTrackerServices.cancelacionTareaExitosa();
    }

    @When("el cliente modifica los datos de la tarea en la grilla")
    public void elClienteModificaLosDatosDeLaTareaEnLaGrilla() throws InterruptedException {
        TimeTrackerServices.actualizarNombreTareaExistente();
        TimeTrackerServices.actualizarBillableTareaExistente();
        TimeTrackerServices.actualizarhorarioTareaExistente();
        TimeTrackerServices.actualizarFechaTareaExistente();
    }

    @Then("la tarea se actualiza exitosamente")
    public void laTareaSeActualizaExitosamente() {
        TimeTrackerServices.confirmacionActualizacionTarea();
    }
}
