package Atividade10;

public class ArvoreGenealogica {
    
    Pessoa info;
    
    public ArvoreGenealogica(String nome, int idade, String nomePai, String nomeMae) {
        info.nome = nome;
        info.idade = idade;
        info.nomePai = nomePai;
        info.nomeMae = nomeMae;
    }
    
    public void Display(){
            System.out.println("Nome: " + info.getNome());
            System.out.println("Idade: " + info.getIdade());
            System.out.println("Nome do pai: " + info.getNomePai());
            System.out.println("Nome da Mãe: " + info.getNomeMae());
        }
}