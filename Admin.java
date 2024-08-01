package com.mycompany.a3;

public class Admin extends Professor{
    private String email;
    private String senha;

    public Admin(String nome, String email, int idade, long telefone) {
        super(nome, email, idade, telefone);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
