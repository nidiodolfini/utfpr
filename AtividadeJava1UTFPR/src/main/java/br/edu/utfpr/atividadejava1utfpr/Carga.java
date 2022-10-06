/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.atividadejava1utfpr;

/**
 *
 * @author Nidio dos Santos Dolfini at Especialização em Java - Java I - UTFPR
 */

public final class Carga extends Veiculo implements Calcular{
    private int cargaMax;
    private int tara;

    public Carga() {
        super();
        this.cargaMax = 0;
        this.tara = 0;
    }
  
    @Override
    public final void calcVel() {
        System.out.println("\nVelocidade CARGA: " + getVelocMax()*10000 +" CM/H");
    }

    public final int getCargaMax() {
        return cargaMax;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public final int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }
    
    @Override
    public final int calcular() {
        int totalInt = 0;
        
        totalInt += getCargaMax();
        totalInt += getTara();
        totalInt += getVelocMax();
        totalInt += getQtdRodas();
        totalInt += getMotor().getPotencia();
        totalInt += getMotor().getQtdPist();                
        
        return totalInt;
    }
}
