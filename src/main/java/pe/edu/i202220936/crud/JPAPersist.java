package pe.edu.i202220936.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202220936.entity.City;
import pe.edu.i202220936.entity.Country;
import pe.edu.i202220936.entity.CountryLanguage;

public class JPAPersist {

    public static void main(String[] args) {
        // Configurar EntityManagerFactory y EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        // country
        Country country = new Country(1,"JS","JS","Asia",
                50000,48000,"Monarchy","Harumy Palma", 2024,
                75,"JadheSotelo","JadheSotelo",1000000, "Central Violet", 12345);

        // cities
        City city1 = new City();
        city1.setName("Dreams");
        city1.setDistrict("Northern District");
        city1.setPopulation(300000);
        city1.setCountry(country);

        City city2 = new City();
        city2.setName("SkyBlue");
        city2.setDistrict("Western District");
        city2.setPopulation(400000);
        city2.setCountry(country);

        City city3 = new City();
        city3.setName("Yellow");
        city3.setDistrict("Eastern District");
        city3.setPopulation(300000);
        city3.setCountry(country);

        // language
        CountryLanguage language1 = new CountryLanguage();
        language1.setCountryCode("JS");
        language1.setLanguage("Imaginian");
        language1.setIsOfficial("T");
        language1.setPercentage(60);
        language1.setCountry(country);

        CountryLanguage language2 = new CountryLanguage();
        language2.setCountryCode("JS");
        language2.setLanguage("Dreamian");
        language2.setIsOfficial("F");
        language2.setPercentage(40);
        language2.setCountry(country);

        //
        em.getTransaction().begin();
        em.persist(country);

        em.persist(city1);
        em.persist(city2);
        em.persist(city3);

        em.persist(language1);
        em.persist(language2);

        em.getTransaction().commit();

        // Cerrar EntityManager y EntityManagerFactory
        em.close();
        emf.close();
    }
}
