/*
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
https://gb.ru/lessons/414476


00:35:30

Задание №1

Решение
(Марина Вершинина)

*/
package JavaSeminar.Seminar06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * S02UniqueValues
 * 
 * 1. Напишите метод, который заполнит массив 
 * из 1000 элементов случайными цифрами от 0 до 500. 
 * 
 * 2. Создайте метод, в который передайте заполненный выше массив, 
 * с помощью Set вычислите процент уникальных значений в данном массиве 
 * и верните его в виде числа с плавающей запятой. 
 * 
 * Для вычисления процента используйте формулу:
 * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class S02UniqueValues {

    public static void main(String[] args) {
        int[] arr = getArray(1000, 500);
        // System.out.println(getPercentUnique(arr));
        double result = getPercentUnique(arr); // передать вызванный метод переменной 
        System.out.println(result); // вывод результата
        
    }

    /*
     * Метод создания массива случайных значений
     */
    public static int[] getArray(int size, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max);
        }
        return array;
    }

    /*
     * Метод вычисления процента уникальных значений в массиве
     */
    public static double getPercentUnique(int[] arr) {
        Set<Integer> set = new HashSet<>(); 
        for (int elem : arr) { // перебор элементов массива
            set.add(elem); // добавление уникальных значений
        }
        /*
         * процентное соотношение числа уникальных значений
         * и общего количества элементов массива
         */
        double res = (double)set.size() * 100 / arr.length;  
        return res; 
    }
}
