package Exercicio1;
public class Alunos {
    
    private String nome;
    private int anoNascimento;
    private static int total = 0;

    public Alunos(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        total++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Alunos.total = total;
    }

    @Override
    public String toString() {
        return "Alunos: \n" + "Nome: " + nome + "\nAno de Nascimento: " + anoNascimento + "\n";
    }
    
    public void TotCadastrado(){
        System.out.println("Total de alunos Cadastrados: " + total);
    }
        
}
