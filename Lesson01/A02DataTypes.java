/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


00:22:00

Типы данных

1) примитивные:
    ● boolean (логический тип данных)
    ● int, short, long и т.д. (целочисленный тип)
    ● float, double (вещественный тип - дроби)
    ● Char (символьный тип, для хранения одного символа)

2) Ссылочные
    ● Массивы (String[]) 
    ● и др.


00:23:40
Создание переменной

<тип> <идентификатор>;
<идентификатор> = <значение>;
*/

package JavaCourse.Lesson01;

/**
 * A02DataTypes
 */
public class A02DataTypes {

    public static void main(String[] args) {
        /*
         * переменная в массиве
         */
        String s = null; // Переменная "s" в массиве строк "String"
                         // обязательно должна иметь некое начальное значение, 
                         // в данном случае, "null" (пустая строка), иначе
                         // она (пременная) не будет идентифицирована, 
                         // в результате, система выдаст ошибку.
        System.out.println(s);
        
        /* 
         * 00:25:00 
         * Хранение целых чисел 
         */ 
        short age = 10; // "short" хранит мелкие целые значения (см. док.)
        int salary = 123456; // "int" (integer) - целочисленные значения
                            // занимает объём памяти равный 4 байта,
                            // хранит значения от -2,147*10**9 до +2,147*10**9
        System.out.println(age); //10
        System.out.println(salary); //123456

        /*
         * 00:26:45
         * Вещественные числа
         */
        float e = 2.7f; // тип данных "float", требует доп. знаков (f)
        double pi = 3.1415; // "double" не требует, но есть суфикс (D), 
                           // который не является обязательным
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415


        int a = 13;
        double d = a; // Тип "int" можно перевести в тип "double"
                      // размер "double" позволяет совершить это
        //  a = d;  // обратный перевод требует преобразования, т.к.
                // тип "int" меньше типа "double"
        System.out.println(d);
        System.out.println(a);

        /*
         * 00:28:00
         * Тип данных char (хранит отдельные символы)
         */
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        
        /*
         * 00:29:40
         * Тип данных boolean
         */
		boolean flag1 = 123 <= 234; // Пременная "flag1", далее по коду, 
                                    // не подсвечивается (не определяется)
		System.out.println(flag1);  // true
		boolean flag2 = 123 >= 234 || flag1; // "||","&&" -> "и" (логические операции)
						                     // "|", "&" -> "и" (побитовые операции)
                                             // True && False - это False, т.е.
                                             // если хотя бы одна переменная ложна,
                                             // то всё утверждение ложно (False) 
		System.out.println(flag2); // true
		boolean flag3 = flag1 ^ flag2; 	// "^" - значит "или" (дезюнкция)
                                        // Разделительная дезюнкция даёт "True", когда
						                // только одно из значений истинно, иначе 
						                // если истинны оба (True^True), то 
                                        // результат - False (основы логики)
		System.out.println(flag3); // false

        /*
         * Строки в Java
         */
		String msg ="Hello world";
 		System.out.println(msg); // Hello world

        /*
         * 00:33:00
         * Неявная типизация - пременная "var"
         */       
        var x = 123; // "var" нужен, когда забыл (не знаешь), 
        // с каким типом данных работаешь
        System.out.println(x); // "a" будет определён, как "int"
        var y = 123.456;
        System.out.println(y); // "d" определится, как "double"


        var i = 123; // тип данных "integer" 
        System.out.println(i); // 123
        var j = 123.456; // тип данных "double"
        System.out.println(j); // 123.456
        System.out.println(getType(i)); // Integer
        System.out.println(getType(j)); // Double
                                       // "getType()" - определение типа данных
        j = 1022; // тип данных "double"
        System.out.println(j);  // 1022.0
                                //d = "mistake"; 
                                //error: incompatible types:
                                //String cannot be converted to double
    }
    static String getType(Object o) { // "getType" - статический член класса (?)
        return o.getClass().getSimpleName();
    }
}





