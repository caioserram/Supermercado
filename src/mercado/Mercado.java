/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caios_000
 */
public class Mercado {

    public static void main(String[] args){
        rodaPrograma();
    }
    
    static List<Caixa> caixas;
    static List<Gerente> gerentes;
    static Estoque estoque;
    
    
    Mercado(List<Caixa> caixas,List<Gerente> gerentes,Estoque estoque){
        this.caixas = caixas;
        this.gerentes = gerentes;
        this.estoque = estoque;
    }
    
    public static void rodaPrograma(){
        List<Caixa> listacaixas = new ArrayList<>();
        List<Gerente> listagerentes = new ArrayList<>();
        Estoque instanciaestoque = new Estoque();
        Controle controle = new Controle();
        Sistema sistema = new Sistema();

        String[] nomes = {"Caio","Jose","Joao","Davi","Felipe","Vitor","Leonardo"};

        for (int i=0;i<7;i++){
            if (i < 5){
            Caixa caixa = new Caixa(nomes[i]);
            listacaixas.add(caixa);
            }
            else{
                Gerente gerente = new Gerente(nomes[i]);
                listagerentes.add(gerente);
            }
        } 
        Mercado mercado = new Mercado(listacaixas,listagerentes,instanciaestoque);
        
        sistema.MenuAcesso(mercado,controle);
    }
    
    boolean procuraFuncionario(Mercado mercado,String nome){
        Caixa caixa = new Caixa(nome);
        return mercado.caixas.contains(caixa);
    }
}
