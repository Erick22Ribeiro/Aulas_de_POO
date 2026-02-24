package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoAlteracao {
	
	static final String url = "jdbc:mysql://localhost/minhaLoja";
	
	public DaoAlteracao() {
		
		String sql = "UPDATE game SET ano = 1983 WHERE id = 4";
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.print("Game alterado com sucesso!");
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}
	}
}
