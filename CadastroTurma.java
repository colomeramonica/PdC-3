import javax.swing.*;
import java.util.*;
import java.awt.*;

public class CadastroTurma extends JDialog{
	private ArrayList<Turma> lstTurma;	
	private boolean navegacao;
	
	public CadastroTurma(Frame owner) {
		super(owner,true);
		
		setLayout(new GridLayout(5,2));
		
		JLabel lbldataInicio = new JLabel("*Data Início: ");
		JTextField txtdataInicio = new JTextField();
		
		JLabel lbldataFim = new JLabel("*Data Fim: ");
		JTextField txtdataFim = new JTextField();
		
		JButton btProf = new JButton("Adicionar professor responsavel");
		JButton btAlunos = new JButton("Adicionar alunos");
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lbldataInicio); add(txtdataInicio);
		add(lbldataFim); add(txtdataFim);
		add(btProf); add(btAlunos);
		add(btCancelar); add(btOk);
		
		btOk.addActionListener((e)->{
			Turma t = new Turma();
			if(txtdataInicio.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar a data inicial!");
			}
			t.setDataInicio(txtdataInicio.getText());
	
			if(txtdataFim.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Voce deve informar a data final!");
			}
			t.setDataFinal(txtdataFim.getText());
			
			lstTurma = Dados.getInstance().getListTurmas();
			lstTurma.add(t);
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });

		setSize(500,300);
		setVisible(true);
		
	}
	
}
