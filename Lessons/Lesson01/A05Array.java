/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


00:58:00
Массивы данных
 */

package JavaCourse.Lesson01;

public class A05Array {

    public static void main(String[] args) {
        /*
        * Одномерные массивы
        */
        int[] arr = new int[10];
        System.out.println(arr.length); // 10 (длина массива)
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr.length); // 5 (длина массива)

        /*
        * 01:00:30
        * Многомерные массивы
        */
        int[] arr1[] = new int[3][5];   // Форма "int[] arr[]" задаёт
                                        // многомерный (двумерный) массив
        for (int[] line : arr1) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        /*
        * 01:01:10
        * Двумерный массив (массив массивов)
        */
        int[][] arr2 = new int[3][5]; // Форма "int[][]" задаёт двуменный массив
 
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d ", arr2[i][j]);
            }
            System.out.println();
        }        
    }
}
