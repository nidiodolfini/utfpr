 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.atividadejava1utfpr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nidio dos Santos Dolfini at Especialização em Java - Java I - UTFPR
 */

public class Leitura {
    
    public String entDados(String rotulo){
        System.out.println(rotulo);
        InputStreamReader entradaTeclado = new InputStreamReader(System.in);
        BufferedReader buffEntrada = new BufferedReader(entradaTeclado);
        String textoDigitado = "";
        try {
            textoDigitado = buffEntrada.readLine();
        } catch (IOException e) {
            System.out.println("Erro na leitura");
        }
        return textoDigitado;
    }
    
}
