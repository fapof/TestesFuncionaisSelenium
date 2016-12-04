package testesfuncionais;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testesfuncionais.testes.AdicionarProdutoNoCarrinhoTest;
import testesfuncionais.testes.LoginInvalidoTest;
import testesfuncionais.testes.RemoverProdutoDoCarrinhoTest;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdicionarProdutoNoCarrinhoTest.class,
        RemoverProdutoDoCarrinhoTest.class,
        LoginInvalidoTest.class,
})
public class SuiteTest {
    @BeforeClass
    public static void setupClass(){
        System.out.println("Setup Class");
    }

    @AfterClass
    public static void teardownClass(){
        System.out.println("TearDown Class");
    }
}
