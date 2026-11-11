package br.com.pdv.view;

import java.util.ArrayList;

import br.com.pdv.model.Produto;

/**
 * Responsável pela interação com o usuário,
 * via terminal, nas operações relacionadas
 * aos produtos.
 */
public class ProdutoView {
    /**
     * Exibe as informações dos produtos.
     * 
     * @param produtos Produtos a serem exibidos.
     */
    public void exibirProdutos(ArrayList<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return; // encerra a execução do método
        }

        System.out.println("=== INFORMAÇÕES DOS PRODUTOS ===");

        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("------------------");
        }

    }
}
