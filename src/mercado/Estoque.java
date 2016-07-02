/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author caios_000
 */
public class Estoque {
    private final Map<Integer,ProdutoEstoque> listaProdutos;
    
    public Estoque(){
        this.listaProdutos = new HashMap<>();
    }
    
    void trataAdicaoDeProduto(ProdutoEstoque produto){
        Scanner teclado = new Scanner(System.in);
        if(!verificaProduto(produto)){
            this.listaProdutos.put(produto.codigo,produto);
        }
        else{    
            //int op = menu.imprimeErroDeAdição();
            System.out.println("PRODUTO JA EXISTE EM ESTOQUE");
            System.out.println("DESEJA ADICIONAR UNIDADES? [1] SIM [2] NÃO");
            int op = teclado.nextInt();
            switch (op){
                case 1: 
                    //TODO incrementar quantidade de produto em estoque
                    this.alteraQtdEmEstoque(produto);
                    break;
            }
        }
    }
    
    private void alteraQtdEmEstoque(ProdutoEstoque produto){
        (procuraProdutoEmEstoque(produto.codigo)).incQuantidade(produto.getQtd());
    }
    
    boolean verificaProduto (ProdutoEstoque produto){
        return this.listaProdutos.containsKey(produto.codigo);
    }
    
    ProdutoEstoque procuraProdutoEmEstoque(int cod){
        return this.listaProdutos.get(cod);
    }
    
    
}