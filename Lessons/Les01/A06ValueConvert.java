/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


01:02:00
Преобразования

Неявное и явное
 */

package JavaCourse.Lesson01;

public class A06ValueConvert {
    public static void main(String[] args) {
        /*
         * Неявное преобразование (см. строки ниже)
         */
        int i = 123; double d = i;
        System.out.println(i);  // 123
        System.out.println(d);  // 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d);  // 3.1415
        System.out.println(i);  // 3
        d = 3.9415; i = (int)d;
        System.out.println(d);  // 3.9415
        System.out.println(i);  // 3 <- оставляет, только целую часть числа,
                                // независимо от величины числа после запятой,
                                // преобразование 3.1 из "double" в "int" даст 3 
                                // аналогичное преобразование 3.9 тоже даст 3, а
                                // не 4 (четыре), как следовало ожидать
        /*
         * Явное преобразование
         */
        byte b = Byte.parseByte("123"); // Явное преобразование
                                          // с помощью обёртки "Byte."
        System.out.println(b); // 123
        b = Byte.parseByte("1234");
        System.out.println(b); // NumberFormatException: Value out of range

        byte b1 = Byte.parseByte("1221"); // объём типа данных "Byte" 
                                            // составляет 250 символов
                                            // Проблема недостатка объёма, 
                                            // решается исключениями, но
                                            // лучше применять классы int и double 
        System.out.println(b1);

        /*
         * 01:04:00
         * Перевод int в double
         */
        int[] x = new int[10]; 	// Есть проблема с переводом int в double
                                // Нельзя просто так массив целых чисел
                                // положить в массив вещественных чисел
        double[] y = x; // ИЗУЧАЕМ ковариантность и контравариантность
                        // error: compilation failed (компиляция не удалась)
    }
    
}
