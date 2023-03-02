/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;



/**
 *
 * @author fernando.fernandes
 */
public class Pinto {
    
    //Atributos
    private String nome;
    private int largura;
    private int tamanho;
    private int pergunta;
    private String cm = "cm";

    //Construtores
    public Pinto() {
    }

    public Pinto(String nome, int tamanho, int largura) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.largura = largura;

    }

    //Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int novaLargura) {
        this.largura = novaLargura;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int novoTamanho) {
        this.tamanho = novoTamanho;
    }

    //Métodos - Ações
    public void imprimir() {
        System.out.println("Nome: " + getNome() + "\nTamanho: " + getTamanho() + cm + "\nLargura: " + getLargura() + cm + "\n");
    }

    public void crescer() {
        this.tamanho = tamanho + 4;
        this.largura = largura + 4;
    }

    public void transformar() {
        this.nome = "Monster Cock";
        this.tamanho = 25;
        this.largura = 20;
    }
}
