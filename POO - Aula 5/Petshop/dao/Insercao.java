package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Insercao {	
	public Insercao() {
		String sql = "INSERT INTO animal(nome, raca) VALUES(?, ?)";	
		
		try {			
			String driver;
			String url;
			String usuario;
			String senha;
			
			Properties props = new Properties();
			FileInputStream file = new FileInputStream("db.properties");
			props.load(file);
			
			driver = props.getProperty("db.driver");
			url = props.getProperty("db.url");
			usuario = props.getProperty("db.username");
			senha = props.getProperty("db.password");
			
			Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			//conexao.setAutoCommit(false);
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.setString(1, "Dengoso");
			operacao.setString(2, "Street Cat");
			operacao.execute();
			
			System.out.println("Animal inserido com sucesso!");			
			
			conexao.close();
			operacao.close();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());	
		}
	}
}
