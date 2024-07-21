/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


 * 01:19:00
 * Код с экрана
 * 
 * Создание файла "lib.java"
 * (избавление от строк "public class" и "static public")
 */

package JavaCourse.Lesson01;

public class A09MethodsAdd {
    static public void main(String[] args) { // Создать файл "lib.java"
                                              // записать в нем две данные 
                                              // строки кода, создав подобие 
                                              // библиотеки, после чего 
        sayHi(); // обращаться к "sayHi()", как "lib.sayHi()"
                 // Т.е., "public class" и "static public" 
                 // можно больше не писать???
                 // Спешить это делать не стоит, 
                 // т.к. "static" - это плохо
    }

    static	void sayHi() {
        System.out.println("hi");
    }
}
