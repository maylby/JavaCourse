/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/404316

00:25:40

TreeMap

Упорядочивает по ключу коллекции пар (ключ, значение)

 */
package JavaCourse.Lesson05;

import java.util.TreeMap;

public class L04TreeMap {
        public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>();
        tMap.put(1,"один"); System.out.println(tMap); 
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
    }
}

/*
TreeMap

Методы, на которые нужно обратить внимание

put(K,V) - добавление
get(K) - получение
remove(K) - изменение
descendingMap() - показать в обратном порядке
descendingKeySet(V) получение только ключей по значению
tailMap() - показать значения, которые больше, чем ...
headMap() - значения меньше, чем ...
lastEntry() - ???
firstEntry() - ???

В основе данной коллекции лежат красно-чёрные деревья.
Позволяют быстрее искать, но могут возникнуть «заминки» при добавлении.

 */
