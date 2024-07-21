/*
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/404317

00:17:30

Часть 2
Введение в создание собственных типов


Java является объектно-ориентированным языком.
Программа, написанная на Java, должна соответствовать
парадигме объектно-ориентированного программирования.

Следует понимать, что принципы ООП не просто определяют
структуру программы. Это некий фундаментальный подход,
с которым нам предстоит разобраться.

Спагетти-код – код, в котором данные связаны с методами
для их обработки и в итоге может получиться так, что отдельные
ветви алгоритма переплетаются, образуя запутанный клубок,
в котором невозможно разобраться

P.S. 
Этапы развития подходов к программированию:
    1. Стихийный - язык писался абы как
    2. Процедурный - выделение и исползование методов
    3. Объектно-ориентированный - методы (функции) обединены в классы


00:25:00

Решение проблемы получило название объектно-ориентированное
программирование или объектно-ориентированное проектирование или ООП.

При использовании данного подхода, упорядочивание кода базируется
на объединении данных, с одной стороны, и методов для обработки этих
данных, с другой стороны, в одно целое. Это «одно целое» в ООП называется
экземпляром класса.

Вся программа при этом имеет блочную структуру, что 
существенно упрощает анализ кода и внесение в него изменения.

ООП – искусственный прием, в большинстве случаев, не зависящий 
от языка программирования.


00:31:10

Если говорят, что разработка идет с использованием ООП – это 
говорит о том, что используются классы и экземпляры этих классов.

Каждый экземпляр класса определяется общим шаблоном, который
называется классом.

В рамках класса задается общая структура, на основе которой 
затем создаются экземпляры.

Данные, относящиеся к классу, называются полями класса, а код для их
обработки — методами класса.


00:34:30

Примеры:

Автомобиль – Lada 2107 UIN 123123123, S/N 789789789 (экземпляр класса)
Здание – Дом по адресу г.Москва ул. Ленина 21к1 (экземпляр класса)
Ученик – Сергей Камянецкий, 51 МиИ, СмолГУ (экземпляр класса)
Мобильный телефон – Siemens CX60 IMEI 1234520032022 (экземпляр класса)
Геометрическая фигура – додекаэдр (не является зкземпляром класса)
Работник – Смиронова Т.В. 14.02.1994, ID 728, Компания GeekBrains
Котики – Барсик (не является зкземпляром класса)


00:43:00

 */
package JavaCourse.Lesson06;

import java.util.*;

public class L02StartedOOP {
    public static void main(String[] args) {
        // #region

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        // System.out.println(w1);
        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        //#endregion

        System.out.println(w1==w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
        
    }
}


class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        /*
         * форма записи в одну строку
         * нет переменной (result), которой бы
         * присваивалась строка "format",
         * вместо переменной (result), функции "return"
         * передаётся, непосредственно, строка "format"
         */
        return String.format("id: %d fn: %s ln: %s s: %d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
/*
Вывод:

id: 1000 fn: Имя_1 ln: Фамилия_1 s: 100
id: 2000 fn: Имя_2 ln: Фамилия_2 s: 200
id: 3000 fn: Имя_3 ln: Фамилия_3 s: 300
id: 1000 fn: Имя_1 ln: Фамилия_1 s: 100

false
true
true

 */