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
        //--- LinkedList ---//
        System.out.println("\n\n<< LinkedList: Classe do Java >>");
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

        //--- ListaLigada ---//

        System.out.println("\n\n<< ListaLigada: Classe Feita em Aula >>");

        ListaLigada listaLigada = new ListaLigada();

        listaLigada.adicionar(1);
        listaLigada.adicionar(2);
        listaLigada.adicionar(3);
        listaLigada.adicionar(4);

        System.out.println("== Listando Elementos da Lista Ligada ==");
        listaLigada.listarLista();

        listaLigada.adicionarNoMeio(5, 2);

        System.out.println("== Listando Elementos da Lista Ligada ==");
        listaLigada.listarLista();

        System.out.println("== A Lista Ligada está vazia? ==");
        System.out.println(listaLigada.ehVazia());

        System.out.println("== Tamanho da Lista Ligada ==");
        System.out.println(listaLigada.tamanho());

        System.out.println("== Buscando Elemento na Lista Ligada ==");
        int index = listaLigada.buscar(3);
        if (index > -1) {
            System.out.println("Elemento encontrado na posição: " + index);
        } else {
            System.out.println("Elemento não encontrado");
        }

        System.out.println("== Removendo Primeiro Elemento da Lista Ligada ==");
        listaLigada.removerPrimeiro();
        listaLigada.listarLista();

        System.out.println("== Removendo Último Elemento da Lista Ligada ==");
        listaLigada.removerUltimo();
        listaLigada.listarLista();

    }
}
