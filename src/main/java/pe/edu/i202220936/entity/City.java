package pe.edu.i202220936.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "countryCode", insertable = false, updatable = false)
    private String countryCode;
    private String district;
    private Integer population;

    @ManyToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code")
    private Country country;

    public City(String countryCode, String district, Integer id, String name, Integer population) {
        this.countryCode = countryCode;
        this.district = district;
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public City() {
    }

    @Override
    public String toString() {
        return "city{" +
                "countryCode='" + countryCode + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                '}';
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
