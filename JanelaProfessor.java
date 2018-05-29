import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import java.awt.BorderLayout;
import java.util.List;

public class JanelaProfessor extends JFrame {
	private JButton btOK;
	
	public JanelaProfessor(){
		super("Gerenciar Professores");
		
		btOK = new JButton("OK");

		btOK.addActionListener((e)->{
			/** PRINTAR O CONTEUDO DA LISTA **/
		});

		add(btOK, BorderLayout.SOUTH);
		
		setSize(300,500);
		setVisible(true);
	}
	
}

