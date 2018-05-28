import javax.swing.JFrame;
import javax.swing.JButton;

public class Janela extends JFrame{
	public Janela() {
		JButton btAbrir = new JButton("Abrir");
		add(btAbrir);
		btAbrir.addActionListener((e)->{
			JanelaProfessor j = new JanelaProfessor(this);
			});	
			
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main (String args[]){
			Janela t = new Janela();
	}

}


