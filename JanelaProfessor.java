import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.Frame;

public class JanelaProfessor extends JDialog {
	
	public JanelaProfessor(Frame owner) {
		super(owner, true);
		
		DefaultListModel<Professor> model = new DefaultListModel<>();


		// JList<Professor> list = new JList<>(model);
		setSize(300,300);
		setVisible(true);
	}
}
