/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.ed.aula02.estruturadadosexercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class EstruturaDadosExercicio1 {

    public static void main(String[] args) {

        List<String> cor = new ArrayList();

        cor.add("azul");
        cor.add("amarelo");
        cor.add("vermelho");
        cor.add("verde");
        
        System.out.print("Desordenado = ");
        System.out.print(cor);
 
        Collections.sort(cor);
 
        System.out.print("\nOrdenado = ");
        System.out.print(cor);

        cor.remove(1);
 
        System.out.print("\nRemove Segundo = ");
        System.out.println(cor);

    }
}
