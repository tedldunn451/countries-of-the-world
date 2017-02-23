package dunn.ted.countries_of_the_world.data;

import dunn.ted.countries_of_the_world.model.Country;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ted on 2/22/2017.
 */
@Component
public class CountryRepository {
   private static final List<Country> ALL_COUNTRIES = Arrays.asList(
       new Country("Thailand", "67,959,000", "Bangkok", new String[]{"Thai"}),
       new Country("Luxembourg", "576,249", "Luxembourg City", new String[]{"French", "German", "Luxembourgish"}),
       new Country("Colombia", "49,034,411", "Bogota", new String[]{"Spanish"}),
       new Country("Ghana", "27,043,093", "Accra", new String[]{"English"}),
       new Country("Jamaica", "2,950,210", "Kingston", new String[]{"English"})
   );

    public List<Country> getAllCountries() {
        return ALL_COUNTRIES;
    }

    public Country findByName(String name) {
        for(Country country : ALL_COUNTRIES) {
            if(country.getName().equals(name)) {
                return country;
            }
        }
        return null;
    }
}
