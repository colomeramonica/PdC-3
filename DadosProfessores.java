import java.util.*;

public class Dados {
	private static Dados instance;
	
	public static DadosProfessores getInstance() {
		if(instance==null){
			instance = new Dados();
		}
		return instance;
	}

	private ArrayList<Professor> lstProfessores;
	private ArrayList<Aluno> lstAlunos;
	private ArrayList<Turma> lstTurmas;
	
	private Dados(){
		lstProfessores = new ArrayList<>();
		lstAlunos = new ArrayList<>();
		lstTurmas = new ArrayList<>();
	}
	
	public ArrayList<Professor> getListProfessor(){
		return lstProfessores;
	}
	
	public ArrayList<Aluno> getListAlunos(){
		return lstAlunos;
	}
	
	public ArrayList<Turma> getListTurmas(){
		return lstTurmas;
	}
}
