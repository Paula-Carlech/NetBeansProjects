package Exercicio2;
public class SerieLimitada {
    
    private String nome;
    private int ano;
    private static final int MaximoDeInstancias = 3;
    private static int contador = 0;

    public SerieLimitada(String nome, int ano) {
        if(contador <= MaximoDeInstancias){
            this.nome = nome;
            this.ano = ano;
            contador++;
        }else{
            System.out.println("Impossível criar outra instância!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "SerieLimitada{" + "nome=" + nome + ", ano=" + ano + '}';
    }
    
}
