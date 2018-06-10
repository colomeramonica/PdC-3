/** Leonardo Bortolotti 568929
 * Mônica Colomera 570265 
 **/
 
import java.util.List;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AdicionarAluno extends JDialog {
	private JButton btOK;
	private JButton btEditar;
	private ArrayList<Turma> turmas;
	private JList<Turma> jlAlunos; 
	private ArrayList <Turma> E;
	
	public AdicionarAluno(Frame owner) {
		super(owner,true);
		
		btOK = new JButton("OK");

		turmas = Dados.getInstance().getListTurmas();
		
		DefaultListModel<Turma> lm = new DefaultListModel<>();
		jlAlunos = new JList(lm);
		jlAlunos.setModel(lm); 
		
		add(jlAlunos);
		for(int i=0;i<turmas.size();i++){
			lm.add(i,turmas.get(i));
		} 

		add(btOK, BorderLayout.WEST);
		
		btOK.addActionListener((e)->{
			E = jlAlunos.getSelectedValuesList();

			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
}

