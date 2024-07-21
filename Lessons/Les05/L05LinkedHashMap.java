/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/404316

00:32:00

LinkedHashMap

“Старший брат” коллекции HashMap, который всё помнит…
Помнит порядок добавления элементов ➜ более медлительный

Map<Integer,String> linkmap = new LinkedHashMap<>();
*/

package JavaCourse.Lesson05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class L05LinkedHashMap {
        public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    } 
}
