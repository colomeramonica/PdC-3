import javax.swing.*;
import java.util.*;
import java.awt.*;

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
    private JList lstAdicionados;
    private JList listaAlunos;
    

    public CadastroTurma(Frame owner) {
		super(owner,true);
		jFrame = new JFrame("Gerenciar turmas");
		jFrame.setLayout(new GridLayout(5,5));
	
		/*
		* Um JPainel para adicionar os componentes JLabel e JTextField 
		* que contém respectivamente o rótulo "Nome:" e o campo para edição. 
		*/
		 
		panelInicio = new JPanel();
		panelInicio.setLayout(new GridLayout(1, 0));
		
		panelInicio = new JPanel();
		panelInicio.setLayout(new GridLayout(1, 0));
		
		panelBotoes = new JPanel();
		panelBotoes.setLayout(new GridLayout(2, 1));

		/*
		* Outro JPainel para adicionar os componentes JLabel e JTextField 
		* que contém respectivamente o rótulo "Sobrenome:" e o campo para edição. 
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
		btnProf = new JButton("Adicionar professor");
		
		lstAdicionados = new JList();
		listaAlunos = new JList();
		txtProfessor = new JTextField();
		btEsq = new JButton(">");
		btDir = new JButton("<");
		btOk = new JButton("Ok");
		btCancela = new JButton("Cancelar");
		
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
		
		panelList.add(lstAdicionados);
		panelList.add(panelBotoes);
		panelList.add(listaAlunos);
		
		panelBotoes.add(btEsq);
		panelBotoes.add(btDir);
		
		panelGerenciar.add(btOk);
		panelGerenciar.add(btCancela);
		
		//Adição dos componentes JPanel ao JFrame
		jFrame.add(panelInicio);
		jFrame.add(panelFim); jFrame.add(panelProf); 
		jFrame.add(panelList); jFrame.add(panelGerenciar);
		
		btnProf.addActionListener((e)->{
			JanelaProfessor j = new JanelaProfessor(null);
		});
		
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
    }
    
    public void selecionarProfessor(Professor p) {
			txtProfessor.setText(p.getNome());
			txtProfessor.setVisible(true);
		}
}
