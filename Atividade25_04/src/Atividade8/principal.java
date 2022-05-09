package Atividade8;

public class principal {

    public static void main(String args[]) {
        
        Contato cont1 = new Contato();
        Contato cont2 = new Contato();
        Contato cont3 = new Contato();
        
        Agenda imput = new Agenda();
        
        cont1.setNome("Paula Carlech");
        cont1.setTel("33987619609");
        cont1.setCep("39804013");
        cont1.setEstado("Minas Gerais");
        cont1.setCidade("Teófilo Otoni");
        cont1.setBairro("Jardim das Acácias");
        cont1.setRua("Turmalina");
        cont1.setNum(92);
        
        cont2.setNome("Anderson Vieira");
        cont2.setTel("33988192508");
        cont1.setCep("39803188");
        cont2.setEstado("Minas Gerais");
        cont2.setCidade("Teófilo Otoni");
        cont2.setBairro("Filadélfia");
        cont2.setRua("Ione Lewick");
        cont2.setNum(1419);
        
        cont3.setNome("Fulano Ciclano");
        cont3.setTel("33988462387");
        cont3.setCep("39804123");
        cont3.setEstado("Minas Gerais");
        cont3.setCidade("Teófilo Otoni");
        cont3.setBairro("Marajoara");
        cont3.setRua("Oto Laure");
        cont3.setNum(100);
        
        imput.mostrar();
        System.out.println("\n");
        
        cont1.dispayAgenda();
        System.out.println("\n");
        
        cont2.dispayAgenda();
        System.out.println("\n");
        
        cont3.dispayAgenda();
        System.out.println("\n");
        
    }
}
