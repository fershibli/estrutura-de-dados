/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.ed.aula06.lista_encadeada;

import java.util.LinkedList;

/**
 *
 * @author Alunos
 */
public class Lista_encadeada {

    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");
        lista.add("elemento4");
        System.out.println("== Listando Elementos da Lista ==");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
        lista.remove(1);
        System.out.println("== Listando Elementos da Lista ==");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        System.out.println("== Listando Elementos em Determinadas Posições ==");

        System.out.println(lista.getFirst());
        System.out.println(lista.getLast());
        System.out.println(lista.element());
        System.out.println(lista.get(lista.size() - 1));

        lista.addFirst("elemento0");
        lista.addLast("elemento5");

        System.out.println("== Listando Elementos da Lista ==");

        for (String elemento : lista) {
            System.out.println(elemento);
        }

    }
}
