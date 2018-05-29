import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import java.awt.BorderLayout;
import java.util.List;
import java.util.ArrayList;

public class JanelaProfessor extends JFrame {
	private JButton btOK;
	private ArrayList<Professor> professores;
	
	public JanelaProfessor(){
		super("Gerenciar Professores");
		
		btOK = new JButton("OK");

		btOK.addActionListener((e)->{
			professores = DadosProfessores.getInstance().getListProfessor();
			/**while (professores.hasNext()) {
			 * 	System.out.printfln(professores.next());
			} **/
		});

		add(btOK, BorderLayout.SOUTH);
		
		setSize(300,500);
		setVisible(true);
	}
	
}

