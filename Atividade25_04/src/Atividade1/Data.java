package Atividade1;

public class Data {
    int mes;
    int dia;
    int ano;
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void displayData(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
