/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fershibli.tp1.atividadecomplexidade2;

/**
 *
 * @author Alunos
 */
public class AtividadeComplexidade2 {

    public static void main(String[] args) {
        int[] arr = { 82, 3, 79, 82, 96, 19, 95, 54, 35, 12, 11, 14,  8, 39, 35,
            23, 90, 27, 10, 87, 16, 40, 99,  0,  26, 81, 92, 38, 93, 93, 94, 78,
            14, 86, 68, 93,  36, 83, 46, 78, 43, 30, 30, 17,  9, 47, 66,  8, 5, 
            26, 91, 23, 96, 70, 25, 13, 52, 54, 22, 50,  63, 27, 37, 50, 10,  1,  
            7,  7, 94, 36, 34, 63,  87, 50, 13, 23, 89, 90, 18, 92, 47,  4, 67, 
            27, 4, 95, 54, 34, 54, 91, 73, 53, 10, 77, 60,  3,   7, 99, 46, 49};
        System.out.println("Sort com 100 números aleatórios");
        bubbleSort(arr);
        
    }
    
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i =0; i < arr.length - 1; i++){
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
            if(!swapped) {
                break;
            }
        }
    }
}
