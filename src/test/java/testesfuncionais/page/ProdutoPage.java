package testesfuncionais.page;

import testesfuncionais.dsl.Base;

/**
 * Created by Antonio Filho on 04/12/2016.
 */
public class ProdutoPage  extends Base{

    private static final String URL_SUBMARINO = "http://www.submarino.com.br/";

    public void acessarPaginaInicial(){
        driver.navigate().to(URL_SUBMARINO);
    }

    public void clicarMenu(){
        waitrByCssSelector("#h_main-menu > div > div > a > div.mmn-sdb-title");
        clicarCssSelector("#h_main-menu > div > div > a > div.mmn-sdb-title");
    }

    public void clicarSubMenu(){
        waitrByCssSelector("#h_main-menu > div > div > div > div > div:nth-child(3) > ul > li.mmn-item.mmn-submenu.sz.sz-2 > a");
        clicarCssSelector("#h_main-menu > div > div > div > div > div:nth-child(3) > ul > li.mmn-item.mmn-submenu.sz.sz-2 > a");
    }

    public void clicarCategoria(){
        waitrByLink("Pré-venda");
        clicarLink("Pré-venda");
    }

    public void selecionarProduto(){
        waitrByCssSelector("a.prodTitle > span");
        clicarCssSelector("a.prodTitle > span");
    }

    public void clicarComprar(){
        waitrById("bt-buy-product");
        clicarId("bt-buy-product");
    }

    public String qtdItensNoCarrinho(){
        waitrByXpath("//input[@type='text']");
        return obterValor("//input[@type='text']");
    }

    public void removerProduto(){
        waitrByCssSelector("#form-basket > section > article > ul > li > ul > li.basket-item-quantity > ul > li:nth-child(2) > a");
        clicarCssSelector("#form-basket > section > article > ul > li > ul > li.basket-item-quantity > ul > li:nth-child(2) > a");
    }

    public String msgCarrinhoVazio(){
        waitrByCssSelector("section.basket-empty.ng-binding > h2.ng-binding");
        return obterTexto("section.basket-empty.ng-binding > h2.ng-binding");
    }


}
