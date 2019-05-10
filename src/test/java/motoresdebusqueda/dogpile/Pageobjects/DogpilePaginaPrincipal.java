package motoresdebusqueda.dogpile.Pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.dogpile.com/")
public class DogpilePaginaPrincipal extends PageObject {

    @FindBy(css = "#q")
    WebElementFacade cajaDeBusqueda;

    @FindBy(css = ".search-form-home__button")
    WebElementFacade botonDeBusqueda;


    public void ingresarPalabraClave(String palabraClave) {
        cajaDeBusqueda.type(palabraClave);
    }

    public void realizarBusqueda() {
        botonDeBusqueda.click();
    }
}
