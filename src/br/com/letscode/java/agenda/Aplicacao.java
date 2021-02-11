package br.com.letscode.java.agenda;

public class Aplicacao {

    private Agenda agenda = new Agenda(5);

    public static void main(String[] args) {
       Aplicacao aplicacao = new Aplicacao();
       aplicacao.iniciar();
    }

    private void iniciar() {
        var contato = new Contato("Jesse Haniel", "99999-8888", "jesse.haniel@gmail.com");
        this.agenda.adicionar(contato);
        this.agenda.adicionar(new Contato());
        this.agenda.listar();
        this.agenda.remover(0);
        this.agenda.adicionar(new Contato("José da Silva", "88888-0000", "jose.silva@globo.com"));
        this.agenda.listar();
    }

}
