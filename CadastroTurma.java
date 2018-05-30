import javax.swing.*;
import java.util.*;
import java.awt.*;

public class CadastroTurma extends JFrame{
	private ArrayList<Turma> lstTurma;	
	private ArrayList<Professor> lstProf;	
	private ArrayList<Aluno> lstAlunos;	
	private boolean navegacaoProfessor; //controle se ele clicou pra add um professor
	private boolean navegacaoAluno; //controle se ele clicou pra add um aluno
	private JList<Professor> jlProfessores;
	
	Professor pr = new Professor();
	
	
	
	public CadastroTurma(Frame owner) {
		super("Cadastro de turmas");
		
		Turma t = new Turma(); //captura o Professor pr anteriormente para poder passar como parametro no construtor ou retirar o mesmo do contrutor na classe Turma
		
		setLayout(new GridLayout(5,2));
		
		JLabel lbldataInicio = new JLabel("*Data Início: ");
		JTextField txtdataInicio = new JTextField();
		
		JLabel lbldataFim = new JLabel("*Data Fim: ");
		JTextField txtdataFim = new JTextField();
		
		JButton btProf = new JButton("Adicionar professor responsavel");
		JButton btAlunos = new JButton("Adicionar alunos");
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lbldataInicio); add(txtdataInicio);
		add(lbldataFim); add(txtdataFim);
		add(btProf); add(btAlunos);
		add(btCancelar); add(btOk);
		
		btProf.addActionListener((e)->{
			JanelaProfessor j = new JanelaProfessor(this); //lista os professores, capturar um pra add no objeto turma ao clicar em ok
			navegacaoProfessor = true;
		});
		
		btAlunos.addActionListener((e)->{
			JanelaAluno j = new JanelaAluno(this); //lista os alunos, capturar um pra add no objeto turma ao clicar em ok
			navegacaoAluno = true;
		});
		
		//falta capturar os alunos e o professor pra poder passar pra turma
		btOk.addActionListener((e)->{
			
			if(navegacaoProfessor == true && navegacaoAluno == true){
				if(txtdataInicio.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Voce deve informar a data inicial!");
				}
				t.setDataInicio(txtdataInicio.getText());
		
				if(txtdataFim.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Voce deve informar a data final!");
				}
				t.setDataFinal(txtdataFim.getText());
				
				lstTurma = Dados.getInstance().getListTurmas();
				lstTurma.add(t);
				dispose();
			}else{
				JOptionPane.showMessageDialog(null,"Voce deve selecionar aluno(s) e/ou um professor");
			}	
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });

		setSize(500,300);
		setVisible(true);
		
	}
	
}
