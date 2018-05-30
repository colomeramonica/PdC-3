import javax.swing.*;
import java.util.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JanelaAluno extends JDialog {
	private JButton btOK;
	private JButton btEditar;
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
		
		/*jlAlunos.addListSelectionListener(new ListSelectionListener(){
			@Override
            public void valueChanged(ListSelectionEvent e){
				jlAlunos.getSelectedValue().toString();		Isso daqui captura um elemento selecionado na Jlist, pode ser que funcione, mas acho que vai ter que escrver um metoodo como o toString ali 
			}
		});*/

		add(btOK, BorderLayout.WEST);
		add(btEditar, BorderLayout.EAST);
		
		btOK.addActionListener((e)->{
			dispose();
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
}

