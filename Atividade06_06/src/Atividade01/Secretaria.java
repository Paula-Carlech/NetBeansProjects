package Atividade01;
public class Secretaria extends Empregado{
    
    private String funcao;
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public Secretaria(String n, int m, String f){
        this.funcao = funcao;
    }
    
    public void imprimirdocumentos(){
        System.out.println("Imprimindo documentos...");
    }
}
