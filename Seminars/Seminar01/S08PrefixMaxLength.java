/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471


01:50:00

Задание №4 
(Презентация семинара 1)
 */

package JavaSeminar.Seminar01;
/*
Напишите метод, который находит самую длинную строку 
общего префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку.
 */
public class S08PrefixMaxLength {
    public static void main(String[] args) {
		String[] strs = {"flower", "flow", "flood", "float", "flight"};
		String pref = getLongestPrefix(strs);
		System.out.print(pref);
	}

    private static String getLongestPrefix(String[] strs) {
        String pref = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(pref) != 0) {
				pref = pref.substring(0, pref.length()-1);
			}
			if (pref.isEmpty()) break; 
		}
        return pref;
    }
}
