package testesfuncionais.testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import testesfuncionais.dsl.DriverFactory;
import testesfuncionais.page.LoginPage;

/**
 * Created by Antonio Filho on 04/12/2016.
 */

@RunWith(Parameterized.class)
public class LoginInvalidoTest {

    private WebDriver driver;
    LoginPage page = new LoginPage();

    @Parameterized.Parameter
    public String email;

    @Parameterized.Parameter(value = 1)
    public String senha;

    @Parameterized.Parameter(value = 2)
    public String resultado;

    @Parameterized.Parameters(name="{index} = {1}")
    public static String[][] dados(){
        return new String[][]{
                {"testesfuncionais@gmail.com", "123456", "E-mail ou senha incorretos"},
                {"123456@gmail.com", "testesfuncionais", "E-mail ou senha incorretos"},

        };
    }

    @Before
    public void tearUp(){
        driver = DriverFactory.getDriver();
        page.acessarPaginaInical();
    }

    @Test
    public void loginInvalido(){
        page.opcaoMinhaConta();
        page.opcaoEntrar();
        page.setEmail(email);
        page.setSenha(senha);
        page.opcaoContinuar();

        Assert.assertEquals(resultado, page.obterMsg());
    }

    @After
    public void tearDown(){
        DriverFactory.closeDriver();
    }

}
