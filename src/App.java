import java.util.ArrayList;
import java.util.Scanner;

import br.com.pdv.controller.MenuCtrl;
import br.com.pdv.controller.ProdutoCtrl;
import br.com.pdv.model.Produto;
import br.com.pdv.view.MenuView;
import br.com.pdv.view.ProdutoView;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        MenuView menuView = new MenuView(scanner);
        ProdutoView produtoView = new ProdutoView();
        ProdutoCtrl produtoCtrl = new ProdutoCtrl();
        
        MenuCtrl menuCtrl = new MenuCtrl(menuView, produtoCtrl, produtoView );
        menuCtrl.iniciar();

        scanner.close();
        


        // // Criando e adicionando produtos
        // produtoCtrl.adicionarProduto(
        //     new Produto(
        //         "Arroz", 
        //         "Arroz Sepé 5kg", 
        //         25.99, 
        //         100
        //     )
        // );

        // produtoCtrl.adicionarProduto(
        //     new Produto(
        //         "Feijão", 
        //         "Feijão Sepé 1kg", 
        //         11.99, 
        //         50
        //     )
        // );
        
        // // Mostrar produto na tela
        // produtoView.exibirProdutos(
        //     produtoCtrl.listarProdutos()
        // );
    }
}
