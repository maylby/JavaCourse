/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


01:04:30

Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.

 */
package JavaSeminar.Seminar01;

public class S06CountNumArray2 {

 	public static void main(String[] args) {
		int[] array = {1,1,0,1,1,1};        // Адаптация кода для C#: 
                                            // "int[] array" - над методом.
		int max = getMaxCountOnes(array);   // "int max =" разместить внизу,
                                            // под "return max", за скобкой.
        System.out.print(max);              // "print(max)" преобразовать 
                                            // в "Console.Write(max)"
                                            // поместить под "int max ="
                                            // прочее - без изменений.
	}
    /*
     * Код задачи из файла "S06CountNumArray"
     * переобразован в отдельный метод "getMaxCountOnes"
     * с помощью рефакторинга (функционал VSCode)
     */
    private static int getMaxCountOnes(int[] array) {
        int count = 0;
		int max = 0;
		for (int el: array) {
			if (el == 1) {
				count++;
				// if (count > max) max = count; // v1 (стандартный)
				// max = Math.max(count, max);   // v2 (вариант VSCode)
				max = count > max? count : max;  // v3 (теренарный оператор)

			} else {
				count = 0; 
			}
		}
        return max;
    }
}

