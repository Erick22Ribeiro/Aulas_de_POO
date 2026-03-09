package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

//Adicionar o driver ao projeto --. botão direito no projeto -> properties -> Java build path -> libraries -> ClassPath -> Add Externals Jars

public class DaoCriacaoTabela {

	public DaoCriacaoTabela() {
	
		String sql = "CREATE TABLE animal("
				+ "id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,"
				+ "nome VARCHAR(30),"
				+ "especie VARCHAR(10),"
				+ "raca VARCHAR(30))";
		
		try {
			
			Properties props = new Properties();
			
			FileInputStream arquivo = new FileInputStream("db.properties"); //classe que permite que uma variael aponte para um arquivo
			
			props.load(arquivo);
			
			String driver = props.getProperty("db.driver");
			String url= props.getProperty("db.url");
			String usuario = props.getProperty("db.usuario");
			String senha = props.getProperty("db.senha");
			
			//Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			
			operacao.execute();

		}
		catch(SQLException e) {
			System.out.print("Erro: " + e.getMessage()); 
		}
		catch(FileNotFoundException e) {
			System.out.print("Erro: " + e.getMessage()); 
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 
		//catch (ClassNotFoundException e) {
			//System.out.println("Erro: " + e.getMessage());
		//}
		
	}
	
}
