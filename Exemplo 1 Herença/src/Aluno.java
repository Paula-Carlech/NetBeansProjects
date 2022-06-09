
public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMatricula() {
		this.curso = "";
		System.out.println("O Aluno cancelou sua matricula");
	}
	
	public void pagarMensalidade() {
		System.out.println("O Aluno pagou a mensalidade");
	}
}
