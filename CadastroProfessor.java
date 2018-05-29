import  javax.swing.JFrame;
import  javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import java.util.ListIterator;											
import java.util.LinkedList;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class CadastroProfessor extends JFrame{
	private ArrayList<Professor> lstProf;
	private boolean navegacao;
	public CadastroProfessor() {
		super("Cadastro de Professores");
		
		setLayout(new GridLayout(5,2));
		
		JLabel lblNomeProf = new JLabel("*Nome: ");
		JTextField txtNomeProf = new JTextField();
		
		JLabel lblEspecialidade = new JLabel("*Especialidade: ");
		JTextField txtEspecialidade = new JTextField();
		
		JLabel lblRgProf = new JLabel("*RG: ");
		JTextField txtRgProf = new JTextField();
		
		JLabel lblCpfProf = new JLabel("*CPF: ");
		JTextField txtCpfProf = new JTextField();
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lblNomeProf); add(txtNomeProf);
		add(lblEspecialidade); add(txtEspecialidade);
		add(lblRgProf); add(txtRgProf);
		add(lblCpfProf); add(txtCpfProf);
		add(btCancelar); add(btOk);
		
		btOk.addActionListener((e)->{
			Professor p = new Professor();
			if(txtNomeProf.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o nome!");
			}
			p.setNome(txtNomeProf.getText());
	
			if(txtRgProf.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o RG!");
			}
			p.setRg(txtRgProf.getText());
			
			if(txtCpfProf.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o CPF!");
			}
			p.setCpf(txtCpfProf.getText());
			
			if(txtEspecialidade.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar a especialidade!");
			}
			p.setEspecialidade(txtEspecialidade.getText());
			
			lstProf = DadosProfessores.getInstance().getListProfessor();
			lstProf.add(p);
			dispose();
		});
		
		btOk.addActionListener((e)->{
			/** PEGAR A LISTA E PASSAR PRA JANELA DE GERENCIAMENTO **/
			
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });


		setSize(500,300);
		setVisible(true);
	}
	
	
	}
