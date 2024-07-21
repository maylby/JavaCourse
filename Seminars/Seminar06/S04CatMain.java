/*
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/414476


01:57:00

Задание №4
 */

package JavaSeminar.Seminar06;
/*
1. Создайте множество, в котором будут храниться 
экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.

2. Создайте 2 или более котов с одинаковыми параметрами в полях. 
Поместите их во множество. Убедитесь, что все они сохранились во множество.

3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
То есть, метод должен возвращать true, только если 
значения во всех полях сравниваемых объектов равны.
(код размещён в файле "S04Cat.java")

4. Создайте метод public int hashCode() который будет возвращать hash, 
вычисленный на основе полей класса Cat. 
(Можно использовать Objects.hash(...))

5. Выведите снова содержимое множества из пункта 2, 
убедитесь, что дубликаты удалились

 */
import java.util.HashSet;
import java.util.Set;

public class S04CatMain {
    public static void main(String[] args) {
        S04Cat cat1 = new S04Cat("Барсик", 2, "серый");
        S04Cat cat2 = new S04Cat("Васька", 1, "чёрный");
        S04Cat cat3 = new S04Cat("Мурка", 3, "белый");
        S04Cat cat4 = new S04Cat("Мурка", 3, "белый");
        S04Cat cat5 = new S04Cat("Мурка", 3, "белый");
       

        // System.out.println(cat1);
        // System.out.println();
        // System.out.println(cat2);
        // System.out.println();
        // System.out.println(cat3);
        // System.out.println();

        /*
         * Множество "Set" класса "S04Cat", 
         * хранящее добавленные в него экземпляры класса
         */
        Set<S04Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        set.add(cat5);

        for (S04Cat cat : set) { // перебор циклом (foreach) 
                                 // экземпляров (cat) множества (set) 
            System.out.println(cat);
            System.out.println();
        }
    }
}

/*
 * 02:10:00
 * Обсуждение задания промежуточной аттестации
 */