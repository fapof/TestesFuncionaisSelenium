package cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.*;
import org.junit.Assert;
import testesfuncionais.page.ProdutoPage;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class CarrinhoSteps {

    ProdutoPage page = new ProdutoPage();

    @Dado("^que o usuário está na pagina da categoria pré-venda$")
    public void queOUsuárioEstáNaPaginaInicial() throws Throwable {
        page.clicarMenu();
        page.clicarSubMenu();
        page.clicarCategoria();
    }

    @Quando("^o usuário estiver da pagina de detalhes do produto$")
    public void oUsuárioEstiverDaPaginaDeDetalhesDoProduto() throws Throwable {
        page.selecionarProduto();
    }

    @E("^clicar na opção comprar$")
    public void clicarNaOpçãoComprar() throws Throwable {
       page.clicarComprar();
    }

    @Então("^o produto deve ser adicionado ao carrinho de compras$")
    public void oProdutoDeveSerAdicionadoAoCarrinhoDeCompras() throws Throwable {
        Assert.assertEquals("1", page.qtdItensNoCarrinho());
    }

    @Quando("^o usuário estiver com produto adicionado no carrinho$")
    public void oUsuárioEstiverComProdutoAdicionadoNoCarrinho() throws Throwable {
        page.selecionarProduto();
        page.clicarComprar();
    }

    @E("^clicar na opção retirar produto do carrinho$")
    public void clicarNaOpçãoRetirarProdutoDoCarrinho() throws Throwable {
        page.removerProduto();
    }

    @Entao("^uma mensagem informando que o carrinho está vazio deve ser exibida na tela$")
    public void umaMensagemInformandoQueOCarrinhoEstáVazioDeveSerExibidaNaTela() throws Throwable {
        Assert.assertEquals("Seu carrinho está vazio", page.msgCarrinhoVazio());
    }
}
