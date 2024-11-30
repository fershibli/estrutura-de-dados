/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioarvore;

/**
 *
 * @author Alunos
 */
public class No {
    No esquerdo;
    int valor;
    No direito;
    
    public No(int valor) {
        this.valor = valor;
        esquerdo = direito = null;
    }
    
    public void inserir(int valor) {
        if (valor<this.valor) {
            if (esquerdo == null) {
                esquerdo = new No(valor);
            } else {
                esquerdo.inserir(valor);
            }
        } else if(valor > this.valor) {
            if (direito == null) {
                direito = new No(valor);
            } else {
                direito.inserir(valor);
            }
        }
    }
}
