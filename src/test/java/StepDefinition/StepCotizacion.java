package StepDefinition;

import Bussines.constants.Navegador;
import Bussines.drivers.DriverContext;
import Page.InicioPO;
import Page.ResultadoBusqueda;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.List;

public class StepCotizacion {

    String tipoProducto = "Procesador";

    @Given("se inicia navegador \"([^\"]*)\"$")
    public void seIniciaNavegador(String url) {
        DriverContext.setUp(Navegador.Chrome,url);
    }

    @Given("el usuario realiza la busqueda del producto (.*)")
    public void elUsuarioRealizaLaBusquedaDelProductoTipoProducto(String tipoProducto) {
        InicioPO iniPO = new InicioPO();
        iniPO.insertarProducto(tipoProducto);
        iniPO.clickBtnBuscar();
    }

    @And("el usuario selecciona el producto (.*)")
    public void elUsuarioSeleccionaElProductoNombreProducto(String nombreProducto) {
        ResultadoBusqueda result = new ResultadoBusqueda();
        result.SeleccionarProducto(nombreProducto);
    }

    @Given("el usuario realiza la busqueda del producto$")
    public void elUsuarioRealizaLaBusquedaDelProductoTipoProducto(DataTable dataTable) {
        InicioPO iniPO = new InicioPO();
        List<List<String>> dato  = dataTable.asLists(String.class);
        for (List<String> e : dato) {
            if (e.get(0).equals(tipoProducto)){
            iniPO.insertarProducto(e.get(0));
            break;
            }
        }
        iniPO.clickBtnBuscar();
    }
}
