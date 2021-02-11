package br.com.letscode.java.agenda;

import java.util.Arrays;

public class Agenda {

    private int qtdContatos = 0;
    private Contato[] contatos;

    //construtor
    public Agenda() {
        this.contatos = new Contato[10];
    }
    public Agenda(int tamanhoAgenda) {
        this.contatos = new Contato[tamanhoAgenda];
    }

    //getter/setter
    public int getQtdContatos() {
        return qtdContatos;
    }
    public Contato[] getContatos() {
        return contatos;
    }

    //adicionar Contato
    public void adicionar(Contato novoContato) {
        //testar se qtdContatos < contatos.length
        if (this.qtdContatos < this.contatos.length) {
            this.contatos[this.qtdContatos] = novoContato;
            this.qtdContatos++;
        } else {
            System.err.println("A agenda já está lotada.");
        }
    }

    //remover Contato
    public void remover(int indice) {
        if (indice >= 0 && indice < this.qtdContatos) {
            this.contatos[indice] = null;
            this.qtdContatos--;
        } else {//[0] [1] [3] [4] [5] []
            System.err.println("Este não é um índice válido. Tente novamente.");
        }
    }

    public void listar() {
        System.out.println(">>> Listando os contatos da agenda");
        for (Contato c : this.contatos) {
            System.out.println(c);
        }
    }

    //toString
    @Override
    public String toString() {
        return "Agenda{" +
            "contatos=" + Arrays.toString(contatos) +
            '}';
    }
}
