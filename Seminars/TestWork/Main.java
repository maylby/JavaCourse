/*
Задание для промежуточной аттестации
https://gb.ru/lessons/414476/homework


Подумать над структурой класса Ноутбук для магазина техники - 
выделить поля и методы. Реализовать в java. Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя 
критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. 

Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества 
и вывести проходящие по условиям.

 */

package JavaSeminar.TestWork;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Laptops> laptops = ProductData.createLaptopsSet();

        runFilter(laptops);
        
    }

    static void runFilter(Set<Laptops> laptops) {
        Set<Laptops> filterLaptops = new HashSet<>(laptops);
        printNotebooks(filterLaptops);
        int choice = chooseMainOptions();
        while (choice != 9) {
            switch (choice) {
                case 1:
                    System.out.println("filter - RAM");
                    filterRAM(filterLaptops);
                    break;
                case 2:
                    System.out.println("filter - HDD");
                    filterHDD(filterLaptops);
                    break;
                case 3:
                    System.out.println("filter - CPU");
                    filterCPU(filterLaptops);
                    break;
                case 4:
                    System.out.println("filter - display");
                    filterScreenSize(filterLaptops);
                    break;
                case 5:
                    System.out.println("filter - price");
                    filterPrice(filterLaptops);
                    break;
                case 6:
                    filterLaptops.addAll(laptops);
                    break;
                default:
                    System.out.println("Некорректный аргумент");

            }
            printNotebooks(filterLaptops);
            choice = chooseMainOptions();
        }
    }

    private static void printNotebooks(Set<Laptops> filterLaptops) {
        int i = 0;
        for (Laptops fn : filterLaptops) {
            System.out.println(i++ + ". " + fn);
        }
    }

    static int chooseMainOptions() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Критерии отбора: \n" +
                "1. RAM (Оперативная память)\n" +
                "2. HDD (жесткий диск)\n" +
                "3. CPU (процессор)\n" +
                "4. Screen size (Размер экрана)\n" +
                "5. Price (Цена)\n" +
                "6. Сброс\n" +
                "7. Выход\n" +
                "Введите номера критерия: "
        );
        return sc.nextInt();  
    }


    static void filterRAM(Set<Laptops> laptops) {
        Set<String> options = new LinkedHashSet<>();
        for (Laptops n : laptops) {
            options.add(n.getRAM());
        }
        filterOptions(options);
        laptops.removeIf(n -> !options.contains(n.getRAM()));
    }

    static void filterHDD(Set<Laptops> laptops) {
        Set<String> options = new LinkedHashSet<>();
        for (Laptops n : laptops) {
            options.add(n.getHDD());
        }
        filterOptions(options);
        laptops.removeIf(n -> !options.contains(n.getHDD()));
    }

    static void filterCPU(Set<Laptops> laptops) {
        Set<String> options = new TreeSet<>();
        for (Laptops n : laptops) {
            options.add(n.getCPU());
        }
        filterOptions(options);
        laptops.removeIf(n -> !options.contains(n.getCPU()));
    }

    static void filterScreenSize(Set<Laptops> laptops) {
        Set<String> options = new LinkedHashSet<>();
        for (Laptops n : laptops) {
            options.add(n.getScreenSize());
        }
        filterOptions(options);
        laptops.removeIf(n -> !options.contains(n.getScreenSize()));
    }

    static void filterPrice(Set<Laptops> laptops) {
        Set<Integer> prices = new TreeSet<>();
        for (Laptops n : laptops) {
            prices.add(n.getPrice());
        }
        System.out.println(
                "Выбрать значения в пределах от " 
                + Collections.min(prices) + 
                " до " + Collections.max(prices));

        Scanner sc = new Scanner(System.in);
        Set<Integer> priceRange = new TreeSet<>();
        while (priceRange.size() < 2) {
            priceRange.add(sc.nextInt());
            System.out.println("Значения диапазона цен: " + priceRange);
        }
        laptops.removeIf(n ->
                (n.getPrice() < Collections.min(priceRange)) ||
                (n.getPrice() > Collections.max(priceRange)));
    }

    private static void filterOptions(Set<String> options) {
        List<String> optionsList = new ArrayList<>(options);
        System.out.println("Выбрать опции по номеру:");
        System.out.println(optionsList.size() + " Выход в главное меню");
        for (int i = 0; i < optionsList.size(); i++) {
            System.out.println(i + ". " + optionsList.get(i));
        }

        Set<Integer> optionsNumbs = getOptionsSet(optionsList.size());
        options.clear();
        for (int n : optionsNumbs) {
            options.add(optionsList.get(n));
        }
    }

    private static Set<Integer> getOptionsSet(int size) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbs = new TreeSet<>();
        int choice = sc.nextInt();
        while (choice != size) {
            numbs.add(choice);
            System.out.println("Выбраны опции: " + numbs);
            choice = sc.nextInt();
        }
        return numbs;

    }
}

