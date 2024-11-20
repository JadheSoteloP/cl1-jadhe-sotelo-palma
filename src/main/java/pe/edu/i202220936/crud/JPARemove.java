package pe.edu.i202220936.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202220936.entity.Country;

public class JPARemove {


    public static void main(String[] args) {
        //
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        //
        String countryCode = "JS";
        Country country = em.find(Country.class, countryCode);

        if (country != null) {

            em.getTransaction().begin();
            em.remove(country);
            em.getTransaction().commit();

            System.out.println("El país con código " + countryCode + " y sus dependencias han sido eliminados.");
        } else {
            System.out.println("El país con código " + countryCode + " no existe.");
        }

        em.close();
        emf.close();
    }
}
