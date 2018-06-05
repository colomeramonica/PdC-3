import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JanelaAluno extends JDialog {
	private JButton btOK;
	private JButton btEditar;
	private ArrayList<Aluno> alunos;
	private JList<Aluno> jlAlunos;
	private Aluno E;
<<<<<<< HEAD
	private List<Aluno> A;
=======
>>>>>>> 8ccd40ca5b2aaed39fe09d9baf34e81396551b28
	
	public JanelaAluno(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");
		btEditar = new JButton("Editar");

		alunos = Dados.getInstance().getListAlunos();
		
		DefaultListModel<Aluno> lm = new DefaultListModel<>();
		jlAlunos = new JList<>(lm);
		jlAlunos.setModel(lm);
		add(jlAlunos);
		
		for(int i=0;i<alunos.size();i++){
			lm.add(i,alunos.get(i));
<<<<<<< HEAD
		}	
	}
	
	public void gerenciarAlunos() {
=======
		}

>>>>>>> 8ccd40ca5b2aaed39fe09d9baf34e81396551b28
		add(btOK, BorderLayout.WEST);
		add(btEditar, BorderLayout.EAST);
		
		btEditar.addActionListener((e)->{
			E = jlAlunos.getSelectedValue();
			EditarAluno aluno = new EditarAluno(E);
			dispose();	
		});
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
	}
	
	public void adicionarAlunos() {
		add(btOK, BorderLayout.WEST);
		A = jlAlunos.getSelectedValuesList();
		btOK.addActionListener((e)->{
			Turma t = new Turma();
			for(int i = 0; i < A.size(); i++) {
				t.alunos.add(i,A.get(i));
			}
			dispose();
		});
		setSize(300,300);
		setVisible(true);
	}
}

