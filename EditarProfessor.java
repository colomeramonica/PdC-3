/** Leonardo Bortolotti 568929
 * Mônica Colomera 570265 
 **/
 
import javax.swing.*;
import java.util.*;
import java.awt.*;

public class EditarProfessor extends JFrame{
	private ArrayList<Professor> lstProf;	
	private int index;
	
	public EditarProfessor(Professor edicao) {
		// Refaz a tela de cadastro de professor, porém dessa vez os campos são atualizados
		setLayout(new GridLayout(5,2));
		
		JLabel lblNomeProf = new JLabel("*Nome: ");
		JTextField txtNomeProf = new JTextField();
		txtNomeProf.setText(edicao.getNome());
		
		JLabel lblEspecialidade = new JLabel("*Especialidade: ");
		JTextField txtEspecialidade = new JTextField();
		txtEspecialidade.setText(edicao.getEspecialidade());
		
		JLabel lblRgProf = new JLabel("*RG: ");
		JTextField txtRgProf = new JTextField();
		
		JLabel lblCpfProf = new JLabel("*CPF: ");
		JTextField txtCpfProf = new JTextField();
		
		JButton btCancelar = new JButton("Cancelar");
		JButton btOk = new JButton("OK");
		
		add(lblNomeProf); add(txtNomeProf);
		add(lblEspecialidade); add(txtEspecialidade);
		add(lblRgProf); add(txtRgProf);
		add(lblCpfProf); add(txtCpfProf);
		add(btCancelar); add(btOk);
		
		btOk.addActionListener((e)->{
			Professor p = new Professor();
			lstProf = Dados.getInstance().getListProfessor();
			index = lstProf.indexOf(edicao);
			p.setNome(txtNomeProf.getText());
			p.setEspecialidade(txtEspecialidade.getText()); // recebe o texto alterado dos campos
			if (index > -1) {
				lstProf.set(index, p); // atualiza os valores na posição correta da lista
			}
			dispose();
		});
		
		btCancelar.addActionListener((e)->{ dispose(); });

		setSize(500,300);
		setVisible(true);
		
	}
	
}
