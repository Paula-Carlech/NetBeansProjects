package Atividade01;
public class Secretaria extends Empregado{
    
    private String funcao;
    
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public Secretaria(int m, String n, String f){
        this.funcao = funcao;
    }
    
    public void imprimirdocumentos(){
        System.out.println("Imprimindo documentos...");
    }
}
