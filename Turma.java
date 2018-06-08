/* Classe Turma */

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Turma {
	private String dataInicio;
	private String dataFinal;
	private Professor prof;
	public ArrayList<Aluno> alunos;
	private int p;
	
	public String getDataInicio() { return dataInicio; }
	public String getDataFinal() { return dataFinal; }
	public Professor getProfessor() { return prof; }
	
	public void setDataInicio(String d) {  dataInicio  = d; }
	public void setDataFinal(String d) {  dataFinal  = d; }
	public void setProfessor(Professor pr) {  prof  = pr; }

	/** Método responsável pela adição de novos elementos a turma **/
	public boolean addAluno(Aluno a){
		if(p<alunos.size()){
			alunos.add(p,a);
			p++;
			return true;
		}
		return false;
	}
		
		
}
