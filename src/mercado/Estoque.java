/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import java.util.List;

/**
 *
 * @author caios_000
 */
public class Estoque {
    private List<ProdutoEstoque> estoque;
    
    void trataAdicaoDeProduto(ProdutoEstoque produto){
        if(!verificaProduto(produto)){
            this.estoque.add(produto);
        }
        else{    
            Menu menu = new Menu();
            int op = menu.imprimeErroDeAdição();
            switch (op){
                case 1: 
                    //TODO incrementar quantidade de produto em estoque
                    this.alteraQtdEmEstoque(produto);
                    break;
            }
        }
    }
    
    private void alteraQtdEmEstoque(ProdutoEstoque produto){
        (this.estoque.get(this.estoque.indexOf(produto))).incQuantidade(produto.getQuantidade());
    }
    
    boolean verificaProduto (ProdutoEstoque produto){
        return this.estoque.contains(produto);
    }
}
