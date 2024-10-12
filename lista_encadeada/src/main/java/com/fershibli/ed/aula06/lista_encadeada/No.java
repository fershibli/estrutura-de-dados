/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fershibli.ed.aula06.lista_encadeada;

/**
 *
 * @author Alunos
 */
public class No {
    
    private int num = 0;
    private No proxNo;
    
    public No(int num, No no) {
        this.num = num;
        this.proxNo = no;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public No getProxNo() {
        return proxNo;
    }

    public void setProxNo(No proxNo) {
        this.proxNo = proxNo;
    }
    
    
}
