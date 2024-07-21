/*
Java: знакомство и как пользоваться базовым API (семинары)
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/414475

Что будет на уроке сегодня

повторить теорию о HashMap, TreeMap, LinkedHashMap;
получить практические навыки в использовании HashMap и TreeMap;
научить составлять программу с использованием коллекций на примере HashMap.


00:19:30

Задание №0
 */
package JavaSeminar.Seminar05.Task01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Создать структуру для хранения 
Номеров паспортов и Фамилий 
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class PassportName {
    public static void main(String[] args) {
        
        // Map<Integer, String> hashMap = new HashMap<>(); // не сохраняет порядок
        // Map<Integer, String> hashMap = new LinkedHashMap(); // сохраняет порядок
        Map<Integer, String> hashMap = new TreeMap<>(); // сортирует по ключам
        
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");
        
        String targetName = "Иванов";
        System.out.println("Данные по сотрудникам с фамилией " + targetName);
        System.out.println();

        for (int passportNum : hashMap.keySet()) {
            String name = hashMap.get(passportNum);
            if(name.equals(targetName)) {
                System.out.println("Номер паспорта: " + passportNum 
                                    + "\t" + "Фамилия: " + name);
            }
        }}}
        /*
        Данные по сотрудникам с фамилией Иванов

        Номер паспорта: 123456  Фамилия: Иванов
        Номер паспорта: 234432  Фамилия: Иванов
        Номер паспорта: 345678  Фамилия: Иванов

        */