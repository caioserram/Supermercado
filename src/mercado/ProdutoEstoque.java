/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

/**
 *
 * @author caios_000
 */
public class ProdutoEstoque extends Produto{
    private int quantidade;
    
    ProdutoEstoque(String nome, double preço, int codigo, int quantidade){
        super(nome,preço,codigo,quantidade);
        this.quantidade=quantidade;
    }
    
    
    public void incQuantidade(int inc){
        this.quantidade += inc;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
}
