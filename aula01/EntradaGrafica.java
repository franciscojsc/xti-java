package com.junio.aulaXTI;

import javax.swing.JOptionPane;

public class EntradaGrafica {

    public static void main(String args[]) {

        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        System.out.println(nome);
        JOptionPane.showMessageDialog(null,nome);
       
                
    }
}
