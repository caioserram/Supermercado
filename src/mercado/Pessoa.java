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
public class Pessoa {
    protected String nome;
    
    Pessoa(String nome){
        this.nome = nome;
    }
    
    String getNome(){
        return this.nome;
    }
}
