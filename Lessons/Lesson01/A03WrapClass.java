/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


00:38:00

Классы-обёртки 
(подключают расширенный функционал для работы с той или иной переменной)

Примитив   |	Обертка
-----------|-----------
int 	   |	Integer
short 	   |	Short
long 	   |	Long
byte 	   |	Byte
float 	   |	Float
double 	   |	Double
char 	   |	Character
boolean    |	Boolean
*/


package JavaCourse.Lesson01;

/**
 * A03WrapClass
 */
public class A03WrapClass {

    public static void main(String[] args) {
		int i = 12_123_444; // разряды в int можно разделять наижним подчёркиванием
        System.out.println(i);
		System.out.println(Integer.MIN_VALUE);  // -2147483648
        System.out.println(Integer.MAX_VALUE);  // 2147483647
                                                // "Integer." - класс-обёртка "int"
						                        // обратиться за справкой о типе данных
						                        // можно и через "int." с точкой
        String s = "qwer";
        s.charAt(1); // обращение к конкретному символу в строке
        s.length(); // определение длины строки
        System.out.println(s);

        // Charter.    ;   // форма обращения к элементу через обёртку,
                        // "Charter." вместо "сhart.", "Integer" вместо "int" и т.д.
        System.out.println(Integer.MIN_VALUE); // -2147483648
	}   
}