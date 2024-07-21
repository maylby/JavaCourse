/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


01:18:00
Функции и методы

Функции и методы — это технически одно и то же. 
Функции могут не принадлежать классам, а методы принадлежат.
В java все функции являются методами.

● Описание
● Вызов
● Возвращаемое значение
● Рекурсия
 */

package JavaCourse.Lesson01;

public class A09Methods {
    static void sayHi() { 	// после (?) "static" 
							// должен стоять "public"... 
							// (так сказано в лекции)
							// обычно впереди стоит "public"
							// (модификатор доступа)
			      			// ..., но его часто не пишут,
							// т.к. всё работает и без него
 		System.out.println("hi!");
 	}
 	static int sum(int a, int b) {
 		return a+b;
 	} 
 	static double factor(int n) {
 		if(n==1)return 1;
 		return n * factor(n-1);
 	}
 	public static void main(String[] args) {
 		sayHi(); // hi!
 		System.out.println(sum(1, 3)); // 4
 		System.out.println(factor(5)); // 120.0
 	}}
