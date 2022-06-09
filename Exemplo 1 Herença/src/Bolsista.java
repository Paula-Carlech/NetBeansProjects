
public class Bolsista extends Aluno {
	private float bolsa;

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("O Bolsista pagou a mensalidade");
	}
}
