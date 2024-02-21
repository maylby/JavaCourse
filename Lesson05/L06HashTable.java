/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/404316


HashTable

«Устаревший брат» коллекции HashMap,
который не знает про null

 */
package JavaCourse.Lesson05;

import java.util.Hashtable;
import java.util.Map;

public class L06HashTable {
    public static void main(String[] args) {
        /*
         * Интерфейс - "Map<>"
         * экземпляр - "Hashtable<>"
         * методы добавления, удаление, получения стандартные (см. функционал)
         * отсутствует "null" в качестве ключа
         */
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException
    }
}
