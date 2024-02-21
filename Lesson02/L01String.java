/*
Java: знакомство и как пользоваться базовым API (лекции)
Урок 2. Почему вы не можете не использовать API
https://gb.ru/lessons/404313


Что такое API

API (Application programming interface) — 
это контракт, который предоставляет программа. 
«Ко мне можно обращаться так и так, я обязуюсь 
делать то и это».

habr (ссылка)


Что такое API для нас

Это возможности, который предоставляют 
разработчики языка для удобного 
взаимодействия с его функционалом


Что такое API для нас на примерах

1. Строки
2. Работа с файловой системой
3. Логирование
4. Импорт
5. Xml



00:03:50
1. Строки

Простой пример
Создать строку из 1 млн плюсиков. Как?

/*
00:05:00
Весь код
 */
package JavaCourse.Lesson02;

public class L01String {

    public static void main(String[] args) {

        /*
         * Вариант 1 
         * (стандартный функционал)
         */
        var s = System.currentTimeMillis(); 
        String str = ""; // (?) "str" не подсвечен
        for (int i = 0; i < 700_000; i++) {
            str += "+";  // время выполнения - 41000 ms (41 секунда)
        } 
        System.out.println(System.currentTimeMillis() - s);
        
        /*
         * Вариант 2 
         * (функционал "StringBuilder")
         */        
        var s1 = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 700_000; i++) {
            //str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s1);
        // System.out.println(str); 
        // System.out.println(sb);
    // }



/*
00:05:15
Функционал строк (?)

concat(): объединение строк
valueOf(): преобразует Object в строковое представление (завязан на toString())
join(): объединяет набор строк в одну с учетом разделителя
charAt(): получение символа по индексу
indexOf(): первый индекс вхождения подстроки
lastIndexOf(): последний индекс вхождения подстроки
startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
replace(): замена одной подстроки на другую
trim(): удаляет начальные и конечные пробелы
substring(): возвращает подстроку, см.аргументы
toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
сompareTo(): сравнивает две строки
equals(): сравнивает строки с учетом регистра
equalsIgnoreCase(): сравнивает строки без учета регистра
regionMatches(): сравнивает подстроки в строках



00:06:00
 */
    /*
     * Код из дополнительных материалов к лекции 02
     * (см. ПК: 02_(Л-02)_доп, папка "Lesson_02", файл "Ex001_stringsDemo.java")
     * 
     * Включил код в предыдущий запись
     * Строку "public static" и открывающую скобку закрыл за ненадобностью
     */
    // public static void main(String[] args)
    // {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join(" ", "C", "е", "р", "г", "е", "й"));
        // C е р г е й
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
        // C,е,р,г,е,й
    }
}

/*
 * 00:07:30
 * 
 * Много изменений –> String (для разбора уже существующего материала)
 * Много преобразований –> StringBuilder (для компоновки нового материала)
 */