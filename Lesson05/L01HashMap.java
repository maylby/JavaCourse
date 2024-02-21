/*
Java: знакомство и как пользоваться базовым API (лекции)
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/404316


План занятия:
    1. Обзор функционала Map
    2. Зачем нужен HashMap
    3. HashMap и работа с ним
    4. Обзор функционала TreeMap
    5. Обзор функционала LinkedHashMap
    6. Примеры


Иерархия коллекций
_________________________________________________________________________________
                                                                                 |
                                   <<Interface>>                                 |
                                    Collection                                   |
                                    /    |    \                                  |
                    _______________/     |     \___________                      |
-------------------/---------------------|-----------------\---------------------|
                  /            |         |           |      \                    |
        <<Interface>>          |    <<Interface>>    |    <<Interface>>          |
            Set                |        List         |        Queue              |
         (расширяет)           |     (расширяет)     |      (расширяет)          |
          /     \              |       /    \ \______|__      /    \             |
---------/-------\-------------|------/------\-------|--\----/------\------------|
        /      |  \            |     /     |  \      |   \  /    |   \           |
   HashSet     | <<Interface>> | ArrayList | Vector  | LikedList | PriorityQueue |
 (реализует)   |  SortedSet    |  (реал.)  | (реал.) |  (реал.)  |  (реализует)  |
      |        | (расширяет)   |           |         |           |               |
      |        |      |        |           |         |           |               |
 LinkedHashSet | <<Interface>> |           |         |           |               |
  (расширяет)  |  NavigableSet |           |         |           |               |
               |  (расширяет)  |           |         |           |               |
               |      |        |___________|_________|___________|_______________|
               |    TreeSet    |                                                 |
               |  (реализует)  |                     MAP                         |
_______________|_______________|_________________________________________________|


Иерархия Map
____________________________________________
                                            |
                     Map                    |
                    / | \                   |
          _________/  |  \________          |
---------/------------|-----------\---------|
        /       |     |        |   \        |
    HashMap     |  SortedMap   | HashTable  |
       |        |     |        |            |
 LinkedHashhMap | NavigableMap |            |
                |     |        |            |
                |   TreeMap    |            |
________________|______________|____________|


HashMap

Map – это множество коллекций, работающих с данными
по принципу <Ключ / Значение>.

Ключевые особенности:
    ● допускаются только уникальные ключи, 
      значения могут повторяться;
    ● помните про null значения*;
    ● ускоренная обработка данных;
    ● порядок добавления не запоминается.

В HashMap элементы располагаются как угодно 
и могут менять свое положение.

 */
package JavaCourse.Lesson05;

import java.util.HashMap;
import java.util.Map;

public class L01HashMap {
        public static void main(String[] args) {
        /*
         * Код их дополнтельных материалов к лекции 5
         * (файл Ex001_HashMap)
         */
        Map<Integer, String> db = new HashMap<>();
        Map<Integer, String> db1 = new HashMap<Integer, String>(); /* более правильная запись, если
                                                                    * после знака равенства,
                                                                    * в скобках "<>" указаны 
                                                                    * тип ключа <Integer> и
                                                                    * тип значения <String> */ 
        db.putIfAbsent(1, "один"); // метод проверка ключа, 
                                             // если такой ключ есть, то ничего не добавляем
                                             // позволяет избежать перезаписи данных
        db.put(2, "два"); // "put" - метод добавления 
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); 
        System.out.println(db1); // {1=один, 2=два}
        /*
         * "containsValue" - метод проверки значения
         */
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false // значение - всегда строка
        /*
         * "containsKey" - метод проверки ключа
         */
        System.out.println(db.containsKey("один")); // false // ключ - это всегда число
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); // получение коллекции всех ключей
        System.out.println(db.values()); // получение коллекции всех значений
        System.out.println();

        /*
         * Код из презентации (стр. 11)
         * пример работы метода добавления "put"
         */
        // Map<Integer, String> db = new HashMap<>(); // дубль строки (см. выше)
        db.put(1, "один"); System.out.println(db);
        db.put(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);

    }   
}


/*
00:11:00

Фукционал HashMap

put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.

 */