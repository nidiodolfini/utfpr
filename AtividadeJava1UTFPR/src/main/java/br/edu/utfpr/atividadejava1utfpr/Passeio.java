/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.atividadejava1utfpr;

/**
 *
 * @author nidio
 */
public class Passeio extends Veiculo {
    private int qtdPassageiros;

    @Override
    public float calcVel(float velocMax) {
        return velocMax * 1000;
    }

    public Passeio() {
        super();
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public final void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }    
}
