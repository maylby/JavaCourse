/*
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
https://gb.ru/lessons/414474


01:37:10

Задание №3

1) Написать метод, который принимает массив элементов, 
   помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, 
   помещает их в очередь и выводит на консоль содержимое очереди. 


Решение
(Марина Вершинина)
 */

package JavaSeminar.Seminar04;
/*
 * 1) Написать метод, который принимает массив элементов, 
 *    помещает их в стэк и выводит на консоль содержимое стэка.
 * 2) Написать метод, который принимает массив элементов, 
 *    помещает их в очередь и выводит на консоль содержимое очереди. 
 */
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class S03StackQueue {
    
    	public static void main(String[] args) {

		int[] arr = {4,8,5,0,3,8,7,2};

		getQueue(arr); // вызов метода
        getStack(arr); // вызов метода
	}

	private static void getQueue(int[] arr) {
		/*
		 * 01:58:20
		 * Код "очереди" выделен в метод
		 * (рефакторинг)
		 */
		Queue<Integer> queue = new LinkedList<>();  // "Queue" - интерфейс, поэтому 
							                        // "LincedList", а не "Queue"
		for (int elem : arr) { // цикл "foreach"
			queue.add(elem); // стардартное (.add) добавление елементов
		}
		System.out.println(queue);
	}

	private static void getStack(int[] arr) {
		/*
		 * 01:53:36
		 * Код стека выделен в метод
		 * (рефакторинг)
		 */
		Stack<Integer> stack = new Stack<>();

		for (int elem : arr) {
			stack.push(elem);   // в стеке нельзя добавлять через "add"
					            // из-за обратного вывода, применён "push"
		}
		while (!stack.isEmpty()) {
			 System.out.print(stack.pop() + " ");   // вывод в стек ("print")
							                        // в обратном порядке,
							                        // через пробел
		}	
	}}

/*
 * Результат:
 * 
 * [4, 8, 5, 0, 3, 8, 7, 2] // "LincedList" - вывод по очереди
 * 2 7 8 3 0 5 8 4 // "Stack" - вывод в обратном порядке (последний первым)
 */

