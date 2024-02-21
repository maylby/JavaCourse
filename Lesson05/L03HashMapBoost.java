/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/404316

Ускорение работы
 */
package JavaCourse.Lesson05;

import java.util.HashMap;
import java.util.Map;

public class L03HashMapBoost {
        public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>(30);
        Map<Integer,String> map3 = new HashMap<>(30, 0.8f);
    }
}

/*
00:22:00

Как работает "HashMap"

● Хэш-функции и хэш-таблицы
● Прямое связывание (хэширование с цепочками)
● Хэширование с открытой адресацией
● Теория графов:
    ● деревья построенные на списках
    ● бинарные деревья
    ● сбалансированные деревья
    ● *алгоритм балансировки дерева
    ● ** красно-черные деревья, деревья поиска
 */
