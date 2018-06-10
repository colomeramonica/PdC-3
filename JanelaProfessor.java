import javax.swing.*;
import java.util.*;
import java.awt.*;

public class JanelaProfessor extends JDialog {
	private JButton btOK;
	private JButton btEditar;
	private ArrayList<Professor> professores;
	private JList<Professor> jlProfessores;
	private Professor E;
	
	public JanelaProfessor(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");
		btEditar = new JButton("Editar");

		professores = Dados.getInstance().getListProfessor(); // instancia a lista de Professores
		
		DefaultListModel<Professor> lm = new DefaultListModel<>();
		jlProfessores = new JList<>(lm);
		jlProfessores.setModel(lm);
		
		add(jlProfessores);
		for(int i=0;i<professores.size();i++){
			lm.add(i,professores.get(i)); // printa os elementos
		}

		add(btOK, BorderLayout.WEST);
		add(btEditar, BorderLayout.EAST); 
		
		btEditar.addActionListener((e)->{
			E = jlProfessores.getSelectedValue();
			EditarProfessor professor = new EditarProfessor(E);
			dispose();
			
		});
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public Professor getSelected() {
		E = jlProfessores.getSelectedValue();
		return E;
	}
			
	
}

