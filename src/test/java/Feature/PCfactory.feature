Feature: Flujo de Busqueda

  @flujo-feliz
  Scenario: : Flujo de busqueda
    Given el usuario ingresa a la pagina de PCFactory "https://www.pcfactory.cl/"
    And el usuario realiza la busqueda del producto "Procesador"
    And el usuario selecciona el producto "CPU Celeron G1820"
    Then Se valida que el usuario haya seleccionado el producto "Intel® CPU Celeron G1820"

