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

public class Cadastro extends JFrame {
	private List<Professor> lstProfessores;
	private ListIterator<Professor> iterator;	
	private boolean navegacao = false;
	
		public Cadastro() {
			super("Cadastro de Turmas"); // MENU INICIAL
			
			GridLayout g = new GridLayout(5,2);
			setLayout(g);
			
			Dimension d = new Dimension(500,350);
			
			JLabel lbInicio = new JLabel("Data Inicio ");
			JTextField txtInicio = new JTextField();
			
			add(lbInicio); add(txtInicio);
			
			JLabel lbFim = new JLabel("Data Inicio ");
			JTextField txtFim = new JTextField();
			
			add(lbFim); add(txtFim);
			
			JLabel lbProf = new JLabel("Professores");
			
			JButton btProfessor = new JButton("Selecionar professor");
			add(lbProf);
			
			JButton btNProfessor = new JButton ("Cadastrar novo professor");
			add(btNProfessor);
			
			JLabel lbAlunos = new JLabel("Alunos");
			add(lbAlunos);
			
			JButton btNAluno = new JButton ("Cadastrar novo aluno");
			add(btNAluno);
			
			JButton btGerenciarAluno = new JButton ("Gerenciar alunos");
			JButton btGerenciarProfessor = new JButton ("Gerenciar professores");
			add(btGerenciarAluno); add(btGerenciarProfessor);
			
			btNProfessor.addActionListener((e)->{ // botão de cadastrar novo professor aciona o 'pop-up' de cadastro
				CadastroProfessor n = new CadastroProfessor();
				JLabel lbProfessor = new JLabel("Professores");
				add(lbProfessor);
			});
			
			btNAluno.addActionListener((e)->{ // botão de cadastrar novo aluno aciona a caixa de dialogo de cadastro
				CadastroAluno a = new CadastroAluno();
				JLabel lbAluno = new JLabel("Alunos");
				add(lbAluno);
			});
			
					btGerenciarProfessor.addActionListener((e)->{ // botão que irá listar os professores cadastrados
				JanelaProfessor j = new JanelaProfessor();
				
			});
			
			setSize(d);
			setVisible(true);
		}
		
			public static void main (String args[]){
			Cadastro t = new Cadastro();
	}
}
	

		
		
		
			
