import javax.swing.*;
import java.util.*;
import java.awt.*;

public class CadastroAluno extends JDialog{
	private ArrayList<Aluno> lstAln;	
	private boolean navegacao;
	
	public CadastroAluno(Frame owner) {
		super(owner,true);
		
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
			if(txtNomeAln.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o nome!");
			}
			a.setNome(txtNomeAln.getText());
	
			if(txtRgAln.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o RG!");
			}
			a.setRg(txtRgAln.getText());
			
			if(txtCpfAln.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o CPF!");
			}
			a.setCpf(txtCpfAln.getText());
			
			if(txtRa.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar o RA!");
			}
			a.setRa(txtRa.getText());
			
			a.setDataMatricula(txtdataMatricula.getText());
			
			lstAln = Dados.getInstance().getListAlunos();
			lstAln.add(a);
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });

		setSize(500,300);
		setVisible(true);
		
	}
	
}
