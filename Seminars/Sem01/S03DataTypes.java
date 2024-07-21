/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/414471

 */
package JavaSeminar.Seminar01;

public class S03DataTypes {
    public static void main(String[] args) {
        
        int num = 345;
        double d = 4.5;
        float f = 4.5f; // вещественные числа (250 символов)
                        // тип "float" используется с целью экономии ресурсов
        boolean b = true; // истина (true) / ложь (false) - логический тип
        char ch = 'N';  // символьный тип данных
                        // значение - строго в одинарных кавычках
                        // "char" неявно является целочисленным типом, т.к.
                        // за его значением скрывается код символа, т.е. число
        System.out.println(num);
        System.out.println(d);
        System.out.println(f);
        System.out.println(b);
        System.out.println(ch);
        println("");
    }
    public static String println(String a) {
        String str = "Hello";   // Значение пишем, только в двойных кавычках
                                // Название - с заглавной буквыв, т.к. 
                                // "String" - ссылочный тип данных (все классы)
                                // (Random, LocalDateTime и т.д.).
                                // Способ хранения классов безструктурный 
                                // называют "куча", т.к. в нём хранятся и методы.
                                // Названия структурных типов данных (примитивы)
                                // пишутся со строчной буквы
                                // (int, double, float, boolean и т.д.
        return str; // возвращает строку, т.к. 
                    // на входе (public static) использован 
                    // метод (класс?) "String"	        
    }
}
