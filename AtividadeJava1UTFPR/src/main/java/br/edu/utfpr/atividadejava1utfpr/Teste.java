/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.atividadejava1utfpr;

/**
 *
 * @author nidio
 */
public class Teste {
    
    public static void main(String[] args) {
        Passeio p1 = new Passeio();
        p1.setPlaca("mnb-2563");
        p1.setMarca("Nissan");
        p1.setModelo("Kicks");
        p1.setCor("Branco");
        p1.setVelocMax(190);
        p1.getMotor().setQtdPist(3);
        p1.getMotor().setPotencia(78);
        p1.setQtdPassageiros(5);
        
        System.out.println("Placa: " + p1.getPlaca() + "\n" +
                "Marca: " + p1.getMarca() + "\n"+
                "Modelo: " + p1.getModelo()+ "\n" +
                "Cor: " + p1.getCor()+ "\n" +
                "Velocidade: " + p1.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + p1.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + p1.getMotor().getPotencia()+ "\n"+
                "Passageiros: " + p1.getQtdPassageiros()+ "\n"+
                "Calculo velocidade: " + p1.calcVel(p1.getVelocMax()) + "\n");
        
        Passeio p2 = new Passeio();
        p2.setPlaca("kjh-8521");
        p2.setMarca("Toyota");
        p2.setModelo("Hylux");
        p2.setCor("Vermelho");
        p2.setVelocMax(280);
        p2.getMotor().setQtdPist(2);
        p2.getMotor().setPotencia(90);
        p2.setQtdPassageiros(5);
        
        System.out.println("Placa: " + p2.getPlaca() + "\n" +
                "Marca: " + p2.getMarca() + "\n"+
                "Modelo: " + p2.getModelo()+ "\n" +
                "Cor: " + p2.getCor()+ "\n" +
                "Velocidade: " + p2.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + p2.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + p2.getMotor().getPotencia()+ "\n"+
                "Passageiros: " + p2.getQtdPassageiros()+ "\n"+
                "Calculo velocidade: " + p2.calcVel(p2.getVelocMax()) + "\n");
        
        Passeio p3 = new Passeio();
        p3.setPlaca("tre-1543");
        p3.setMarca("Ford");
        p3.setModelo("Fusion");
        p3.setCor("Verde");
        p3.setVelocMax(230);
        p3.getMotor().setQtdPist(4);
        p3.getMotor().setPotencia(80);
        p3.setQtdPassageiros(5);
        
        System.out.println("Placa: " + p3.getPlaca() + "\n" +
                "Marca: " + p3.getMarca() + "\n"+
                "Modelo: " + p3.getModelo()+ "\n" +
                "Cor: " + p3.getCor()+ "\n" +
                "Velocidade: " + p3.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + p3.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + p3.getMotor().getPotencia()+ "\n"+
                "Passageiros: " + p3.getQtdPassageiros()+ "\n"+
                "Calculo velocidade: " + p3.calcVel(p3.getVelocMax()) + "\n");
        
        Passeio p4 = new Passeio();
        p4.setPlaca("asd-6548");
        p4.setMarca("Fiat");
        p4.setModelo("Bravo");
        p4.setCor("Azul");
        p4.setVelocMax(180);
        p4.getMotor().setQtdPist(3);
        p4.getMotor().setPotencia(60);
        p4.setQtdPassageiros(5);
        
        System.out.println("Placa: " + p4.getPlaca() + "\n" +
                "Marca: " + p4.getMarca() + "\n"+
                "Modelo: " + p4.getModelo()+ "\n" +
                "Cor: " + p4.getCor()+ "\n" +
                "Velocidade: " + p4.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + p4.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + p4.getMotor().getPotencia()+ "\n"+
                "Passageiros: " + p4.getQtdPassageiros()+ "\n"+
                "Calculo velocidade: " + p4.calcVel(p4.getVelocMax()) + "\n");
        
        Passeio p5 = new Passeio();
        p5.setPlaca("brx-1235");
        p5.setMarca("Fiat");
        p5.setModelo("Uno");
        p5.setCor("Preto");
        p5.setVelocMax(130);
        p5.getMotor().setQtdPist(2);
        p5.getMotor().setPotencia(50);
        p5.setQtdPassageiros(4);
        
        System.out.println("Placa: " + p5.getPlaca() + "\n" +
                "Marca: " + p5.getMarca() + "\n"+
                "Modelo: " + p5.getModelo()+ "\n" +
                "Cor: " + p5.getCor()+ "\n" +
                "Velocidade: " + p5.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + p5.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + p5.getMotor().getPotencia()+ "\n"+
                "Passageiros: " + p5.getQtdPassageiros()+ "\n"+
                "Calculo velocidade: " + p5.calcVel(p5.getVelocMax()) + "\n");
    
    
        Carga c1 =new Carga();
        c1.setPlaca("bhg-8535");
        c1.setMarca("Fiat");
        c1.setModelo("Strada");
        c1.setCor("Preto");
        c1.setVelocMax(130);
        c1.getMotor().setQtdPist(2);
        c1.getMotor().setPotencia(50);
        c1.setCargaMax(705);
        c1.setTara(1200);
        
        System.out.println("Placa: " + c1.getPlaca() + "\n" +
                "Marca: " + c1.getMarca() + "\n"+
                "Modelo: " + c1.getModelo()+ "\n" +
                "Cor: " + c1.getCor()+ "\n" +
                "Velocidade: " + c1.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + c1.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + c1.getMotor().getPotencia()+ "\n"+
                "Carga Maxima: " + c1.getCargaMax()+ "\n"+
                "Tara: " + c1.getTara()+ "\n"+
                "Calculo velocidade: " + c1.calcVel(c1.getVelocMax()) + "\n");
        
        Carga c2 =new Carga();
        c2.setPlaca("qwe-8523");
        c2.setMarca("VW");
        c2.setModelo("Saveiro");
        c2.setCor("branca");
        c2.setVelocMax(180);
        c2.getMotor().setQtdPist(2);
        c2.getMotor().setPotencia(60);
        c2.setCargaMax(715);
        c2.setTara(1100);
        
        System.out.println("Placa: " + c2.getPlaca() + "\n" +
                "Marca: " + c2.getMarca() + "\n"+
                "Modelo: " + c2.getModelo()+ "\n" +
                "Cor: " + c2.getCor()+ "\n" +
                "Velocidade: " + c2.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + c2.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + c2.getMotor().getPotencia()+ "\n"+
                "Carga Maxima: " + c2.getCargaMax()+ "\n"+
                "Tara: " + c2.getTara()+ "\n"+
                "Calculo velocidade: " + c2.calcVel(c2.getVelocMax()) + "\n");
        
        Carga c3 =new Carga();
        c3.setPlaca("oiu-7469");
        c3.setMarca("Renault");
        c3.setModelo("Duster");
        c3.setCor("Verde");
        c3.setVelocMax(170);
        c3.getMotor().setQtdPist(2);
        c3.getMotor().setPotencia(55);
        c3.setCargaMax(650);
        c3.setTara(1350);
        
        System.out.println("Placa: " + c3.getPlaca() + "\n" +
                "Marca: " + c3.getMarca() + "\n"+
                "Modelo: " + c3.getModelo()+ "\n" +
                "Cor: " + c3.getCor()+ "\n" +
                "Velocidade: " + c3.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + c3.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + c3.getMotor().getPotencia()+ "\n"+
                "Carga Maxima: " + c3.getCargaMax()+ "\n"+
                "Tara: " + c3.getTara()+ "\n"+
                "Calculo velocidade: " + c3.calcVel(c3.getVelocMax()) + "\n");
        
        Carga c4 =new Carga();
        c4.setPlaca("oiu-7469");
        c4.setMarca("Fiat");
        c4.setModelo("Fiorino");
        c4.setCor("Azul");
        c4.setVelocMax(180);
        c4.getMotor().setQtdPist(2);
        c4.getMotor().setPotencia(75);
        c4.setCargaMax(650);
        c4.setTara(1250);
        
        System.out.println("Placa: " + c4.getPlaca() + "\n" +
                "Marca: " + c4.getMarca() + "\n"+
                "Modelo: " + c4.getModelo()+ "\n" +
                "Cor: " + c4.getCor()+ "\n" +
                "Velocidade: " + c4.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + c4.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + c4.getMotor().getPotencia()+ "\n"+
                "Carga Maxima: " + c4.getCargaMax()+ "\n"+
                "Tara: " + c4.getTara()+ "\n"+
                "Calculo velocidade: " + c4.calcVel(c4.getVelocMax()) + "\n");
        
        Carga c5 =new Carga();
        c5.setPlaca("ofa-7410");
        c5.setMarca("Peugeot");
        c5.setModelo("Partner");
        c5.setCor("Branco");
        c5.setVelocMax(180);
        c5.getMotor().setQtdPist(2);
        c5.getMotor().setPotencia(75);
        c5.setCargaMax(800);
        c5.setTara(1500);
        
        System.out.println("Placa: " + c5.getPlaca() + "\n" +
                "Marca: " + c5.getMarca() + "\n"+
                "Modelo: " + c5.getModelo()+ "\n" +
                "Cor: " + c5.getCor()+ "\n" +
                "Velocidade: " + c5.getVelocMax()+ "\n" +
                "Quantidade Pistão: " + c5.getMotor().getQtdPist()+ "\n" +
                "Potencia: " + c5.getMotor().getPotencia()+ "\n"+
                "Carga Maxima: " + c5.getCargaMax()+ "\n"+
                "Tara: " + c5.getTara()+ "\n"+
                "Calculo velocidade: " + c5.calcVel(c5.getVelocMax()) + "\n");
    
    
    
    
    
    
    
    }




    
    
}
