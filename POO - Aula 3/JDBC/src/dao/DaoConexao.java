package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoConexao {
	
	static final String url = "jdbc:mysql://localhost";
	
	public DaoConexao() { //Construtor
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  //precisa fazer o import correto
						
			System.out.print("Conexão estabelecida com sucesso!");
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}	
		
		return;
	}
}
