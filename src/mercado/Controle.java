/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

import java.util.Scanner;
import Module.Estoque;
import Module.Caixa;
import Module.Gerente;
import Module.Mercado;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author caios_000
 */
public class Controle {
    
    
    public int leinteiro(){
        Scanner teclado = new Scanner(System.in);
        int op = teclado.nextInt();
        return op;
    }
    
    int chamaLeitor(){
        
        return 0;
    }
    
    public double leDouble() {
        Scanner teclado = new Scanner(System.in);
        double op = teclado.nextDouble();
        return op;
    }

    public String leString() {
        Scanner teclado = new Scanner(System.in);
        String op = teclado.next();
        return op;
    }
}
