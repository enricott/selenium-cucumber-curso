package Page;

import Bussines.drivers.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Producto {
    public Producto() {
        PageFactory.initElements(DriverContext.getDriver(), this);
    }

    @FindBy(xpath="//*[@id=\"id_ficha_producto\"]/div[3]/div[2]/div/div[3]/div[1]/h1/span[2]")
    private WebElement labelNombre;

    @FindBy (xpath="//td[contains(text(),'Intel')]")
    private WebElement labelMarca;

    @FindBy (xpath="//*[@class=\"ficha_precio_normal\"]/h2")
    private WebElement labelPrecioNormal;

    @FindBy (xpath="//*[@class=\"ficha_precio_efectivo\"]/h2")
    private WebElement labelPrecioOferta;

    @FindBy (xpath="//*[@id=\"tab_ficha_tecnica\"]")
    private WebElement pestFichaTecnica;

    @FindBy (xpath="//*[@id=\"parentHorizontalTab\"]/ul/li[1]")
    private WebElement pestDescripcion;

    @FindBy (xpath="//*[@id=\"tabla_ficha_tecnica\"]/tbody/tr[1]/td[2]")
    private WebElement labelID;

        public void mostrarTexto(){
            System.out.println(labelNombre.getText());
            pestFichaTecnica.click();
            System.out.println(labelMarca.getText());
            pestDescripcion.click();
            System.out.println(labelPrecioNormal.getText());
            System.out.println(labelPrecioOferta.getText());
            pestFichaTecnica.click();
            System.out.println(labelID.getText());
        }
}
