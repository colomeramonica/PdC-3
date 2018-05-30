import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JanelaAluno extends JDialog {
	private JButton btOK;
	private ArrayList<Aluno> alunos;
	private JList<Aluno> jlAlunos;
	
	public JanelaAluno(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");

		alunos = Dados.getInstance().getListAlunos();
		
		DefaultListModel<Aluno> lm = new DefaultListModel<>();
		jlAlunos = new JList<>(lm);
		jlAlunos.setModel(lm);
		
		add(jlAlunos);
		for(int i=0;i<alunos.size();i++){
			lm.add(i,alunos.get(i));
		}

		add(btOK, BorderLayout.SOUTH);
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
}

