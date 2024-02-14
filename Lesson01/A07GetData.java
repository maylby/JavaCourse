/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


01:06:00
Получение данных из терминала
 */

package JavaCourse.Lesson01;

import java.util.Scanner; // импорт сканера добавился автоматически

public class A07GetData {
     	public static void main(String[] args) {
        /*
         * 01:06:00
         * Строки
         */
 		Scanner iScanner = new Scanner(System.in, "ibm866");
                                                        // "ibm866" - кириллица
                                                        // Объекту типа "iScanner"
						        // передать данные модуля "Scanner"
							// с  помощью "System.in" 
 		System.out.printf("name: "); // Замена "println" на "printf"
                                                    // (на семинаре - "println")
 		String name = iScanner.nextLine(); // "nextLine" - ожидаемая строка
 		System.out.printf("Привет, %s!", name); 
 		// iScanner.close(); // "close" - закрытие сканера (iScanner)
				          // функцию закрытия в Python выполняли отступы
        /*
         * 01:08:00
         * Некоторые примитивы
         */
        // Scanner iScanner = new Scanner(System.in);
        System.out.printf("\nint a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        /*
         * 01:08:31
         * Проверка на соответствие получаемого типа 
         * (неваллидные данные)
         */
        // Scanner iScanner = new Scanner(System.in);
        System.out.printf("\nint a: ");
        boolean flag = iScanner.hasNextInt();  // Передача данных произойдёт, если
                						        // данные "hasNextInt" валлидны
        System.out.println(flag); 
        int i = iScanner.nextInt();
        System.out.println(i); 
        iScanner.close();

        /*
         * Выяснить, к чему это относится?
         */
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);

/*
01:13:55
Виды спецификаторов

%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений
*/

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
        
 	}
    
}
