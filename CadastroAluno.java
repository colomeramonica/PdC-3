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
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class CadastroAluno extends JFrame {
	private List<Aluno> lstAlunos;
	public CadastroAluno() {
		super("Cadastro de Alunos");
		
		lstAlunos = new LinkedList<>();
		setLayout(new GridLayout(5,2));
		
		JLabel lblNomeAluno = new JLabel("Nome: ");
		JTextField txtNomeAluno = new JTextField();
		
		JLabel lblRa = new JLabel("*RA: ");
		JTextField txtRa = new JTextField();
		
		JLabel lblRgAluno = new JLabel("RG: ");
		JTextField txtRgAluno = new JTextField();
		
		JLabel lblCpfAluno= new JLabel("CPF: ");
		JTextField txtCpfAluno = new JTextField();
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
	
		add(lblNomeAluno); 	add(txtNomeAluno);
		add(lblRa);	add(txtRa);
		add(lblRgAluno); add(txtRgAluno);
		add(lblCpfAluno); add(txtCpfAluno);
		add(btCancelar); add(btOk);
		
		btOk.addActionListener((e)->{
			Aluno a = new Aluno();
			a.setNome(txtNomeAluno.getText());
			a.setRg(txtRgAluno.getText());
			a.setCpf(txtCpfAluno.getText());
			
			if(txtRa.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o RA");
			}
			a.setRa(txtRa.getText());
			
			
			lstAlunos.add(a);
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });


		setSize(500,300);
		setVisible(true);
	}
	
	
	}
