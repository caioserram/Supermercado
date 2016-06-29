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
abstract class Pessoa {
   String nome;
   String endereço;
   public Pessoa(String Nome, String Endereço){
       this.nome=Nome;
       this.endereço=Endereço;
   }
}
