package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoLista {
	
	static final String url = "jdbc:mysql://localhost/minhaLoja";
	
	public DaoLista() {
		
		String sql = "SELECT * FROM game";
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			
			ResultSet resultado = operacao.executeQuery();
			
			resultado.first();
			
			do {
				System.out.println(resultado.getObject(1) + " | " + resultado.getObject(2) + " (" + resultado.getObject(3) + ")");
			} while(resultado.next());
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}
	}
}
