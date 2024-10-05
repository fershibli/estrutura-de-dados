/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.ed.aula02.estruturadadosexercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author Alunos
 */
public class EstruturaDadosExercicio2 {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList();
        
        pessoas.add(new Pessoa("Jeremias", 43));
        pessoas.add(new Pessoa("Alberto", 57));
        pessoas.add(new Pessoa("Maria", 32));
        
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
        
        pessoas.forEach((pessoa) -> {
            System.out.printf("\n%s, %d", pessoa.getNome(), pessoa.getIdade()); 
        });
        
    }
}
