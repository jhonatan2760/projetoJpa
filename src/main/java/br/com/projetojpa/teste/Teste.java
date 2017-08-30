package br.com.projetojpa.teste;

import br.com.projetojpa.Animal;
import br.com.projetojpa.Area;
import br.com.projetojpa.Especie;
import br.com.projetojpa.Operador;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Jhonatan
 */
public class Teste {
    
    public static void main (String [] args){
        System.out.println("Criando tabelas");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("p_pu");
        EntityManager em = emf.createEntityManager();
        
        Animal a = new Animal();
        a.setNome("Macaco");
        Area ar = new Area();
        ar.setNome("Animais da África");
        a.setArea(ar);
        Especie e = new Especie();
        e.setNome("Primata");
        a.setEspecie(e);
        Operador op = new Operador();
        op.setNome("Jhonatan");
        op.setIdade(22);
        Operador opp = new Operador();
        opp.setNome("Marcela");
        opp.setIdade(32);
        List<Operador> opL = new ArrayList<>();
        opL.add(op);
        opL.add(opp);
        
        ar.setOperador(opL);
        
        try{
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
