/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


01:24:00
Оператор выбора (switch - переключатель)


01:24:00
 */
package JavaCourse.Lesson01;

import java.util.Scanner;   // работа со сканером 
                            // в файле "A07GetData.java"
                            // ("Получение данных из терминала")
public class A11Switch {
    public static void main(String[] args) {
        /*
         * Добавил код для сканера 
         * (три строки кода ниже)
         */
        Scanner iScanner = new Scanner(System.in, "ibm866");
        System.out.printf("\nvalue: ");
        int value = iScanner.nextInt();

        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
            case 2: 
            case 3: // case 2, 3 добавил для проверки
                text = "Autumn";
                break;
        //    ...
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
    
}
