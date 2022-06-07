package Atividade01;
public class Engenheiro extends Empregado {
    
    private String formacao;
    
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public Engenheiro(int m, String n, String f ){
        this.formacao = formacao;
    }
    
    public void gerenciaobra(){
        System.out.println("Gerenciando obra...");
    }
}
