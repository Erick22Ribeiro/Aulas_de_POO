package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoRemocao {
	
	static final String url = "jdbc:mysql://localhost/minhaLoja";
	
	public DaoRemocao() {
		
		String sql = "DELETE FROM game WHERE id = 7";
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.print("Inclusão 2 de games inseridos com sucesso!");
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}
	}
}
