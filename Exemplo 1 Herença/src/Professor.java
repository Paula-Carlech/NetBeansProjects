
public class Professor extends Pessoa {
	private String especialidade;
	private float salario = 0;
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void receberAumento(float aumento) {
		this.salario = this.salario + aumento;
	}
	
	public void receberAumento() {
		this.salario = this.salario * 1.1f;
	}
}
