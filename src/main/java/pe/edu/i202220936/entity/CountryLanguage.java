package pe.edu.i202220936.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
@IdClass(CountryLanguageId.class)
public class CountryLanguage {

    @Id
    private String countryCode;
    @Id
    private String language;
    private String isOfficial;
    private Integer percentage;

    @ManyToOne
    @JoinColumn(name = "countryCode", referencedColumnName = "code")
    private Country country;

    public CountryLanguage(String countryCode, String isOfficial, String language, Integer percentage) {
        this.countryCode = countryCode;
        this.isOfficial = isOfficial;
        this.language = language;
        this.percentage = percentage;
    }

    public CountryLanguage() {
    }

    @Override
    public String toString() {
        return "countrylanguage{" +
                "countryCode='" + countryCode + '\'' +
                ", language='" + language + '\'' +
                ", isOfficial='" + isOfficial + '\'' +
                ", percentage=" + percentage +
                '}';
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
