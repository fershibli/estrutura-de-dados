/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dicionariohashmap;

/**
 *
 * @author Alunos
 */

/*
Foi pedido a vocês que crie um aplicativo de dicionário simples. 
Você precisará usar um HashMap para armazenar palavras e suas definições. 
Assim, sendo, crie uma classe chamada Dicionario que encapsule essas funcionalidades.
 
- Crie uma classe chamada Dicionario.
- Adicione um campo privado do tipo HashMap<String, String> para armazenar as palavras e suas definições.
- Implemente os seguintes métodos:
    addPalavra(String word, String definition): adiciona uma palavra e sua definição ao dicionário.
    getDefinicao(String word): retorna a definição associada à palavra especificada.
    getTodasPalavras(): retorna todas as palavras no dicionário.
- Crie um método main para testar sua implementação.
- Adicione algumas palavras e suas definições ao dicionário.
- Verifique se as operações de adição e recuperação funcionam corretamente.
- Dica: Lembre-se de que as chaves em um HashMap devem ser únicas. Portanto, ao adicionar palavras, verifique se elas não estão duplicadas.
*/
import java.util.HashMap;
 
class Dicionario {
 
    private HashMap<String, String> palavras;
 
    public Dicionario() {
        this.palavras = new HashMap<>();
    }
 
    public void addPalavra(String palavra, String definicao) {
        palavras.put(palavra, definicao);
    }
 
    public String getDefinicao(String palavra) {
        return palavras.getOrDefault(palavra, "Definição não encontrada.");
    }
 
    public HashMap<String, String> getTodasPalavras() {
        return palavras;
    }
}
