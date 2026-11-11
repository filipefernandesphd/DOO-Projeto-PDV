import java.util.ArrayList;

import br.com.pdv.controller.ProdutoCtrl;
import br.com.pdv.model.Produto;
import br.com.pdv.view.ProdutoView;

public class App {
    public static void main(String[] args) throws Exception {
        // Instanciar View e Controller de Produto
        ProdutoView produtoView = new ProdutoView();
        ProdutoCtrl produtoCtrl = new ProdutoCtrl();

        // Criando um produto
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
        
        // Mostrar produto na tela
        produtoView.exibirProdutos(
            produtoCtrl.listarProdutos()
        );
    }
}
