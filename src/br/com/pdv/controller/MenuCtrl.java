package br.com.pdv.controller;

import br.com.pdv.view.MenuView;
import br.com.pdv.view.ProdutoView;

public class MenuCtrl {
    private MenuView menuView;
    private ProdutoCtrl produtoCtrl;
    private ProdutoView produtoView;

    public MenuCtrl(MenuView menuView, ProdutoCtrl produtoCtrl, ProdutoView produtoView){
        this.menuView = menuView;
        this.produtoCtrl = produtoCtrl;
        this.produtoView = produtoView;
    }

    // inicia o menu principal
    // e executa conforme a opcao escolhida
    public void iniciar(){
        int opcao;

        do { 
            opcao = this.menuView.mostrarMenuPrincipal();

            switch(opcao){
                case 1: // cadastrar prouduto
                    System.out.println("Cadastrar produto");
                    this.produtoCtrl.adicionarProduto(
                        this.produtoView.cadastrarProduto(menuView.getScanner())
                    );
                    break;
                case 2:
                    // implementacao
                    break;
                case 0:
                    System.out.println("Encerrando o sistema!");
                    System.exit(0); // encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }

        } while(opcao != 0);
    }
}
