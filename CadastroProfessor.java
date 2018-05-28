import  javax.swing.JFrame;
import  javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.List;
import java.util.ListIterator;											
import java.util.LinkedList;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class CadastroProfessor extends JFrame {
	public List<Professor> lstProfessores;
	public CadastroProfessor() {
		super("Teste");
		
		lstProfessores = new LinkedList<>();
		setLayout(new GridLayout(5,2));
		
		JLabel lblNomeProf = new JLabel("Nome: ");
		JTextField txtNomeProf = new JTextField();
		
		JLabel lblEspecialidade = new JLabel("*Especialidade: ");
		JTextField txtEspecialidade = new JTextField();
		
		JLabel lblRgProf = new JLabel("RG: ");
		JTextField txtRgProf = new JTextField();
		
		JLabel lblCpfProf = new JLabel("CPF: ");
		JTextField txtCpfProf = new JTextField();
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lblNomeProf); 		add(txtNomeProf);
		add(lblEspecialidade);	add(txtEspecialidade);
		add(lblRgProf); add(txtRgProf);
		add(lblCpfProf); add(txtCpfProf);
		add(btCancelar);	add(btOk);
		
		btOk.addActionListener((e)->{
			Professor p = new Professor();
			p.setNome(txtNomeProf.getText());
			p.setNome(txtNomeProf.getText());
			p.setRg(txtRgProf.getText());
			p.setCpf(txtCpfProf.getText());
			
			if(txtEspecialidade.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar a especialidade");
			}
			p.setEspecialidade(txtEspecialidade.getText());
			lstProfessores.add(p);
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });


		setSize(500,300);
		setVisible(true);
	}
	
	
	}
