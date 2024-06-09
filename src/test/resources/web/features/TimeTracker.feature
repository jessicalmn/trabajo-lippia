@TimeTracker
Feature: Projects

  Background:
    And El cliente esta en la pagina principal
    And El cliente hace click en Inicia la sesion
    And El cliente hace click en la opcion login manual
    And El cliente ingresa correo electronico "practica4_lippia_jessica@yopmail.com"
    And El cliente ingresa contrasena "practica4lippia"
    And El cliente hace click en el boton Log In
    And El cliente verifica que esta en la pagina inicial de cliente logueado


  @AgregarTaskAuto
  Scenario: Agregar tarea con contador de tiempo automatico
    Given El cliente selecciona la opcion de tarea con contador
    And El cliente ingresa descripcion de la tarea
    And hace click en start
    And espera tiempo de carga
    When hace click en stop
    Then la tarea de carga exitosamente en el proyecto

  @AgregarTaskManual
  Scenario: Agregar tarea con contador de tiempo manual
    Given El cliente selecciona la opcion de tarea manual
    And El cliente ingresa descripcion de la tarea
    And ingresa hora de inicio y fin
    And selecciona fecha
    When hace click en el boton Add
    Then la tarea de carga exitosamente en el proyecto

    @DescartarTask
    Scenario: Descartar tarea ingresada
      Given El cliente selecciona la opcion de tarea con contador
      And El cliente ingresa descripcion de la tarea
      And hace click en start
      And espera tiempo de carga
      When hace click en el menu y la opcion para descartar
      Then la tarea se cancela exitosamente

  @ModificarTask
  Scenario: Modificar tarea ingresada
    Given El cliente selecciona la opcion de tarea manual
    And El cliente ingresa descripcion de la tarea
    And ingresa hora de inicio y fin
    And selecciona fecha
    And hace click en el boton Add
    And la tarea de carga exitosamente en el proyecto
    When el cliente modifica los datos de la tarea en la grilla
    Then la tarea se actualiza exitosamente
