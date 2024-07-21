/*
Java: знакомство и как пользоваться базовым API (семинары)
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
https://gb.ru/lessons/414474


00:10:55

Что будет на уроке сегодня

повторить теорию о LinkedList, Queue, Dequeue, PriorityQueue, Stack;
получить практические навыки в использовании связных списков и Stack;
научить составлять программу с использованием коллекций на примере связных
списков.


00:11:00
Квиз


00:19:55

Задание №0
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
Сравните с предыдущим.

*/
package JavaSeminar.Seminar04;
/*
 * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
 * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
 *    Сравните с предыдущим.
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class S01CompareList {
    public static void main(String[] args) {
        int size = 200_000;

        System.out.println("Добавление в конец списка");
        long start = System.currentTimeMillis();
        getArrayListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getLinkedListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        System.out.println("Добавление в начало списка");
        start = System.currentTimeMillis();
        getArrayListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getLinkedListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println();

        System.out.println("Добавление в середину списка");
        start = System.currentTimeMillis();
        getArrayListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getLinkedListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static ArrayList<Integer> getArrayListAddLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.addLast(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);
        }
        return linkedList;
    }

    public static ArrayList<Integer> getArrayListAddMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size() / 2, i);
        }
        return arrayList;
    }

    public static LinkedList<Integer> getLinkedListAddMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }
        return linkedList;
    }
}
/*
Добавление в конец списка
7 (ArrayList)
6 (LinkedList)

Добавление в начало списка
2918 (ArrayList)
35 (LinkedList)

Добавление в середину списка
1348 (ArrayList)
25700 (LinkedList) // должен был вывести быстрее, чем "ArrayList"
 */
