@General
Feature: Ejemplo Background


  Background: Levantamiento pagina web
    Given se inicia navegador "https://www.pcfactory.cl/"

  @Test01
  Scenario Outline: Cotizacion de Productos
      Given el usuario realiza la busqueda del producto <TipoProducto>
      And el usuario selecciona el producto <NombreProducto>
      Examples:
        | TipoProducto | NombreProducto                   |
        | Procesador   | CPU Celeron G1820                |
        | Disco SSD    | Unidad SSD 240GB Sata3 2.5" A400 |

  @Test02
  Scenario Outline: Cotizacion de Productos
    Given el usuario realiza la busqueda del producto
    | Procesador   |
    |Meroria Ram   |
    |Disco SSD     |
    And el usuario selecciona el producto <NombreProducto>
    Examples:
      |NombreProducto                    |
      | CPU Celeron G1820                |