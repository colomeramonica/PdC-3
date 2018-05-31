import javax.swing.*;
import java.util.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JanelaAluno extends JDialog {
	private JButton btOK;
	private JButton btEditar;
	private ArrayList<Aluno> alunos;
	private JList<Aluno> jlAlunos;
	private Aluno E;
	
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
		}

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
		
		setSize(300,300);
		setVisible(true);
	}
	
}

