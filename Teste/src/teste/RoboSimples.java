package teste;
public class RoboSimples{
            
    private String nomeDoRobo ;
    private int posicaoX, posicaoY ;
    private char direcao;
        
    public RoboSimples(String nomeDoRobo, int posicaoX, int posicaoY, char direcao) {
        this.nomeDoRobo = nomeDoRobo;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.direcao = direcao;
    }
    
    public RoboSimples(String nomeDoRobo){
        this.nomeDoRobo = nomeDoRobo;
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.direcao = ’N’;
    }
        
    public RoboSimples(){
        this.nomeDoRobo = "";
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.direcao = ’N’;
    }    
        
    public void move(){
        if(direcao == ’N’)
            posicaoY = posicaoY +1;
        else if(direcao == ’S’)
            posicaoY = posicaoY -1;  
        else if(direcao == ’E’)
            posicaoX = posicaoX +1;
        else if(direcao == ’O’)
            posicaoX = posicaoX -1;
    }   
    
    public void imprimePosicao(){
        System.out.println("Posicao X: " + this.posicaoX + "\nPosicaoY: " + this.posicaoY );
    }
}