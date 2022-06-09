
public class Principal {

	public static void main(String[] args) {
		Colecao colecao = new Colecao();

		CD cd1 = new CD("Revolver", "The Beatles", "Rock");
		CD cd2 = new CD("The Beatles", "The Beatles", "Rock");
		CD cd3 = new CD("Hunky Dory", "David Bowie", "Pop Rock");
		CD cd4 = new CD("Banda Djavu e DJ Juninho Portugal", "Djavu", "Forró Eletrônico");
		CD cd5 = new CD("João Gomes Ao Vivo em Recife", "João Gomes", "Piseiro");

		colecao.addCD(cd1);
		colecao.addCD(cd2);
		colecao.addCD(cd3);
		colecao.addCD(cd4);
		colecao.addCD(cd5);
		
		colecao.listaCD();
		
		System.out.println("***********************************");
		colecao.listaPorArtista("The Beatles");
		
		System.out.println("***********************************");
		colecao.listaPorGenero("Rock");
		
		colecao.removeCD(cd3);
		System.out.println("***********************************");
		colecao.listaCD();

	}

}
