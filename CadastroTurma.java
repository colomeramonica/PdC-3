/* Tela de cadastro de novas turmas */

import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.List;

public class CadastroTurma extends JDialog{
    private JList<Aluno> listaAdicionados;
    private JList<Aluno> listaAlunos;
    private ArrayList<Aluno> alunos;
    private ArrayList<Turma> turma;
    private List <Aluno> lstAux;
    private int size;
 
    public CadastroTurma(Frame owner) {
		super(owner,true);
		JFrame jFrame = new JFrame("Gerenciar turmas");
		jFrame.setLayout(new GridLayout(5,5)); // setando o layout inicial da tela 

		/** Declaração dos panels que serão usados **/
		JPanel panelInicio = new JPanel(); // Panel para a adição dos JLabel e JTextField referentes a Data Inicial
		JPanel panelFim = new JPanel(); // Panel para a adição dos JLabel e JTextField referentes a Data Final
		JPanel panelBotoes = new JPanel(); // Panel para a adição dos JButton referentes aos botões '<' e '>'
		JPanel panelProf = new JPanel(); // Panel referente ao JButton de escolha do professor e o JTextField que exibe o nome do mesmo
		JPanel panelList = new JPanel(); // Panel para a adição do JList que irá exibir os alunos cadastrados
		JPanel panelGerenciar = new JPanel();
		
		/** Configuração dos layouts de cada panel **/
		panelInicio.setLayout(new GridLayout(1, 0)); 
		panelBotoes.setLayout(new GridLayout(2, 1));
		panelFim.setLayout(new GridLayout(1, 0));
		panelProf.setLayout(new GridLayout(1,3));
		panelList.setLayout(new GridLayout(1,3));
		panelGerenciar.setLayout(new GridLayout(1,0));

		/** Declaração dos campos de texto **/
		JTextField txtDataInicio = new JTextField();
		JTextField txtDataFim = new JTextField();
		JTextField txtProfessor = new JTextField();
		
		/** Declaração dos botões **/
		JButton btEsq = new JButton(">");
		JButton btDir = new JButton("<");
		JButton btOk = new JButton("Ok");
		JButton btCancela = new JButton("Cancelar");
		JButton btnProf = new JButton("Adicionar professor");
		
		/** Exibição dos alunos cadastrados **/
		alunos = Dados.getInstance().getListAlunos();
		
		DefaultListModel<Aluno> lm = new DefaultListModel<>();
		listaAlunos = new JList<>(lm);
		listaAlunos.setModel(lm);

		for(int i=0;i<alunos.size();i++){
			lm.add(i,alunos.get(i));
		} 
		/** Fim da exibição dos alunos **/
		
		//Adição dos componentes ao JPanel
		panelInicio.add(new JLabel("Data de Inicio: "));
		panelInicio.add(txtDataInicio);

		//Adição dos componentes ao JPanel
		panelFim.add(new JLabel("Data Final: "));
		panelFim.add(txtDataFim);
		
		panelProf.add(new JLabel("Selecionar professor:"));
		panelProf.add(txtProfessor);
		panelProf.add(btnProf);
		txtProfessor.setVisible(false);
		
		panelList.add(listaAlunos);
		panelList.add(panelBotoes);
		panelList.add(listaAdicionados);
		
		panelBotoes.add(btEsq);
		panelBotoes.add(btDir);
		
		panelGerenciar.add(btOk);
		panelGerenciar.add(btCancela);
		
		//Adição dos componentes JPanel ao JFrame
		jFrame.add(panelInicio);
		jFrame.add(panelFim); jFrame.add(panelProf); 
		jFrame.add(panelList); jFrame.add(panelGerenciar);
		
		btnProf.addActionListener((e)->{
		/** No clique do botão de 'Adicionar Professor' é aberta a tela de listagem de professores e,
		 * ao selecionar um, o nome deste é exibido na tela de Turma e o botão é desabilitado para impedir a 
		 * adição de mais professores em uma mesma turma **/
			JanelaProfessor j = new JanelaProfessor(null);
			try {
				txtProfessor.setText(j.getSelected().getNome());
				txtProfessor.setVisible(true);
				txtProfessor.setEditable(false);
				btnProf.setEnabled(false);
			} catch (Exception ex) { // caso não haja professor selecionado, lança uma exceção e exibe um aviso na tela
				JOptionPane.showMessageDialog(null,"Voce deve selecionar um professor!");
			}
		});
		
		/** Recebe os alunos selecionados e os adiciona na turma recém criada **/
		btOk.addActionListener((e)->{
			Turma turma = new Turma();
		//@TODO jogar os alunos selecionados (que teoricamente estarão nessa nova lista) e adicioná-los na classe recém instanciada
			dispose();
		}); 
		
		btCancela.addActionListener((e)->{
			dispose();
		});
		
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
    }

}
