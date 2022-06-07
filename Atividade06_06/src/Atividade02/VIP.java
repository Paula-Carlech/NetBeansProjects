package Atividade02;
public class VIP extends Ingresso{
    
    float valorAdd = 10.00f;

    public float getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(float valorAdd) {
        this.valorAdd = valorAdd;
    }
    
    public VIP(float valorAdd) {
        this.valorAdd = valorAdd;
    }
     
    valorAdd += valor;

    @Override
    public String toString() {
        return "Valor do ingresso VIP: R$ " + valorAdd;
    }  
}