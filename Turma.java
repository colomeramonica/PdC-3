import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Turma {
	private String dataInicio;
	private String dataFinal;
	private Professor prof;
	private Aluno[] alunos;
	private int p;
	
	public String getDataInicio() { return dataInicio; }
	public String getDataFinal() { return dataFinal; }
	public Professor getProfessor() { return prof; }
	
	public void setDataInicio(String d) {  dataInicio  = d; }
	public void setDataFinal(String d) {  dataFinal  = d; }
	public void setProf(Professor pr) {  prof  = pr; }
	
	public boolean addAluno(Aluno a){
		if(p<alunos.length){
			alunos[p++] = a;
			return true;
		}
		return false;
	}
	
	public boolean removeAluno(int idx){
		if(idx<p){
			alunos[idx] = alunos[--p];
			return true;
		}
		return false;
	}
	
	public Aluno getAluno(int idx){
		if(idx<p){
			return alunos[idx];
		}
		return null;
	}
	
	public void listarAlunos() {
		for(int i=0; i<p; i++){		
			System.out.printf("Aluno: %d\n", i);
			System.out.printf("Nome: %s\n", alunos[i].getNome());
			System.out.printf("Cpf: %s\n", alunos[i].getCpf());
			System.out.printf("Rg: %s\n", alunos[i].getRg());
			System.out.printf("Ra: %s\n", alunos[i].getRa());
		}
	}
	
	public Turma() {
		// o contrutor de turma tinha como parametro um professor, então na tela antes de inicializar turma, tem que ja ter o objeto professor selecionado e passar o mesmo como parametro
		alunos = new Aluno[100];
		p=0;
	}
}
