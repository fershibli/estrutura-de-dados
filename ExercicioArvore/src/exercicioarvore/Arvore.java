package exercicioarvore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class Arvore {
    private No raiz;
    
    public Arvore() {
        this.raiz = null;
    }
    
    // insere um novo nó na árvore de pesquisa binária
    public void inserirNo(int valor) {
        if (raiz == null) {
            raiz = new No(valor);
        } else {
            raiz.inserir(valor);
        }
    }
    
    // inicia percurso na pré-ordem
    public void preordemPercurso() {
        preordemNavegador(raiz);
    }
    
    // método recursivo para realizar percurso na pré-ordem
    private void preordemNavegador(No no) {
        if (no == null) {
            return;
        }
        System.out.printf("%d ", no.valor);
        preordemNavegador(no.esquerdo);
        preordemNavegador(no.direito);
    }
    
    // inicia percurso na ordem
    public void emordemPercurso(){
        emordemNavegador(raiz);
    }
    
    // método recursivo para realizar percurso na ordem
    private void emordemNavegador(No no) {
        if (no == null) {
            return;
        }
        emordemNavegador(no.esquerdo);
        System.out.printf("%d ", no.valor);
        emordemNavegador(no.direito);
    }
    
    // inicia percurso na pós-ordem
    public void posordemPercurso(){
        posordemNavegador(raiz);
    }
    
    // método recursivo para realizar percuso na pós-ordem
    private void posordemNavegador(No no) {
        if (no == null) {
            return;
        }
        posordemNavegador(no.esquerdo);
        posordemNavegador(no.direito);
        System.out.printf("%d ", no.valor);

    }

    // inicia percurso de remoção de nó
    public void removerNoPercurso(int valor) {
        raiz = removerNo(raiz, valor);
    }

    // método recursivo para remover nó
    private No removerNo(No no, int valor) {
        // se a árvore estiver vazia
        if (no == null) {
            return no;
        }
        // navega pela árvore
        if (valor < no.valor) {
            no.esquerdo = removerNo(no.esquerdo, valor);
        } else if (valor > no.valor) {
            no.direito = removerNo(no.direito, valor);
        } else {
            // se o nó a ser removido tiver um ou nenhum filho
            if (no.esquerdo == null) {
                return no.direito;
            } else if (no.direito == null) {
                return no.esquerdo;
            }
            // se o nó a ser removido tiver dois filhos
            no.valor = minValor(no.direito);
            no.direito = removerNo(no.direito, no.valor);
        }
        return no;
    }
}
