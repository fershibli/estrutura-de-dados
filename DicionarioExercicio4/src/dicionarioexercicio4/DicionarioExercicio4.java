/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dicionarioexercicio4;

/**
 *
 * @author Alunos
 */
public class DicionarioExercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
 
        // Adicionando algumas palavras e definições
        dicionario.addPalavra("maçã", "Uma fruta.");
        dicionario.addPalavra("cachorro", "Um animal domesticado pelo homem.");
        dicionario.addPalavra("computador", "Um dispositivo eletrônico para processamento de dados.");
 
        // Recuperando a definição de uma palavra
        String definicao = dicionario.getDefinicao("cachorro");
        System.out.println("Definição de 'cachorro': " + definicao);
 
        // Listando todas as palavras no dicionário
        System.out.println("Palavras no dicionário:");
        for (String palavra : dicionario.getTodasPalavras().keySet()) {
            System.out.println("- " + palavra);
        }
 
        System.out.println("Significados das Palavras no dicionário:");
        for (String palavra : dicionario.getTodasPalavras().values()) {
            System.out.println("- " + palavra);
        }
 
        System.out.println("Palavras e significados no dicionário:");
        System.out.println(dicionario.getTodasPalavras());
        
        
        System.out.println("Quantidade de palavras no dicionário: "+dicionario.contaPalavras());
        dicionario.atualizaDefinicao("cachorro", "Um animal descendente do Lobo");
        System.out.println("Definição de cachorro:"+dicionario.getDefinicao("cachorro"));
        
        dicionario.atualizaDefinicao("banana", "uma fruta rica em potássio");
        
        System.out.println("Quantidade de palavras no dicionário: "+dicionario.contaPalavras());
        dicionario.removePalavra("maçã");
        System.out.println("Quantidade de palavras no dicionário: "+dicionario.contaPalavras());
        System.out.println("Definição de maçã: "+dicionario.getDefinicao("maçã"));
        System.out.println("Quantidade de palavras no dicionário: "+dicionario.contaPalavras());
        
    }
    
}
