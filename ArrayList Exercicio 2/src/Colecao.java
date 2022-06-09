import java.util.ArrayList;

public class Colecao {
	private ArrayList<CD> collection = new ArrayList<CD>();
	
	public void addCD(CD c) {
		collection.add(c);
	}
	
	public void removeCD(CD c) {
		collection.remove(c);
	}
	
	public void listaCD() {
		//CD c;
		for(int i = 0; i < collection.size(); i++) {
			//c = collection.get(i);
			System.out.println(collection.get(i).toString());
		}
	}
	
	public void listaPorGenero(String genero) {
		for(int i = 0; i < collection.size(); i++) {
			//c = collection.get(i);
			if(genero.equals(collection.get(i).getGenero())) {
				System.out.println(collection.get(i).toString());
			}
		}
	}
	
	public void listaPorArtista(String artista) {
		for(int i = 0; i < collection.size(); i++) {
			//c = collection.get(i);
			if(artista.equals(collection.get(i).getArtista())) {
				System.out.println(collection.get(i).toString());
			}
		}
	}
}
