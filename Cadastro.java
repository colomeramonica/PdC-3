/* Arquivo responsável pela janela inicial do programa. Contém os botões de adição de alunos, professores e o gerenciamento dos mesmos,
 * bem como a possibilidade de criação de turmas. */
 
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Cadastro extends JFrame {
	private ArrayList<Professor> lstProfessores;	
	
		public Cadastro() {
			super("Cadastro de Turmas"); // MENU INICIAL
			
			GridLayout g = new GridLayout(4,2);
			setLayout(g);
			
			Dimension d = new Dimension(500,350);
			
			JLabel lbTurma = new JLabel("Turmas");
			add(lbTurma);
			
			JButton btNTurma = new JButton ("Cadastrar nova turma");
			add(btNTurma);
			
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
				CadastroProfessor n = new CadastroProfessor(this);
				JLabel lbProfessor = new JLabel("Professores");
				add(lbProfessor);
			});
			
			btNAluno.addActionListener((e)->{ // botão de cadastrar novo aluno aciona a caixa de dialogo de cadastro
				CadastroAluno a = new CadastroAluno(this);
				JLabel lbAluno = new JLabel("Alunos");
				add(lbAluno);
			});
			
			btNTurma.addActionListener((e)->{ // botão de cadastrar nova turma aciona a caixa de dialogo de cadastro
				CadastroTurma t = new CadastroTurma(this);
				add(lbTurma);
			});
			
			btGerenciarProfessor.addActionListener((e)->{ // botão que irá listar os professores cadastrados
				JanelaProfessor j = new JanelaProfessor(this);
			});
			
			btGerenciarAluno.addActionListener((e)->{ // botão que irá listar os alunos cadastrados
				JanelaAluno aln = new JanelaAluno(this);
			});
			
			setSize(d);
			setVisible(true);
		}
		
			public static void main (String args[]){
			Cadastro t = new Cadastro();
	}
}
	

		
		
		
			
