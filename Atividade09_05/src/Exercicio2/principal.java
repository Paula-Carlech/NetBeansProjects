package Exercicio2;
public class principal {
    public static void main(String args[]) {
        
        SerieLimitada s1 = new SerieLimitada("Chevrolet Cruze", 2019);
        SerieLimitada s2 = new SerieLimitada("Citroën C3 Xbox One Edition", 2013);
        SerieLimitada s3 = new SerieLimitada("Fiat Strada Mangalarga Marchador", 2013);
                     
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        
        SerieLimitada s4 = new SerieLimitada("Volkswagen Fox Sunrise", 2009);
        System.out.println(s4.toString());
        
    }
}