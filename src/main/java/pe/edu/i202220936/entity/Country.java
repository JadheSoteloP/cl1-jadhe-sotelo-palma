package pe.edu.i202220936.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "country")
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private Integer surfaceArea;
    private Integer indepYear;
    private Integer population;
    private Integer lifeExpectancy;
    private Integer gnp;
    private Integer gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<CountryLanguage> languages;

    public Country(Integer capital, String code2, String code, String continent, Integer gnp, Integer gnpOld, String governmentForm, String headOfState, Integer indepYear, Integer lifeExpectancy, String localName, String name, Integer population, String region, Integer surfaceArea) {
        this.capital = capital;
        this.code2 = code2;
        this.code = code;
        this.continent = continent;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.indepYear = indepYear;
        this.lifeExpectancy = lifeExpectancy;
        this.localName = localName;
        this.name = name;
        this.population = population;
        this.region = region;
        this.surfaceArea = surfaceArea;
    }

    public Country() {
    }

    @Override
    public String toString() {
        return "country{" +
                "capital=" + capital +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpOld=" + gnpOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", code2='" + code2 + '\'' +
                '}';
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getGnp() {
        return gnp;
    }

    public void setGnp(Integer gnp) {
        this.gnp = gnp;
    }

    public Integer getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Integer gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Integer lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Integer surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(List<CountryLanguage> languages) {
        this.languages = languages;
    }
}
