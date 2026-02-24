package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao1 {
	
	static final String url = "jdbc:mysql://localhost/minhaLoja";
	
	public DaoInclusao1() {
		
		String sql = "INSERT INTO game(titulo, ano) VALUES('come-come', 1982)";
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.print("Inclusão 1 de games inseridos com sucesso!");
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}
	}
			
			
}
