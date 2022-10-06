 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.atividadejava1utfpr;

/**
 *
 * @author Nidio dos Santos Dolfini at Especialização em Java - Java I - UTFPR
 */

public final class Passeio extends Veiculo implements Calcular{
    private int qtdPassageiros;

    @Override
    public void calcVel() {
        System.out.println("\nVelocidade - PASSEIO: " + (getVelocMax() * 1000) + "M/H");
    }

    public Passeio() {
        super();
        this.qtdPassageiros = 0;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }    

    @Override
    public final int calcular() {
        int totalLetras = 0;
        
        totalLetras += getCor().length();
        totalLetras += getMarca().length();
        totalLetras += getModelo().length();
        totalLetras += getPlaca().length();
        
        return totalLetras;
    }
}
