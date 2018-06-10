/* Classe Turma */

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Turma {
	private String nome;
	private String dataInicio;
	private String dataFinal;
	private Professor prof;
	public ArrayList<Aluno> alunos;
	public ArrayList<Turma> turma;
	public int cont = 1;
	
	public String getDataInicio() { return dataInicio; }
	public String getDataFinal() { return dataFinal; }
	public String getNome() { return nome; }
	public Professor getProfessor() { return prof; }
	public ArrayList<Aluno> getAlunos() { return alunos; }
	
	public void setDataInicio(String d) {  dataInicio  = d; }
	public void setDataFinal(String d) {  dataFinal  = d; }
	public void setNome(String d) {  nome  = d; }
	public void setProfessor(Professor pr) {  prof  = pr; }
	public void setAlunos(ArrayList<Aluno> a) {  alunos  = a; }

	/** Responsável pela adição de novos elementos a turma **/
	public Turma(ArrayList<Aluno> a, Professor p){
		this.setAlunos(a);
		this.setProfessor(p);
		this.setNome("Turma"+"\n"cont);
		cont++;
	}
	
	@Override // sobrescrita do método toString para permitir a impressão dos nomes dos elementos do programa na listagem
	public String toString() {
		return this.getNome();
	}
}

