/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/404316


00:12:00 
Хранение данных

Работа с парами
 */
package JavaCourse.Lesson05;

import java.util.HashMap;
import java.util.Map;

public class L02HashMapEntry {
        public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db); 

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
    
}
