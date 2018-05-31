import javax.swing.*;
import java.util.*;
import java.awt.*;

public class EditarAluno extends JFrame{
	private ArrayList<Aluno> lstAluno;	
	private int index;
	
	public EditarAluno(Aluno edicao) {
		
		setLayout(new GridLayout(6,2));
		
		JLabel lblNomeAln = new JLabel("*Nome: ");
		JTextField txtNomeAln = new JTextField();
		
		JLabel lblRa = new JLabel("*RA: ");
		JTextField txtRa = new JTextField();
		
		JLabel lbldataMatricula = new JLabel("Data de Matrícula: ");
		JTextField txtdataMatricula = new JTextField();
		
		JLabel lblRgAln= new JLabel("*RG: ");
		JTextField txtRgAln = new JTextField();
		
		JLabel lblCpfAln = new JLabel("*CPF: ");
		JTextField txtCpfAln = new JTextField();
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lblNomeAln); add(txtNomeAln);
		add(lblRa); add(txtRa);
		add(lbldataMatricula); add(txtdataMatricula);
		add(lblRgAln); add(txtRgAln);
		add(lblCpfAln); add(txtCpfAln);
		add(btCancelar); add(btOk);
		
		btOk.addActionListener((e)->{
			Aluno a = new Aluno();
			lstAluno = Dados.getInstance().getListAlunos();
			index = lstAluno.indexOf(edicao);
			a.setNome(txtNomeAln.getText());
			a.setDataMatricula(txtdataMatricula.getText());
			if (index > -1) {
				lstAluno.set(index, a);
			}
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });

		setSize(500,300);
		setVisible(true);
		
	}
	
}
