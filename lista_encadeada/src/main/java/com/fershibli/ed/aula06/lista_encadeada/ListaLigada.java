/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.ed.aula06.lista_encadeada;

import java.util.LinkedList;

/**
 *
 * @author Alunos
 */
public class ListaLigada {
    LinkedList<No> lista = null;
    
    public ListaLigada() {
        lista = new LinkedList<>();
    }
    
    protected void adicionar(int n) {
        No no = new No(n, null);
        lista.add(no);
        if (lista.size() > 1) {
            No na = lista.get(lista.size() - 2);
            na.setProxNo(no);
            lista.set(lista.size() - 2, na);
        }
    }
    
    protected Object Remover() {
        return lista.pop();
    }
    
    protected boolean ehVazia() {
        return lista.isEmpty();
    }
    
    protected void listarLista() {
        for (No no  : lista) {
            System.out.print("[ "+ no.getNum()+" ]");
            if (no.getProxNo() != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println("");
    }
    
    protected void adicionarNoMeio(int n, int posicao) {
        if (posicao >= 0 && posicao <= lista.size()) {
            
            No no = new No(n, null);
            if (posicao ==0) {
                no.setProxNo(lista.get(0));
                lista.add(0, no);
            } else if (posicao == lista.size()) {
                adicionar(n);
            } else {
                No anterior = lista.get(posicao -1);
                No proximo = anterior.getProxNo();
                anterior.setProxNo(no);
                no.setProxNo(proximo);
                lista.add(posicao, no);
            }
        } else {
            System.out.println("Posição inválida");
        }
    }
}
