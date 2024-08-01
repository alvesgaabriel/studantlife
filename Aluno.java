package com.mycompany.a3;

public class Aluno extends Usuario {

    private String nome, email;
    private int idade, ra;
    private long telefone;

    public Aluno(String nome, String email, int idade, long telefone) {
        super(nome, email, idade, telefone);
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    public int getRa() {
        return ra;
    }
    public void imprime(){
        super.imprimir();
        System.out.println("Ra:"+ra);
    }
}
