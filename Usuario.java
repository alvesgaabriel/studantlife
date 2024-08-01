package com.mycompany.a3;

public class Usuario {

    private String nome, email;
    private int idade;
    private long telefone;

    public Usuario(String nome, String email, int idade, long telefone) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
 public void imprimir(){
     System.out.println("Nome:" +nome);
     System.out.println("Email:"+ email);
     System.out.println("Idade:"+idade);
     System.out.println("Telefone"+telefone);
    
    }
}
