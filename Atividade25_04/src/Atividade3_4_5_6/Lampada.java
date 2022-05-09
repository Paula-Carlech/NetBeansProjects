package Atividade3_4_5_6;

public class Lampada {
    
    String marca;
    String cor;
    int voltagem;
    boolean ligada;
    int estado;
    
    Lampada(){
        marca = "NULL";
        cor = "NULL";
        voltagem = 2;
        ligada = false;
        estado = 50;
    }
    
    public void Display(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Voltagem: " + this.getVoltagem() + "w");
        System.out.println("Ligada? " + this.getLigada());
        System.out.println("Estado: " + this.getEstado() + "% de luminosidade");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getEstado() {
        if(estado == 0){
            System.out.println("Luz apagada!");
        }else if(estado > 0 && estado <= 50){
            System.out.println("Meia luz!");
        }else if(estado > 50){
            System.out.println("Luz acesa!");
        }
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }  
}