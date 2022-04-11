package breweries;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static final String PATH = "src/main/resources/breweries_usa.csv";

    public static void main(String[] args) throws FileNotFoundException {
        List breweriesPOJOS = ReadFile.getBreweriesPOJOS(PATH);


        // How many breweries have the link to the website:
        Utils.getNumbersOfWebsite(breweriesPOJOS);

        // How many breweries are listed than once:
        Utils.howManyDuplicates(breweriesPOJOS);

        // 10 top cities for breweries:
        Utils.getTopCitiesForBreweries(breweriesPOJOS);

        //Breweries located in Dalaware and offer tacos:
        Utils.breweriesLocatedInDelawareWithTacos(breweriesPOJOS);
    }
}
