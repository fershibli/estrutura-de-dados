/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.ed.aula01.arrays_matrizes_collections;

import javax.swing.*;

/**
 *
 * @author Alunos
 */
public class Arrays_matrizes_collections {

    public static void main(String[] args) {
        
        int mat[][], diag[], lin, col;
        
        lin = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas/colunas tem a matriz?"));
        
        col = lin;
        mat = new int[lin][col];
        diag = new int[lin];
        
        String resposta = "Colunas";
        col = 0;
        for (int[] m  : mat) {
            for (int coluna = 0; coluna < m.length; coluna++) {
                m[coluna] = (int) (Math.random() * 10);
            }
            resposta += "\t" + col++;
        }
        
        resposta += "\nLinhas";
        for (int coluna = 0; coluna < mat[0].length; coluna++) {
            resposta += "\t-";
        }
        
        lin = 0;
        for (int[] m  : mat) {
            resposta += "\n" + lin++ + "   |";
            for (int coluna = 0; coluna < m.length; coluna++) {
                m[coluna] = (int) (Math.random() * 10);
                resposta += "\t" + m[coluna];
            }
        }
        
        resposta += "\n\nDiagonal Principal = ";
        col = 0;
        
        for (int[] m : mat) {
            resposta += " " + m[col++];
        }
        
        JTextArea saida = new JTextArea(resposta);
        System.out.println(resposta);
        JOptionPane.showMessageDialog(null, saida);
    }
}
