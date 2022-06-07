package Atividade02;
public class Ingresso {
    
    float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Ingresso(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Valor do ingresso: " + "R$ " + valor;
    }
}