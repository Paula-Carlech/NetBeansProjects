package questao02;

public class Candidato {
    
    private String nome, sexo;
    private float pontos, mediaF;

    public Candidato(String nome, String sexo, float pontos) {
        this.nome = nome;
        this.sexo = sexo;
        this.pontos = pontos;
    }
    
    public void Display(){
        if(pontos >= 70){
            System.out.println("Nome: "+getNome() + " Pontuação: "+getPontos());
        }
        
        if("F".equals(sexo)){
            mediaF += pontos;
            
            System.out.println("Média feminina: " + mediaF);
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPontos() {
        return pontos;
    }

    public void setPontos(float pontos) {
        this.pontos = pontos;
    }
}