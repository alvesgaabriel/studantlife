package com.mycompany.a3;

public class Professor extends Usuario{

    private String nome, email;
    private int idade;
    private long telefone;

    public Professor(String nome, String email, int idade, long telefone) {
        super(nome, email, idade, telefone);
    }
    
}
