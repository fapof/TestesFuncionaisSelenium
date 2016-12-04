package testesfuncionais.page;

import testesfuncionais.dsl.Base;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class LoginPage extends Base{

    private static final String URL_SUBMARINO = "http://www.submarino.com.br/";

    public void acessarPaginaInical(){
        driver.navigate().to(URL_SUBMARINO);
    }

    public void setEmail(String email) {
        waitrByName("email");
        escrever("email", email);
    }

    public void setSenha(String senha) {
        waitrByName("password");
        escrever("password", senha);
    }

    public void opcaoMinhaConta(){
        waitrByCssSelector("div.usr-grt-text");
        clicarCssSelector("div.usr-grt-text");
    }

    public void opcaoEntrar(){
        waitrByLink("Entrar");
        clicarLink("Entrar");
    }

    public String obterMsg(){
        return obterTexto("#app-container > div > div.container.page-content > div > div > div:nth-child(1) > div > form > div.alert.alert-error.false > div.alert-content > p");
    }

    public void opcaoContinuar(){
        clicarName("submit_button");
    }

}
