package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controle.ControleAnimal;
import modelo.Animal;

public class ConsultaAnimal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEspecie;
	private JTextField textRaca;
	private ControleAnimal controleAnimal = new ControleAnimal();
	private JTextField textId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaAnimal frame = new ConsultaAnimal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultaAnimal() {
		setTitle("PetSys 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONSULTA A ANIMAL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 414, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(21, 128, 101, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ESPÉCIE:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(21, 176, 101, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RAÇA:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(21, 224, 101, 37);
		contentPane.add(lblNewLabel_1_2);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Arial", Font.PLAIN, 18));
		textNome.setBounds(148, 128, 204, 37);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textEspecie = new JTextField();
		textEspecie.setFont(new Font("Arial", Font.PLAIN, 18));
		textEspecie.setColumns(10);
		textEspecie.setBounds(148, 176, 204, 37);
		contentPane.add(textEspecie);
		
		textRaca = new JTextField();
		textRaca.setFont(new Font("Arial", Font.PLAIN, 18));
		textRaca.setColumns(10);
		textRaca.setBounds(148, 224, 204, 37);
		contentPane.add(textRaca);
		
		JButton btnNewButton = new JButton("ALTERAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
				String especie = textEspecie.getText();
				String raca = textRaca.getText();
				
				controleAnimal.cadastrarAnimal(nome, especie, raca);
				
				JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
				
				textNome.setText("");
				textEspecie.setText("");
				textRaca.setText("");
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(148, 272, 136, 47);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_3 = new JLabel("CÓDIGO:");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(20, 59, 101, 37);
		contentPane.add(lblNewLabel_1_3);
		
		textId = new JTextField();
		textId.setFont(new Font("Arial", Font.PLAIN, 18));
		textId.setColumns(10);
		textId.setBounds(148, 59, 49, 37);
		contentPane.add(textId);
		
		JButton btnNewButton_1 = new JButton("CONSULTAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textId.getText());
				
				Animal animal = controleAnimal.consultarAnimal(id);
				
				textNome.setText(animal.getNome());
				textEspecie.setText(animal.getEspecie());
				textRaca.setText(animal.getRaca());
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_1.setBounds(207, 59, 145, 37);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 115, 414, 2);
		contentPane.add(separator);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setFont(new Font("Arial", Font.BOLD, 16));
		btnExcluir.setBounds(288, 272, 136, 47);
		contentPane.add(btnExcluir);

	}
}
