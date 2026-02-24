package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao2 {
	
	static final String url = "jdbc:mysql://localhost";
	
	public DaoInclusao2() {
		
		String sql = "INSERT INTO game(titulo, ano) VALUES " +
                "('Pac-Man', 1982), " +
                "('Super Mario Bros', 1985), " +
                "('Sonic The Hedgehog', 1991)";
		
		
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
