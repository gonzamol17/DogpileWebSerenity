package motoresdebusqueda.dogpile.steps;

import motoresdebusqueda.dogpile.Pageobjects.DogpilePaginaPrincipal;
import motoresdebusqueda.dogpile.Pageobjects.DogpilePaginaResultado;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioDogpile {
    String actor;

    DogpilePaginaPrincipal paginaPrincipal;
    DogpilePaginaResultado paginaResultados;

    @Step
    public void ingresar_a_dogpile() {
        paginaPrincipal.open();
    }

    @Step
    public void buscar_por_palabra_clave(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
        paginaPrincipal.realizarBusqueda();

    }

    @Step
    public void deberia_ver_resultados_con_palabra (String palabraEsperada) {
        List<String> resultados = paginaResultados.obtenerResultados();
        resultados.replaceAll(String :: toLowerCase);
        for (int i=0; i<resultados.size(); i++)
        {

            System.out.println(resultados.get(i));
        }
        assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabraEsperada)));


    }

    @Step ("#actor deberia ver el texto esperado: {1} en el resultado del titulo{}")
    public void debería_ver_resultado_de_titulo_con_texto_correcto(String tituloDeResultado, String textoDeResultado) {

    }
}
