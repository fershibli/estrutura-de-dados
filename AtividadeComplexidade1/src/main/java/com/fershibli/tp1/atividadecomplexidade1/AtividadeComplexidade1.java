/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.tp1.atividadecomplexidade1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class AtividadeComplexidade1 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i<= 1_000_000; i++) {
            numeros.add(i);
        }
        long soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        
        System.out.println("Soma dos elementos: " + soma);
    }
}
