package breweries;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadFile {

    public static List getBreweriesPOJOS(String path) throws FileNotFoundException {
        List beans = new CsvToBeanBuilder(new FileReader(path))
                .withType(BreweriesPOJO.class)
                .withEscapeChar('\0') // ignore espace characters
                .withIgnoreLeadingWhiteSpace(false)
                .build()
                .parse();
        return beans;
    }
}

