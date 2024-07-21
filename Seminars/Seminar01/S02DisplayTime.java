/**
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


00:31:50
Вызов метода Даты и Времени

Задание №0. 

Настроим VS Code
Скачать и установить: https://code.visualstudio.com/download
Настроить проект, вывести в консоль “Hello world!”.
Вывести в консоль системные дату и время.

 */
package JavaSeminar.Seminar01;

import java.time.LocalDateTime;

public class S02DisplayTime {
    public static void main(String[] args) {
        System.out.println("Hello, World!");  // вызывать строку набором 
                                                // "System" или "print",
                                                // "print" удобнее, 
                                                // подсказка из двух строк
                                                // "System.out.println" 
                                                // "System.err.println" 
        /*
        Старые методы:
         * Data // не рекомендован к использованию
         * Calendar // сохраняется Java для совместимости со старыми версиями

        Методы новых версий Java:
		 * LocalDate // работает, только с датой
		 * LocalDateTime // работает с датой и временем
		 * LocalTime // работает, только со временем
         */                                        
        System.out.println(LocalDateTime.now()); // "now()" - текущее время

        /*
         * Вывод:
         * Hello, World!
         * 2024-02-15T14:14:37.613670800
         */
    }
}

