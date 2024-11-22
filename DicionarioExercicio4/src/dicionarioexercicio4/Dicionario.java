/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicionarioexercicio4;

/**
 *
 * @author Alunos
 */
import java.util.HashMap;
 
class Dicionario {
 
    private HashMap<String, String> palavras;
 
    public Dicionario() {
        this.palavras = new HashMap<>();
    }
 
    public void addPalavra(String palavra, String definicao) {
        if (this.contemPalavra(palavra)) {
            System.out.println("Palavra já existe no dicionário.");
            return;
        }
        palavras.put(palavra, definicao);
    }

    public boolean contemPalavra(String palavra) {
        return palavras.containsKey(palavra);
    }
 
    public String getDefinicao(String palavra) {
        return palavras.getOrDefault(palavra, "Definição não encontrada.");
    }
 
    public HashMap<String, String> getTodasPalavras() {
        return palavras;
    }
    
    /*
    Exercício Complementar: Dicionário com Funcionalidades Avançadas
    Além das funcionalidades básicas, adicione as seguintes funcionalidades ao seu dicionário:

    Remover Palavra:
        Implemente um método removePalavra(String word) que remove uma palavra e sua definição do dicionário.
    Atualizar Definição:
        Implemente um método atualizaDefinicao(String word, String newDefinition) que atualiza a definição de uma palavra existente.
    Contar Palavras:
        Implemente um método contaPalavras() que retorna o número total de palavras no dicionário.
    */

    public void removePalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void atualizaDefinicao(String palavra, String novaDefinicao) {
        palavras.put(palavra, novaDefinicao);
    }

    public int contaPalavras() {
        return palavras.size();
    }
}
