/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/414475

00:58:00

Задание №2

Написать программу, определяющую правильность расстановки скобок в выражении.

Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь


00:04:00

Решение
(Андрей Лопатько)

*/

package JavaSeminar.Seminar05.Task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
		String[] strings = {
			"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", 
			"{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
			
			for  (String string : strings) {
				boolean result = checkBrackets(string);
				System.out.println(string + " -> " + result);
			}
	}
	public static boolean checkBrackets(String str) { 
		Map<Character, Character> map = getBracketsMap();
		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (map.containsValue(c)) { // находим значение, например, "("
				stack.push(c); // записываем в стек
 
			} else if (map.containsKey(c)) { // ищем ключ для значения

                /*
                 * Если стек пустой или не найден ключ значения, вернуть false (ложь)
                 * ("return" записан в одну строку с условием)
                 */                  
				if (stack.isEmpty() || stack.pop() != map.get(c)) return false;
            }
        }
		return stack.isEmpty(); // иначе, вернуть пустой стек
	}
	public static Map<Character, Character> getBracketsMap() {

		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		map.put('>', '<');
		return map;
	}
}
/*
Вывод:

a+(d*3) -> true
[a+(1*3) -> false    
[6+(3*3)] -> true    
{a}[+]{(d*3)} -> true
<{a}+{(d*3)}> -> true
{a+]}{(d*3)} -> false

 */