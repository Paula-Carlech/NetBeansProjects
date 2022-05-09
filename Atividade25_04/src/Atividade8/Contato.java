package Atividade8;

public class Contato {
    String nome;
    String tel;
    String cep;
    String estado;
    String cidade;
    String bairro;
    String rua;
    int num;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getTel(){
        return this.tel;
    }
    
    public void setTel(String tel){
        this.tel = tel;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getRua(){
        return this.rua;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public void dispayAgenda(){
        System.out.println("Nome: " + nome);
        System.out.println("Tel: " + tel);
        System.out.println("CEP: " + cep);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Bairro: " + bairro);
        System.out.println("Rua: " + rua);
        System.out.println("N°: " + num);
    }   
}
