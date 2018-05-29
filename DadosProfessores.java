import java.util.*;

public class DadosProfessores {
	private static DadosProfessores instance;
	
	public static DadosProfessores getInstance() {
		if(instance==null){
			instance = new DadosProfessores();
		}
		return instance;
	}

	private ArrayList<Professor> lstProfessores;
	
	private DadosProfessores(){
		lstProfessores = new ArrayList<>();
	}
	
	public ArrayList<Professor> getListProfessor(){
		return lstProfessores;
	}
}
