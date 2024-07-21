package JavaSeminar.TestWork;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class ProductData {
    static Set<Laptops> createLaptopsSet() {

        Map<String, Integer> rams = new LinkedHashMap<>();
        rams.put("8GB", 4000);
        rams.put("16GB", 8000);
        rams.put("32GB", 16000);
        rams.put("64GB", 32000);
        rams.put("128GB", 64000);

        Map<String, Integer> hdds = new LinkedHashMap<>();
        hdds.put("500GB", 4000);
        hdds.put("1TB", 9000);
        hdds.put("2TB", 14000);

        Map<String, Integer> cpus = new TreeMap<>();
        cpus.put("Intel Core i3", 7000);
        cpus.put("AMD Ryzen 5", 8000);
        cpus.put("Intel Core i5", 9000);
        cpus.put("AMD Ryzen 7", 11000);
        cpus.put("Intel Core i7", 14000);
        cpus.put("Qualcomm 8cx", 11000);
        cpus.put("AMD Ryzen 9", 23000);
        cpus.put("Intel Core i9", 28000);
        cpus.put("AMD Ryzen 3", 6000);
        cpus.put("Intel Core m3", 5000);

        Map<String, Integer> screenSizes = new LinkedHashMap<>();
        screenSizes.put("13.0\"", 25000);
        screenSizes.put("14.0\"", 30000);
        screenSizes.put("15.0\"", 35000);
        screenSizes.put("17.0\"", 40000);
        screenSizes.put("12.0\"", 20000);

        Set<Laptops> laptops = new HashSet<>();
        for (int i = 0; i < 100; i++) {

            int price = 0;

            Random r = new Random();

            int randIndex = r.nextInt(cpus.size());
            String processor = (String) cpus.keySet().toArray()[randIndex];
            price += cpus.get(processor);

            randIndex = r.nextInt(rams.size());
            String ram = (String) rams.keySet().toArray()[randIndex];
            price += rams.get(ram);

            randIndex = r.nextInt(hdds.size());
            String hdd = (String) hdds.keySet().toArray()[randIndex];
            price += hdds.get(hdd);

            randIndex = r.nextInt(screenSizes.size());
            String screenSize = (String) screenSizes.keySet().toArray()[randIndex];
            price += screenSizes.get(screenSize);

            laptops.add(new Laptops(processor, ram, hdd, screenSize, price));
        }
        return laptops;
    }
}


