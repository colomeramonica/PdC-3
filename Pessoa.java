/** Leonardo Bortolotti 568929
 * Mônica Colomera 570265 
 **/
 
/* Classe Pessoa */

public class Pessoa
{
	private String nome, cpf, rg;
	
	public void setNome(String n) { nome = n; }
	public void setCpf(String n) { cpf = n; }
	public void setRg(String n) { rg = n;}
	
	public String getNome() { return nome; }
	public String getCpf() { return cpf; }
	public String getRg() { return rg;}
	
	@Override // sobrescrita do método toString para permitir a impressão dos nomes dos elementos do programa na listagem
	public String toString() {
		return nome+"\n";
	}
}
	
