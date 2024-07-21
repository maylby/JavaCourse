/*
Java: знакомство и как пользоваться базовым API (семинары)
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
https://gb.ru/lessons/414474


02:00:00

Задание №4

Реализовать стэк с помощью массива. 
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().


Решение
(Алекандр Верзун)

 */

package JavaSeminar.Seminar04;
/**
 * S04ArrayStack
 * 
 * Реализовать стэк с помощью массива.
 * Нужно реализовать методы:
 * size(), empty(), push(), peek(), pop().
 */
public class S04ArrayStack {
    /*
     * объявление глобальных переменных уровня класса (по умолчанию "public")
     * переменная объявленная без инициализации именуется полем
     * в методе (public static) инициализации обязательна 
     * в классе (public class) переменную можно не инициализировать
     */
    private static int[] arr;
    private static int size; // "size" - ёмкость массива (стека)
    private static int indexUp; // (?) положение последнего элемента в стеке

    public static void main(String[] args) {
        size = 5;
        indexUp = - 1;
        arr = new int[size];

        /*
         * вызов методов с выводом на экран
         */
        System.out.println(size());
        push(5);
        push(7);
        push(9);
        System.out.println(size());
        System.out.println(empty());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(size());
        /*
         * дополнить код методами: 
         * 1) Автоматическое расширение (size) емкости массива
         *    при проверке индекса добавленного в "push" элемента
         *    если (if) индекс превышает ёмкость (size) массива, то
         *    расширить ёмкость (как? size * 2 (?))
         * 2) Общий вывод (print) всего стека
         */
    }
    
    public static int size() {    
        return indexUp + 1;
    }

    /*
     * тип "boolean"
     * "empty" - логическая переменная
     * метод проверяет (?) истинность индекса
     */
    public static boolean empty() {
        return indexUp == -1;
    }

    /*
     * тип "void" ничего не возвращает
     * метод "push" передаёт значение текущего элемента (число)
     */
    public static void push(int num) { 
        arr[++indexUp] = num;   // "++indexUp" префиксный инкремент 
                                // (см. приоритет действия)
                                // "arr[++indexUp]" заменяет две записи:
                                // 1. arr[indexUp + 1] = num; (увеличение индекса)
                                // 2. index++; (применение?)
    }

    /*
     * метод "peek()" возвращает элемент массива по индексу (indexUp)
     */
    public static int peek() {
        return arr[indexUp];
    }

    /*
     * метод "pop()" возвращает и удаляет 
     * элемент массива по индексу (indexUp)
     */
    public static int pop() {
        return arr[indexUp--];  // "++indexUp" постфиксный дикремент 
                                // (см. приоритет)                      
    }
}