import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JanelaProfessor extends JDialog {
	private JButton btOK;
	private ArrayList<Professor> professores;
	
	public JanelaProfessor(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");

		professores = DadosProfessores.getInstance().getListProfessor();
		System.out.println(professores);

		add(btOK, BorderLayout.SOUTH);
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
}

