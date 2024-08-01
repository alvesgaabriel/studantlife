package com.mycompany.a3;

public class NewClass {
    public static void main (String args[]){
        Admin admin;
        admin = new Admin("Carlos", "sla@gmail.com",18,1989892308);
        admin.setEmail("email");
        admin.getEmail();
        admin.setSenha("1234");
        admin.getSenha();
        admin.imprimir();
    }
}
