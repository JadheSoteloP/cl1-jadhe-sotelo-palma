package pe.edu.i202220936.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202220936.entity.City;
import pe.edu.i202220936.entity.Country;

import java.util.List;
import java.util.stream.Collectors;

public class JPAFind {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        //Buscar
        Country country = em.find(Country.class, "PER");

        if (country != null) {

            List<City> filteredCities = country.getCities().stream()
                    .filter(city -> city.getPopulation() > 700000)
                    .collect(Collectors.toList());

            System.out.println("Ciudades peruanas con población mayor a 700,000:");
            filteredCities.forEach(city -> System.out.println(city.getName()));
        } else {
            System.out.println("El país con el código PER no existe.");
        }

        em.close();
        emf.close();
    }
}


