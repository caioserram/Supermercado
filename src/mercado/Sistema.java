package mercado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author caios_000
 */

public class Sistema {
    
    public static void MenuAcesso(Mercado mercado,Controle controle) {
        int op;
        do{
            System.out.println("[1] ACESSO GERENTE");
            System.out.println("[2] ACESSO CAIXA");
            System.out.println("[3] ACESSO CLIENTE");
            System.out.println("[4] SAIR");
            op = controle.leinteiro();
            switch (op){
                case 1:
                    imprimeMenuGerente(mercado,controle);
                    break;
                case 2:
                    imprimeMenuCaixa(mercado,controle);
                    break;
                case 3:
                    imprimeMenuCliente(mercado,controle);
                    break;       
            }
        } while (op != 4);
    }
    
    public static void imprimeMenuCliente(Mercado mercado,Controle controle) {
        int op;
        do{
            System.out.println("[1] LER VALOR DO PRODUTO");
            System.out.println("[2] SAIR");
            op = controle.leinteiro();
            switch(op){
                case 1:
                    System.out.println("DIGITE O CÓDIGO DO PRODUTO: ");
                    int cod = controle.leinteiro();
                    ProdutoEstoque produto = (mercado.estoque.procuraProdutoEmEstoque(cod));
                    System.out.println(produto.getNome() + ": " + produto.getPreco());
                    break;                
            }  
        } while(op != 2);
        
    }

    public static void imprimeMenuGerente(Mercado mercado,Controle controle) {
        int op;
        do{
            System.out.println("[1] ADICIONAR PRODUTO AO ESTOQUE");
            System.out.println("[2] GERAR RELATÓRIO DE VENDAS");
            System.out.println("[3] GERAR RELATÓRIO DE ESTOQUE");
            System.out.println("[4] SAIR");
            op = controle.leinteiro();
            switch (op){
                case 1: 
                    //adicionar produto ao estoque por gerente.
                    imprimeAdicaoDeProduto(mercado,controle);
                    break;
                case 2:
                    //gerar relatório de vendas por gerente
                    break;
                case 3:
                    //gerar relatório de vendas por gerente.
                    break;
            }    
        } while(op != 4);
    }

    public static void imprimeMenuCaixa(Mercado mercado,Controle controle) {
        int op;
        do{
            System.out.println("[1] VENDER ITEM");
            System.out.println("[2] SAIR");
            op = controle.leinteiro();
             switch (op){
                case 1:
                    boolean flag;
                    do{
                        System.out.println("DIGITE O NOME DO FUNCIONÁRIO: ");
                        String nome = controle.leString();
                        flag = mercado.procuraFuncionario(mercado, nome);
                    } while (!flag);

                    System.out.println("DIGITE O NÚMERO DO CAIXA: ");
                    int ncaixa = controle.leinteiro();

                    System.out.println("QUANTOS ITENS DESEJA VENDER?");
                    int qtd = controle.leinteiro();
                    break;

             }
        } while(op !=2 );
    }
    
    public void imprimeErroDeAdição(){
        System.out.println("PRODUTO JA EXISTE EM ESTOQUE");
        System.out.println("DESEJA ADICIONAR QUANTIDADE? [1] SIM [0] NÃO");
    }
    
    static void imprimeAdicaoDeProduto(Mercado mercado,Controle controle){
        System.out.println("DIGITE O NOME DO PRODUTO: ");
        String nome = controle.leString();
        System.out.println("DIGITE O PREÇO DO PRODUTO: ");
        double preco = controle.leDouble();
        System.out.println("DIGITE A QUANTIDADE DO PRODUTO: ");
        int qtd = controle.leinteiro();
        System.out.println("DIGITE CÓDIGO DO PRODUTO: ");
        int cod = controle.leinteiro();
        ProdutoEstoque produto = new ProdutoEstoque(nome,preco,cod,qtd);
        mercado.estoque.trataAdicaoDeProduto(produto);
    }    
}
