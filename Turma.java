import java.util.Scanner;

public class Turma{
	Scanner teclado = new Scanner(System.in);
	private int a, p;
	
	Professor professores[] = new Professor[100]; int vProf = 0;
	Aluno alunos[] = new Aluno[100]; int vAluno = 0;
	
	public Turma(){
		professores = new Professor[100];
		alunos = new Aluno[100];
		p = 0; a = 0;
	}
	
	public boolean addAluno (Aluno v) {
		if (a < alunos.length) {
				this.alunos[a++] = v;
				return true;
			}
			return false;
	}
	
	public boolean addProfessor (Professor a)
		{
			if (p < professores.length) {
				professores[p++] = a;
				return true;
			}
			return false;
		}
		
		public boolean removeAluno (int idx)
		{
			if (idx < a) {
				alunos[idx] = alunos[--a];
				return true;
			}
			return false;
		}
		
		public boolean removeProfessor (int idx)
		{
			if (idx < p) {
				professores[idx] = professores[--p];
				return true;
			}
			return false;
		}
	}
