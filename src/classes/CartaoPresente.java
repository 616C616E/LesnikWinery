/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Alan
 */
public class CartaoPresente extends Produto{

    public CartaoPresente(String tipo, String nome,int quantidadeCarrinho) {
        super(tipo, nome, quantidadeCarrinho);
    }

    @Override
    public void alterarEstoque(int quantidade) {
        
    }
}
