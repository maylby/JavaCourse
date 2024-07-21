/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


00:42:30
Операции Java

● Присваивание: =
● Арифметические: *, /, +, -, %, ++, --
● Операции сравнения: <, >, ==, !=, >=, <=
● Логические операции: ||, &&, ^, !
● Побитовые операции <<, >>, &, |, ^


Инкременты и дикременты
 */
package JavaCourse.Lesson01;

public class A04MathOperation {
    public static void main(String[] args) {
		int a = 123; // разряды в int можно разделять наижним подчёркиванием
		// a++
		System.out.println(++a); // префиксный инкримент, высокий приоритет,
					             // выше приоритета вывода в консоль
		System.out.println(a++); // постфиксный инкримент, низкий приоритет,
					             // ниже приоритета вывода в консоль
		System.out.println(a);

        /*
         * Побитовые и логические операции
         */
        int n = 5; 
        int m = 2;
        System.out.println(n ^ m);  // дезюнкция ("или") - либо "n", либо "m"
                                    // Если одно из значений True (истина), то
                                    // результат - True (истина)
        // 101 (4, 0, 1) -> 5
        // 010 (0, 2, 0) -> 2
        // 111 (4, 2, 1) -> 7

        boolean x = true;
        boolean y = true;
        System.out.println(x & y);  // проверяются оба утверждения, даже если 1-е ложно
        System.out.println(x && y); // "быстая операция" (&& - "оба утверждения - истина") 
                                    // если 1-е утверждение ложно, то 2-е не проверяется
        String s = "qwe1"; // 5, 0...4 (индекс от 0 до 4)
        boolean b1 = s.length() >= 5 && s.charAt(4) == '1';
        boolean b2 = s.length() >= 5 & s.charAt(4) == '1'; // Использование "&" даёт сбой,
                                                                 // когда запрошенный индекс выходит  
                                                                 // за пределы длины строки
        System.out.println(b1); 
        System.out.println(b2); 
	}
    
}