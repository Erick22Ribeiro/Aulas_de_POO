package dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import modelo.Animal;

public class DaoAnimal {	
	public void inserir(Animal animal) {
		String sql = "INSERT INTO animal (nome, especie, raca) VALUES (?, ?, ?)";
	
		try {
			Properties props = new Properties();
			FileInputStream arquivo = new FileInputStream("db.properties");
			props.load(arquivo);
			
			String driver = props.getProperty("db.driver");
			String url = props.getProperty("db.url");
			String usuario = props.getProperty("db.usuario");
			String senha = props.getProperty("db.senha");
			
			//Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.setString(1, animal.getNome());
			operacao.setString(2, animal.getEspecie());
			operacao.setString(3, animal.getRaca());
			operacao.execute();
			
			System.out.println("Animal cadastrado com sucesso!");
			conexao.close();
			operacao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public Animal consultar(int id) {
		String sql = "SELECT * FROM animal WHERE id = " + id;
		Animal animal = new Animal();
		
		try {
			Properties props = new Properties();
			FileInputStream arquivo = new FileInputStream("db.properties");
			props.load(arquivo);
			
			String driver = props.getProperty("db.driver");
			String url = props.getProperty("db.url");
			String usuario = props.getProperty("db.usuario");
			String senha = props.getProperty("db.senha");
			
			//Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement operacao = conexao.prepareStatement(sql);
			ResultSet resultado = operacao.executeQuery();
			
			resultado.first();
			
			animal.setNome((String)resultado.getObject(2));
			animal.setEspecie((String)resultado.getObject(3));
			animal.setRaca((String)resultado.getObject(4));
			
			conexao.close();
			operacao.close();
		}
		catch(SQLException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		return animal;
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
}
