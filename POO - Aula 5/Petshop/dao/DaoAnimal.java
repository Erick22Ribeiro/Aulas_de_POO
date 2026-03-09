package dao;

import modelo.Animal;

public class DaoAnimal {
	private static final String url = "jdbc:mysql://localhost/petshop";
	
	public void inserir(Animal animal) {
		String sql = "INSERT INTO animal (nome, especie, raca) VALUES ('" + animal.getNome() + "', '" + animal.getEspecie() + "', '" + animal.getRaca() + "')";
	
		System.out.println(sql);
	}
	
	public void consultar() {
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
}
