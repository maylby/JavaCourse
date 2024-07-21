/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/414475


01:35:25

Задание №3

http://graecolatini.bsu.by/htm-different/num-converter-roman.htm
Принципы римской с/с


Решение
(Марина Вершинина)

*/
package JavaSeminar.Seminar05.Task02;

import java.util.HashMap;
import java.util.Map;
/*
 Написать метод, который переведет число 
 из римского формата записи в арабский.
 Например, MMXXII = 2022
 */
public class RomanArabic {

public static void main(String[] args) {
    String romanNum = "MMXXIV";
    System.out.println(romanToArabic(romanNum));
    }

    public static Map<Character, Integer> getRomanArabicMap() {
        
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

    public static int romanToArabic(String romanNumber) {
        Map<Character, Integer> map = getRomanArabicMap();
        int result = 0;
        int prefValue = 0;
        for (int i = romanNumber.length()-1; i >= 0; i--) {
            int currentValue = map.get(romanNumber.charAt(i));
            if (currentValue < prefValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prefValue = currentValue;
        }
        return result;
    }
}



/*
02:01:00

ДЗ

1) Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.

2) Пусть дан список сотрудников: Иван Иванов 
(и остальные, полный текст дз будет на платформе) 

Написать программу, которая найдет и выведет 
повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. 

3) Реализовать алгоритм пирамидальной сортировки (HeapSort) - "куча".

Задание не было показано на семинаре в списке ДЗ:
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

*/