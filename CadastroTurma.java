import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.util.List;

public class CadastroTurma extends JDialog{

    private JFrame jFrame;
    private JPanel panelInicio;
    private JPanel panelFim;
    private JPanel panelProf;
    private JPanel panelList;
    private JPanel panelBotoes;
    private JPanel panelGerenciar;
    private JButton btnProf;
    private JButton btEsq;
    private JButton btDir;
    private JButton btOk;
    private JButton btCancela;
    private JTextField txtDataInicio;
    private JTextField txtDataFim;
    private JTextField txtProfessor;
    private JList<Aluno> listaAdicionados;
    private JList<Aluno> listaAlunos;
<<<<<<< HEAD
    private Aluno selected;
    private Turma turmaAux;
    private Professor professor;
    private ArrayList <Aluno> alunos, var;
    private ArrayList <Turma> turma;
    private int i;

    public CadastroTurma(Frame owner) {
		super(owner,true);
		jFrame = new JFrame("Cadastro de turmas");
=======
    private List<Aluno> selected;
    private Turma turmaAux;
    private Professor professor;
    private ArrayList <Aluno> alunos;

    public CadastroTurma(Frame owner) {
		super(owner,true);
		jFrame = new JFrame("Gerenciar turmas");
>>>>>>> 4168886e479b037bc5a02328c8221ef5a738e2de
		jFrame.setLayout(new GridLayout(5,5));
	
		/*
		* Um JPainel para adicionar os componentes JLabel e JTextField 
<<<<<<< HEAD
		* que contém as labels das datas 
=======
		* que contém respectivamente o rótulo "Nome:" e o campo para edição. 
>>>>>>> 4168886e479b037bc5a02328c8221ef5a738e2de
		*/
		 
		panelInicio = new JPanel();
		panelInicio.setLayout(new GridLayout(1, 0));
		
		panelInicio = new JPanel();
		panelInicio.setLayout(new GridLayout(1, 0));

		
		panelBotoes = new JPanel();
		panelBotoes.setLayout(new GridLayout(2, 1));

		/*
		* Outro JPainel para adicionar os componentes JLabel e JTextField 
<<<<<<< HEAD
		* contendo  botão de adição do professor
=======
		* que contém respectivamente o rótulo "Sobrenome:" e o campo para edição. 
>>>>>>> 4168886e479b037bc5a02328c8221ef5a738e2de
		*/
		panelFim = new JPanel();
		panelFim.setLayout(new GridLayout(1, 0));
		
		
		panelProf = new JPanel();
		panelProf.setLayout(new GridLayout(1,3));
		
		panelList = new JPanel();
		panelList.setLayout(new GridLayout(1,3));
		
		panelGerenciar = new JPanel();
		panelGerenciar.setLayout(new GridLayout(1,0));

		txtDataInicio = new JTextField(15);
		txtDataFim = new JTextField(15);
		txtProfessor = new JTextField();
		btnProf = new JButton("Selecionar professor: ");
		btOk = new JButton("OK");
		btCancela = new JButton("Cancelar");
		
		listaAlunos = new JList();
		listaAdicionados = new JList();
		
		btEsq = new JButton(">");
		btDir = new JButton("<");
		
		/** Exibição dos alunos cadastrados **/
		alunos = Dados.getInstance().getListAlunos();

		DefaultListModel<Aluno> lm = new DefaultListModel<>();
		listaAlunos = new JList<>(lm);
		listaAlunos.setModel(lm);

		for(int i=0;i<alunos.size();i++){
				lm.add(i,alunos.get(i));
		} 
		/** Fim da exibição dos alunos **/
		
		/**Adicionando alunos nas turmas **/
		DefaultListModel<Aluno> lt = new DefaultListModel<>();
		listaAdicionados = new JList<>(lt);
		listaAdicionados.setModel(lt);
		/** **/

		//Adição dos componentes ao JPanel
		panelInicio.add(new JLabel("Data de Inicio: "));
		panelInicio.add(txtDataInicio);

		//Adição dos componentes ao JPanel
		panelFim.add(new JLabel("Data Final: "));
		panelFim.add(txtDataFim);
		
		panelProf.add(new JLabel("Selecionar professor:"));
		panelProf.add(txtProfessor);
		panelProf.add(btnProf);
		
		panelList.add(listaAlunos);
		panelList.add(panelBotoes);
		panelList.add(listaAdicionados);
		
		panelBotoes.add(btEsq);
		panelBotoes.add(btDir);
		
		panelGerenciar.add(btOk);
		panelGerenciar.add(btCancela);

		//Adição dos componentes JPanel ao JFrame
		jFrame.add(panelInicio);
		jFrame.add(panelFim);
		jFrame.add(panelProf);
		jFrame.add(panelList);
		jFrame.add(panelGerenciar);

		btnProf.addActionListener((e)->{
		/** No clique do botão de 'Adicionar Professor' é aberta a tela de listagem de professores e,
		 * ao selecionar um, o nome deste é exibido na tela de Turma e o botão é desabilitado para impedir a 
		 * adição de mais professores em uma mesma turma **/
			JanelaProfessor j = new JanelaProfessor(null);
			try {
				professor = j.getSelected();
				txtProfessor.setText(professor.getNome());
				txtProfessor.setVisible(true);
				txtProfessor.setEditable(false);
				btnProf.setEnabled(false);
			} catch (Exception ex) { // caso não haja professor selecionado, lança uma exceção e exibe um aviso na tela
				JOptionPane.showMessageDialog(null,"Voce deve selecionar um professor!");
			}
		});
		
		/** Recebe os alunos selecionados e os adiciona na turma recém criada **/
		btOk.addActionListener((e)->{
<<<<<<< HEAD
		//Jogar os alunos selecionados e adicioná-los na classe recém instanciada
			var = Collections.list(lt.elements());
			Turma turmaAux = new Turma(var, professor);
			turma = Dados.getInstance().getListTurmas();
			turma.add(turmaAux);
			jFrame.dispose();
		}); 
				
		btEsq.addActionListener((e)->{
			selected = listaAlunos.getSelectedValue(); // seleciona o aluno
			if (!lt.isEmpty()) {
				i = lm.indexOf(selected); // retorna o index do aluno selecionado
					lt.add(lt.size() -1, selected); // adiciona na lista à direita
					lm.remove(i);
				} else {
					i = lm.indexOf(selected);
					lt.add(lt.size(), selected);
					lm.remove(i);
				}	
		});
		
		btDir.addActionListener((e)->{
			selected = listaAlunos.getSelectedValue();
			if (!lm.isEmpty()) {
				i = lt.indexOf(selected);
					lm.add(lt.size() -1, selected);
					lt.remove(i);
				} else {
					i = lt.indexOf(selected);
					lm.add(lt.size(), selected);
					lt.remove(i);
				}	
		});
		
		btCancela.addActionListener((e)->{
			jFrame.dispose();
=======
		//@TODO jogar os alunos selecionados (que teoricamente estarão nessa nova lista) e adicioná-los na classe recém instanciada
			Turma turmaAux = new Turma();
			for(int i = 0; i < listaAdicionados.getModel().getSize(); i++) {
				turmaAux.addAluno(listaAdicionados.getModel().getElementAt(i));
			}
			turmaAux.setProfessor(professor);
			dispose();
		}); 
				
		btEsq.addActionListener((e)->{
			selected = listaAlunos.getSelectedValuesList();
			try {
				if (!lt.isEmpty()) {
					for (int i = 0; i <= selected.size(); i++) {
						lt.add(lt.size() - 1, selected.get(i));
						lm.removeElementAt(i);
					}
			} else {
				for (int i = 0; i <= selected.size(); i++) {
						lt.add(i, selected.get(i));
						lm.removeElementAt(i);
					}
				}
			} catch (Exception ex) {
				System.out.printf("");
			}
		});
		
		btDir.addActionListener((e)->{
			selected = listaAdicionados.getSelectedValuesList();
			try {
				if (!lm.isEmpty()) {
					for (int i = 0; i <= selected.size(); i++) {
						lm.add(lt.size() - 1, selected.get(i));
						lt.removeElementAt(i);
					}
			} else {
				for (int i = 0; i <= selected.size(); i++) {
						lm.add(i, selected.get(i));
						lt.removeElementAt(i);
					}
				}
			} catch (Exception ex) {
				System.out.printf("");
			}
>>>>>>> 4168886e479b037bc5a02328c8221ef5a738e2de
		});
		
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
    }
}
