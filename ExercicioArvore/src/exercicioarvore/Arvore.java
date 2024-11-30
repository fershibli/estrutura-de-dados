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
    
}
