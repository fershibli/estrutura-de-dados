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
        
        System.out.println("Hello World!");
    }
}
