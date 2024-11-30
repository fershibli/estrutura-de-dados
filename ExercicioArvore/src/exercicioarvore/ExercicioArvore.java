/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioarvore;

/**
 *
 * @author Alunos
 */
public class ExercicioArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arvore arvore = new Arvore();

        int valores[] = {120, 44, 4, 63, 48, 15, 85, 1, 99, 18, 20, 7, 70, 20, 5, 9, 86};

        System.out.println("\n\nValores inseridos: ");
        for (int i = 0;  i < valores.length; i++) {
            int valor = valores[i];
            System.out.print(valor + " ");
            arvore.inserirNo(valor);
        }
        System.out.println("\n\n\nPercurso na pré-ordem");
        arvore.preordemPercurso(); 
        System.out.println("\n\nPercurso na ordem");
        arvore.emordemPercurso();
        System.out.println("\n\nPercurso na pós-ordem");
        arvore.posordemPercurso();
        

    }
    
}
