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
public class Vinho extends Produto{
    private boolean tinto;
    private boolean branco;
    private boolean rose;

    public Vinho(boolean tinto, boolean branco, boolean rose, String tipo, String nome, int quantidadeEstoque, float valorUnidade) {
        super(tipo, nome, quantidadeEstoque, valorUnidade);
        this.tinto = tinto;
        this.branco = branco;
        this.rose = rose;
    }

    public boolean isTinto() {
        return tinto;
    }

    private void setTinto(boolean tinto) {
        this.tinto = tinto;
    }

    public boolean isBranco() {
        return branco;
    }

    private void setBranco(boolean branco) {
        this.branco = branco;
    }

    public boolean isRose() {
        return rose;
    }

    private void setRose(boolean rose) {
        this.rose = rose;
    }

    @Override
    public void alterarEstoque(int quantidade) {
        this.setQuantidadeEstoque(this.getQuantidadeEstoque() - quantidade);
    }
    
    
    
}
