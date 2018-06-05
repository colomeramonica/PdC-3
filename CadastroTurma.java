import javax.swing.*;
import java.util.*;
import java.awt.*;

public class CadastroTurma extends JDialog{

    private JFrame jFrame;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panelButo;
    private JButton butao;
    private JButton butaoAdd;
    private JButton butaoRem;
    private JTextField textFieldNome;
    private JTextField textFieldSobrenome;
    private JTextField txtProfessor;
    private JList lstAdicionados;
    private JList teste;
    

    public CadastroTurma(Frame owner) {
		super(owner,true);
		jFrame = new JFrame("Gerenciar turmas");
		jFrame.setLayout(new GridLayout(5,5));
	
		/*
		* Um JPainel para adicionar os componentes JLabel e JTextField 
		* que contém respectivamente o rótulo "Nome:" e o campo para edição. 
		*/
		 
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 0));
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1, 0));
		
		panelButo = new JPanel();
		panelButo.setLayout(new GridLayout(2, 1));

		/*
		* Outro JPainel para adicionar os componentes JLabel e JTextField 
		* que contém respectivamente o rótulo "Sobrenome:" e o campo para edição. 
		*/
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(1, 0));
		
		
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(1,3));
		
		panel4 = new JPanel();
		panel4.setLayout(new GridLayout(1,3));

		textFieldNome = new JTextField(15);
		textFieldSobrenome = new JTextField(15);
		txtProfessor = new JTextField();
		butao = new JButton();
		
		lstAdicionados = new JList();
		teste = new JList();
		butaoAdd = new JButton();
		butaoRem = new JButton();
		

		//Adição dos componentes ao JPanel
		panel1.add(new JLabel("Data de Inicio: "));
		panel1.add(textFieldNome);

		//Adição dos componentes ao JPanel
		panel2.add(new JLabel("Data Final: "));
		panel2.add(textFieldSobrenome);
		
		panel3.add(new JLabel("Selecionar professor:"));
		panel3.add(txtProfessor);
		panel3.add(butao);
		
		panel4.add(lstAdicionados);
		panel4.add(panelButo);
		panel4.add(teste);
		
		panelButo.add(butaoAdd);
		panelButo.add(butaoRem);
		
		

		//Adição dos componentes JPanel ao JFrame
		jFrame.add(panel1);
		jFrame.add(panel2);
		jFrame.add(panel3);
		jFrame.add(panel4);
		
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
    }
}
