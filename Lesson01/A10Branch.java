/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


01:21:00

Управляющие конструкции:
условный оператор (ветвление)
 */

package JavaCourse.Lesson01;

public class A10Branch {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) { 
            c = a;
        } else {
            c = b; // аналог записи условия в C#
        }
        System.out.println(c);

        /*
         * Сокращённая форма записи
         */
        int a1 = 1;
        int b1 = 2;
        int c1 = 0;
        if (a1 > b1) c1 = a1; // Если "a" больше "b", то "с" присвоить "а"
        if (b1 > a1) c1 = b1; // Если "b" больше "a", то "с" присвоить "b"

        System.out.println(c1);

        /*
         * Тернарный оператор
         */
        int a2 = 1;
        int b2 = 2;
        int min = a2 < b2 ? a2 : b2; // Если условие а < b выполняется, то,
                                     // после вопросительного знака
                                     // выполняется условие до "a" (min = a).
                                     // Если нет, то до "b" (min = b)
        System.out.println(min);
    }  
}
