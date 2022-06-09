
public class HerancaPessoa {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		Professor prof = new Professor();
		Funcionario f = new Funcionario();
		Bolsista b = new Bolsista();
		
//		a.setNome("Fulano");
//		System.out.println(a.toString());
//		prof.setIdade(30);
//		f.setSexo("Feminino");
//		System.out.println(f.toString());
//		f.setNome("Ciclana");
//		System.out.println(f.getNome());
		
//		b.pagarMensalidade();
//		a.pagarMensalidade();
		prof.setSalario(1500);
		prof.receberAumento();
		System.out.println(prof.getSalario());
		prof.receberAumento(1000);
		System.out.println(prof.getSalario());
		

	}

}
