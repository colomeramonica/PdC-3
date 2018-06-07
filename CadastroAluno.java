/* Tela de cadastro de novos alunos */

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class CadastroAluno extends JDialog{
	private ArrayList<Aluno> lstAln;	
	private boolean navegacao;
	
	public CadastroAluno(Frame owner) { // tornando a janela um modal dependende do seu "pai" (no caso, a tela de Cadastro)
		super(owner,true);
		
		setLayout(new GridLayout(6,2));
		
		JLabel lblNomeAln = new JLabel("*Nome: ");
		JTextField txtNomeAln = new JTextField();
		
		JLabel lblRa = new JLabel("*RA: ");
		JTextField txtRa = new JTextField();
		
		JLabel lbldataMatricula = new JLabel("Data de Matrícula: ");
		JTextField txtdataMatricula = new JTextField();
		
		JLabel lblRgAln= new JLabel("*RG: ");
		JTextField txtRgAln = new JTextField();
		
		JLabel lblCpfAln = new JLabel("*CPF: ");
		JTextField txtCpfAln = new JTextField();
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lblNomeAln); add(txtNomeAln);
		add(lblRa); add(txtRa);
		add(lbldataMatricula); add(txtdataMatricula);
		add(lblRgAln); add(txtRgAln);
		add(lblCpfAln); add(txtCpfAln);
		add(btCancelar); add(btOk);
		
		btOk.addActionListener((e)->{
			Aluno a = new Aluno();
			if(txtNomeAln.getText().equals("")){ // verifica se o campo está vazio e, caso sim, retorna um aviso
				JOptionPane.showMessageDialog(null,"Voce deve informar o nome!");
			}
			a.setNome(txtNomeAln.getText());
	
			if(txtRgAln.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o RG!");
			}
			a.setRg(txtRgAln.getText());
			
			if(txtCpfAln.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o CPF!");
			}
			a.setCpf(txtCpfAln.getText());
			
			if(txtRa.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o RA!");
			}
			a.setRa(txtRa.getText());
			
			a.setDataMatricula(txtdataMatricula.getText());
			
			lstAln = Dados.getInstance().getListAlunos(); // instancia uma nova lista de alunos direto da classe Dados, um Singleton
			lstAln.add(a);
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); }); // fecha o modal no clique do botão 

		setSize(500,300);
		setVisible(true);
		
	}
	
}
