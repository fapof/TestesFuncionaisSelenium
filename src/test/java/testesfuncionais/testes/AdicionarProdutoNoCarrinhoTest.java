package testesfuncionais.testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import testesfuncionais.dsl.DriverFactory;
import testesfuncionais.page.ProdutoPage;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class AdicionarProdutoNoCarrinhoTest {
    private WebDriver driver;

    ProdutoPage page = new ProdutoPage();

    @Before
    public void tearUp(){
        driver = DriverFactory.getDriver();
        page.acessarPaginaInicial();
    }

    @Test
    public void adcionarProduto(){
        page.clicarMenu();
        page.clicarSubMenu();
        page.clicarCategoria();
        page.selecionarProduto();
        page.clicarComprar();
        page.qtdItensNoCarrinho();

        Assert.assertEquals("1", page.qtdItensNoCarrinho());

    }

    @After
    public void tearDown(){
        DriverFactory.closeDriver();
    }
}
