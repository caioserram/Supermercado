/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

/**
 *
 * @author caios_000
 */
public class Produto {
    protected String nome;
    protected double preço;
    protected int codigo;
    protected int qtd;
    
    Produto(String nome, double preço, int codigo, int qtd){
        this.nome = nome;
        this.preço=preço;
        this.codigo = codigo;
        this.qtd=qtd;
    }
    
    String getNome(){
        return this.nome;
    }
    
    double getPreco(){
        return this.preço;
    }
    
    int getCodigo(){
        return this.codigo;
    }
    
    int getQtd(){
        return this.qtd;
    }
}
