package pe.edu.i202220936.entity;

import java.io.Serializable;
import java.util.Objects;

public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;

    // Constructor sin argumentos
    public CountryLanguageId() {}

    // Constructor con argumentos
    public CountryLanguageId(String countryCode, String language) {
        this.countryCode = countryCode;
        this.language = language;
    }

    // Getters y Setters
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // equals() y hashCode() (Obligatorios para claves compuestas)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageId that = (CountryLanguageId) o;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, language);
    }
}


