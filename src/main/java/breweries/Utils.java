package breweries;

import java.util.*;
import java.util.stream.Collectors;

public class Utils {

    public static void getNumbersOfWebsite(List<BreweriesPOJO> list) {
        Set<BreweriesPOJO> collect = list.stream()
                .filter(s -> !s.getWebsites().isEmpty())
                .collect(Collectors.toSet());
        System.out.println("Number of websites: " + collect.size());
    }

    public static void howManyDuplicates(List<BreweriesPOJO> list) {
        List<String> stringList = list.stream()
                .map(BreweriesPOJO::getName)
                .collect(Collectors.toList());
        Set<String> stringSet = list.stream()
                .map(BreweriesPOJO::getName)
                .collect(Collectors.toSet());
        int subtract = Math.subtractExact(stringList.size(), stringSet.size());
        System.out.println(" There are: " + subtract + " duplicated records");
    }

    public static void getTopCitiesForBreweries(List<BreweriesPOJO> list) {
        Map<String, Integer> map = new TreeMap<>();

        for (BreweriesPOJO breweriesPOJO : list) {
            String cityName = breweriesPOJO.getCity();
            if (map.containsKey(cityName)) {
                map.put(cityName, map.get(cityName) + 1);
            } else {
                map.put(breweriesPOJO.getCity(), 1);
            }
        }
        sortMapByValue(map);
    }

    private static void sortMapByValue(Map<String, Integer> map) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        System.out.println("10 Top Cities for breweries : " + sortedMap);
    }

    public static void breweriesLocatedInDelawareWithTacos(List<BreweriesPOJO> list) {
        int count = 0;
        for (BreweriesPOJO breweriesPOJO : list) {
            if ((breweriesPOJO.getMenus().contains("Tacos") || breweriesPOJO.getMenus().contains("tacos"))
                    && breweriesPOJO.getCity().equals("Delaware")) count++;
        }
        System.out.println("Number of breweries in Delaware with Tacos: " + count);
    }

}

