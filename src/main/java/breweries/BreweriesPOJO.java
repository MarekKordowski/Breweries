package breweries;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

import java.util.Objects;

@Getter
@NoArgsConstructor
@ToString
public class BreweriesPOJO {
    @CsvBindByName
    private String id;

    @CsvBindByName
    private String address;

    @CsvBindByName
    private String categories;

    @CsvBindByName
    private String city;

    @CsvBindByName
    private String country;

    @CsvBindByName
    private String hours;

    @CsvBindByName
    private String keys;

    @CsvBindByName
    private String latitude;

    @CsvBindByName
    private String longitude;

    @CsvBindByName
    private String menus;

    @CsvBindByName
    private String name;

    @CsvBindByName
    private String postalCode;

    @CsvBindByName
    private String province;

    @CsvBindByName
    private String twitter;

    @CsvBindByName
    private String websites;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BreweriesPOJO that = (BreweriesPOJO) o;
        return Objects.equals(id, that.id) && Objects.equals(address, that.address) && Objects.equals(categories, that.categories) && Objects.equals(city, that.city) && Objects.equals(country, that.country) && Objects.equals(hours, that.hours) && Objects.equals(keys, that.keys) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(menus, that.menus) && Objects.equals(name, that.name) && Objects.equals(postalCode, that.postalCode) && Objects.equals(province, that.province) && Objects.equals(twitter, that.twitter) && Objects.equals(websites, that.websites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, categories, city, country, hours, keys, latitude, longitude, menus, name, postalCode, province, twitter, websites);
    }
}
