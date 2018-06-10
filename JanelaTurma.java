/** Leonardo Bortolotti 568929
 * Mônica Colomera 570265 
 **/
 
/* Tela de listagem dos alunos cadastrados */

import javax.swing.*;
import java.util.*;
import java.util.List;
import java.awt.*;

public class JanelaTurma extends JDialog {
	private JButton btOK;
	private JButton btEditar;
	private ArrayList<Turma> turma;
	private JList<Turma> jlTurma;
	private Turma E;
	private List<Turma> turminha;
	
	public JanelaTurma(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");
		btEditar = new JButton("Editar");

		turma = Dados.getInstance().getListTurmas(); // instancia a lista de turma
		
		DefaultListModel<Turma> lm = new DefaultListModel<>();
		jlTurma = new JList<>(lm);
		jlTurma.setModel(lm);
		add(jlTurma);
		
		for(int i=0;i<turma.size();i++){
			lm.add(i,turma.get(i));
		}	
		
		add(btOK, BorderLayout.WEST);
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
}

