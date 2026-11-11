package br.com.pdv.controller;

import java.util.ArrayList;

import br.com.pdv.model.Produto;

/**
 * Controla as operações relacionadas
 * aos produtos.
 */
public class ProdutoCtrl {
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    /**
     * Adicionar um produto à lista.
     * @param produto Produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    /**
     * Retorna os produtos cadastrados.
     * @return Lista de produtos.
     */
    public ArrayList<Produto> listarProdutos(){
        return this.produtos;
    }
}
