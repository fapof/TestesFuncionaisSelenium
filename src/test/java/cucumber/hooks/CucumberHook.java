package cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testesfuncionais.dsl.DriverFactory;
import testesfuncionais.page.LoginPage;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class CucumberHook {

    LoginPage page = new LoginPage();
    @Before
    public void iniciarCenario(){
        page.acessarPaginaInical();
    }

    @After
    public void finalizarCenrario(){
        DriverFactory.closeDriver();
    }
}
