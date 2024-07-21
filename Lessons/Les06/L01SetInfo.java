/*
Java: знакомство и как пользоваться базовым API (лекции)
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/404317

План урока:

- Обзор функционала
- Set
- HashSet
- TreeSet
- LinkedHashSet


На лекции: 

1. Иерархия Set и определения
2. Обзор функционала HashSet
3. Обзор функционала LinkedHashSet
4. Обзор функционала SortedSet
5. Дерево в программировании
6. Обзор функционала TreeSet
7. Введение в создание собственных типов
8. equals, hashCode, compareTo и их назначение


00:04:00

Иерархия Set-коллекций

             Set
            /   \
      HashSet   SortedSet
         |         |
LinkedHashSet   NavigableSet
                   |
                TreeSet

                
Set

● Коллекции, содержащие уникальные элементы.
● Быстрая работа с данными.
● «Основан» на Map’ах без пары (ключ без значений).
● Порядок добавления не хранится.


00:04:30

HashSet

    isEmpty() – проверка на пустоту.
    add(V) – добавление элемента в коллекцию.
    remove(V) – удаление элемента из коллекцию.
    contains(V) – проверка на включение элемента в коллекции.
    clear() – удаление всех элементов коллекции.
    size() – возвращает количество элементов коллекции.


HashSet 
(хранит порядок значений)

 */
package JavaCourse.Lesson06;

import java.util.*; // библиотека целиком
import java.util.HashSet;
import java.util.Set;

public class L01SetInfo {
    
}
/*
 * Код из презентации (стр.9)
 * или Доп.мат. (Part1)
 */
class Ex001_HashSet {
    public static void main(String[] args) {
    Set<Integer> set = new HashSet<>(); // в базовый тип "Set" положен экземпляр "HashSet",
                                        // "HashSet" имплементирует (реализует) интерфейс "Set"
                                        // (относится к созданию собственных типов)
    set.add(1); set.add(12); set.add(123);
    set.add(1234); set.add(1234); // "add" - добавление новых значений
    System.out.println(set.contains(12)); // true ("contains" - проверка наличия)
    set.add(null); // "null" - пустая ссыка (специфическая константа Java),
                     // не пременима для некоторых коллекций
    System.out.println(set.size()); // 5 - размер коллекции (size), количество элементов 
    System.out.println(set); // [null, 1, 1234, 123, 12] - содержимое коллекции
    set.remove(12); // "remove" - удаление
    /*
     * "println" в коде из презентации 
     * записан в одну строку с циклом (for), 
     * без фигурных скобок "{}" (см. ниже),
     * в дополнительных материалах к лекции 
     * форма записи кода стандартная, со скобками
     */
    for (var item : set) System.out.println(item); // null 1 1234 123
    set.clear(); // "clear" - удаление
    System.out.println(set); // [] - пустая коллекция
    }
}  


/*
00:06:40

HashSet как синоним множества

    addAll(Coll) – объединение множеств.
    retainAll(Coll) – пересечение множеств.
    removeAll(Coll) – разность множеств.

 */

/*
 * Код - Доп.мат. (Part1)
 * или презентация (стр. 11, 12)
 */
class Ex002_MathSet {
    public static void main(String[] args) {
        /*
         * переменной (a) типа (var) передать 
         * определённую коллекцию (HashSet), для которой
         * заданы значения в неком массиве (asList)
         */
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b); // "u" - добавление только уникальных значений
                                                      // (объединение множеств)
        var r = new HashSet<Integer>(a); r.retainAll(b); // "r" - выбор общих значений коллекций
                                                         // (пересечение множеств)
        var s = new HashSet<Integer>(a); s.removeAll(b); // удаление уникальных значений,
                                                         // в заданном промежутке (?)
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
        System.out.println(res);
    }
}


/*
00:08:00

first() - больше чем
last() - меньше чем
headSet(E)
tailSet(E)
subSet(E1, E2)


00:09:00

TreeSet 
(сохраняет порядок (?))

● В основе HashMap.
● Упорядочен по возрастанию.
● null’ов быть не может.


TreeSet (код)
 */

class Ex003_TreeSet {
    public static void main(String[] args) {
        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));

        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
        System.out.println(a.subSet(3, 5)); // [3, 4]
    }
}


/*
00:10:30

LinkedHashSet
(помнит порядок ввода элементов)

● В основе HashMap.
● Помнит порядок.

Использовать, когда нужен HashSet с запоминанием порядка элемента.


Операции

isEmpty() – проверка на пустоту.
add(V) – добавление элемента в коллекцию.
remove(V) – удаление элемента из коллекцию.
contains(V) – проверка на включение элемента в коллекции.
clear() – удаление всех элементов коллекции.
size() – возвращает количество элементов коллекции.

 */

/*
 * LinkedHashSet - аналог HashSet
 * отличается тем, что запоминает и хранит порядок
 */
class Ex004_LinkedHashSet {
    public static void main(String[] args) {
        var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        a.add(28);
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
    }
}
