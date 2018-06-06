import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Turma {
	private String dataInicio;
	private String dataFinal;
	private Professor prof;
	public ArrayList<Aluno> alunos;
	
	public String getDataInicio() { return dataInicio; }
	public String getDataFinal() { return dataFinal; }
	public Professor getProfessor() { return prof; }
	
	public void setDataInicio(String d) {  dataInicio  = d; }
	public void setDataFinal(String d) {  dataFinal  = d; }
	public void setProf(Professor pr) {  prof  = pr; }

	public void addAluno(ArrayList <Aluno> listA) {
		for(int i = 0; i < listA.size(); i++) {
			alunos.add(i,listA.get(i));
		}
	}
		
}
