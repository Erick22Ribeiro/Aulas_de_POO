package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoCriacaoTabela {

	static final String url = "jdbc:mysql://localhost/minhaLoja";
	
	public DaoCriacaoTabela() {
		
		String sql = "CREATE TABLE game (id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY, titulo VARCHAR(30), ano INT";
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.print("Tabela game criada com sucesso!");
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}
	}
}
