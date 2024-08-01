package com.mycompany.a3;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "anima123";
    private String host = "localhost";
    private String porta = "3306";
    private String db = "studentlife";

    public Connection obtemConexao() {
        try {
            Connection conectar = DriverManager.getConnection(
                    "jdbc:mysql://" + host + "t" + porta + "/" + db, usuario, senha
            );
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    
}    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.obtemConexao();
        
        if (connection != null) {
            System.out.println("Conexão testada e aprovada!");
        } else {
            System.out.println("Falha na conexão!");
        }
    }
}
