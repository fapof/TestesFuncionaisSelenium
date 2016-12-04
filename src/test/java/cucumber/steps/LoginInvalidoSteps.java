package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import testesfuncionais.page.LoginPage;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class LoginInvalidoSteps {

    LoginPage page = new LoginPage();
    @Dado("^que o usuário está na tela de indetificação$")
    public void queOUsuárioEstáNaTelaDeIndetificação() throws Throwable {
        page.opcaoMinhaConta();
        page.opcaoEntrar();
    }

    @Quando("^o usuário informar o \"([^\"]*)\"$")
    public void oUsuárioInformarO(String arg0) throws Throwable {
        page.setEmail(arg0);
    }

    @E("^informar a \"([^\"]*)\"$")
    public void informarA(String arg0) throws Throwable {
        page.setSenha(arg0);
    }

    @E("^clicar na opção continuar$")
    public void clicarNaOpçãoContinuar() throws Throwable {
       page.opcaoContinuar();
    }

    @Entao("^a \"([^\"]*)\" deve ser exibida na tela$")
    public void aDeveSerExibidaNaTela(String arg0) throws Throwable {
        Assert.assertEquals(arg0, page.obterMsg());
    }
}
