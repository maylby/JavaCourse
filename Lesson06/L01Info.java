/*
Java: знакомство и как пользоваться базовым API (лекции)
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/404317

Пдан урока:

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


HashSet (код)

 */
package JavaCourse.Lesson06;

import java.util.HashSet;
import java.util.Set;

public class L01Info {
    
}
/*
 * Код из презентации (стр.9)
 * или Доп.мат. (Part1)
 */
class Ex001_HashSet {
    public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1); set.add(12); set.add(123);
    set.add(1234); set.add(1234);
    System.out.println(set.contains(12)); // true
    set.add(null);
    System.out.println(set.size()); // 5
    System.out.println(set); // [null, 1, 1234, 123, 12]
    set.remove(12);
    /*
     * "println" в коде из презентации 
     * записан в одну строку с циклом (for), 
     * без фигурных скобок "{}" (см. ниже),
     * в дополнительных материалах к лекции 
     * форма записи кода стандартная, со скобками
     */
    for (var item : set) System.out.println(item); // null 1 1234 123
    set.clear();
    System.out.println(set); // []
    }
}  
