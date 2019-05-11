package motoresdebusqueda.dogpile;

import motoresdebusqueda.dogpile.steps.UsuarioDogpile;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CuandoEjecutamosUnaBusqueda {

    @Steps
    UsuarioDogpile gonza;

    @Managed
    WebDriver driver;

    @Test
    public void deberiamos_ver_resultados_relevantes (){
    gonza.ingresar_a_dogpile();
    gonza.buscar_por_palabra_clave("rock nacional");
    gonza.deberia_ver_resultados_con_palabra("rock");

}

    @Test
    public void resultados_de_wikipedia_contiene_text_correcto (){

      gonza.ingresar_a_dogpile();
      gonza.buscar_por_palabra_clave("rock nacional");
      gonza.debería_ver_resultado_de_titulo_con_texto_correcto("Argentine rock - Wikipedia",
              "Argentine Rock Nacional is one of the principal predecessors");
        System.out.println("Ver si se sube esto");


    }


}
