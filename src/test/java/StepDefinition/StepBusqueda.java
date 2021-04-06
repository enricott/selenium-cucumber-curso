package StepDefinition;


import Bussines.constants.Navegador;
import Bussines.drivers.DriverContext;
import Bussines.drivers.DriverManager;
import Page.InicioPO;
import Page.Producto;
import Page.ResultadoBusqueda;
import cucumber.api.Result;
import cucumber.api.java.ca.I;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class StepBusqueda {

    WebDriver driver = DriverContext.getDriver();


    @Given("^el usuario ingresa a la pagina de PCFactory \"([^\"]*)\"$")
    public void el_usuario_ingresa_a_la_pagina_de_PCFactory(String url) {

        DriverContext.setUp(Navegador.Chrome, url);
    }



    @And("^el usuario realiza la busqueda del producto \"([^\"]*)\"$")
    public void el_usuario_realiza_la_busqueda_del_producto(String producto) {
        InicioPO inicioPO = new InicioPO();
        inicioPO.insertarProducto(producto);
        inicioPO.clickBtnBuscar();

    }

    @And("^el usuario selecciona el producto \"([^\"]*)\"$")
    public void el_usuario_selecciona_el_producto(String nombreproducto) {
        ResultadoBusqueda result = new ResultadoBusqueda();
        result.SeleccionarProducto(nombreproducto);

    }

    @Then("^Se valida que el usuario haya seleccionado el producto \"([^\"]*)\"$")
    public void se_valida_que_el_usuario_haya_seleccionado_el_producto(String arg1) {
        Producto producto = new Producto();
        producto.mostrarTexto();
    }



}
