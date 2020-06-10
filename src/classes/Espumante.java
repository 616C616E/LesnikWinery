/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Janise
 */
public class Espumante extends Produto{
    private boolean moscatel;
    private boolean brut;

    public Espumante(boolean moscatel, boolean brut, String tipo, String nome, int quantidadeEstoque, float valorUnidade) {
        super(tipo, nome, quantidadeEstoque, valorUnidade);
        this.moscatel = moscatel;
        this.brut = brut;
    }

    public boolean isMoscatel() {
        return moscatel;
    }

    private void setMoscatel(boolean moscatel) {
        this.moscatel = moscatel;
    }

    public boolean isBrut() {
        return brut;
    }

    private void setBrut(boolean brut) {
        this.brut = brut;
    }

    @Override
    public void alterarEstoque(int quantidade) {
        this.setQuantidadeEstoque(this.getQuantidadeEstoque() - quantidade);
    }
    
    
    
}
