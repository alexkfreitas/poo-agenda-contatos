package br.com.letscode.java.agenda;

public class Contato {

    //atributos
    private String nome;
    private String telefone;
    private String email;

    //Contato contato = new Contato();
    //construtor
    public Contato() {
        //padrao
        this.nome = "João Ninguém";
        this.telefone = "190";
        this.email = "joao.ninguem@globo.com";
    }
    public Contato(Contato original) {
        this.nome = original.nome;
        this.telefone = original.telefone;
        this.email = original.email;
    }
    public Contato(String nome, String telefone, String email) {
        //completo
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    //acessadores/modificadores
    //getters/setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    //visualizar o nome em maiúsculo
    public String getNomeMaisculo() {
        return this.nome.toUpperCase();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString

    @Override
    public String toString() {
        return "Contato{" +
            "nome='" + nome + '\'' +
            ", telefone='" + telefone + '\'' +
            ", email='" + email + '\'' +
            '}';
    }
}
