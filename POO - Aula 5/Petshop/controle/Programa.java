package controle;

import dao.DaoCriacaoTabela;
import view.CadastroAnimal;

//Adicionar o driver ao projeto --> botão direito no projeto -> properties -> Java build path -> libraries -> ClassPath -> Add Externals Jars


public class Programa {
	public static void main(String[] args) {
		
		DaoCriacaoTabela daoCriacaoTabela = new DaoCriacaoTabela();
		CadastroAnimal cadastroAnimal = new CadastroAnimal();
		
		cadastroAnimal.setVisible(true);
	}
}