package dunn.ted.countries_of_the_world.model;

import java.util.List;

/**
 * Created by Ted on 2/22/2017.
 */
public class Country {
    private String name;
    private String population;
    private String capital;
    private String[] languages;

    public Country(String name, String population, String capital, String[] languages) {
        this.name = name;
        this.population = population;
        this.capital = capital;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}


