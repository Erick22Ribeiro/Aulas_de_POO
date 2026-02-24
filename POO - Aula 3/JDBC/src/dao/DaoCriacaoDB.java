package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoCriacaoDB {
	
	static final String url = "jdbc:mysql://localhost";

	public DaoCriacaoDB() { //Construtor
			
		String sql = "CREATE DATABSE minhaLoja";
		
		try {
			
			Connection conexao = DriverManager.getConnection(url, "root", "");  //precisa fazer o import correto
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			
			operacao.execute();
			
			System.out.print("Banco de dados criado com sucesso!");
			
			conexao.close();
			
		}
		catch(SQLException e) {
			
			System.out.print("Erro: " + e.getMessage());
			
		}
	}

}
