import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JanelaProfessor extends JDialog {
	private JButton btOK;
	private ArrayList<Professor> professores;
	private JList<Professor> jlProfessores;
	
	public JanelaProfessor(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");

		professores = Dados.getInstance().getListProfessor();
		
		DefaultListModel<Professor> lm = new DefaultListModel<>();
		jlProfessores = new JList<>(lm);
		jlProfessores.setModel(lm);
		
		add(jlProfessores);
		for(int i=0;i<professores.size();i++){
			lm.add(i,professores.get(i));
		}

		add(btOK, BorderLayout.SOUTH);
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
}

