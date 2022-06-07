package Atividade02;
public class principal {
    public static void main(String args[]) {
        
        Ingresso ing01 = new Ingresso(20.00f);
        System.out.println(ing01.toString());
        
        VIP vip02 = new VIP(10.00f);
        System.out.println(vip02.toString());
    }
}