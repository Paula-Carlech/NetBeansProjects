package Atividade9;

public class Emprestimo {
    
    private Livro emp;
    private Pessoa leitor;
    
    public void relizarEmprestimo(Livro l) {
        if(emp.getDisponivel() == true){
            System.out.println("Emprestimo realizado.");
            emp.setDisponivel(false);
        }
    }

    public void realizarDevolucao(Livro l) {
        if(emp.getDisponivel() == false){
            System.out.println("Devolução realizada.");
            emp.setDisponivel(true);
        }
    }
}
