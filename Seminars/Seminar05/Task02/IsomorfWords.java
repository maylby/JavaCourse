/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
https://gb.ru/lessons/414475

00:34:40

Задание №1

Даны 2 строки, написать метод, который вернет "true", если 
эти строки являются изоморфными и "false", если нет. 
Строки изоморфны, если одну букву в первом слове можно заменить 
на некоторую букву во втором слове, при соблюдении условия:

    1. Повторяющиеся буквы одного слова меняются на одну и ту же букву 
       с сохранением порядка следования ("add" - "egg" изоморфны)
    2. Буква может не меняться, а остаться такой же ("note" - "code")

Пример 1:
Input: s = "foo", t = "bar"
Output: false

Пример 2:
Input: s = "paper", t = "title"
Output: true


00:39:00

Решение
(Александр Верзун)

*/
package JavaSeminar.Seminar05.Task02;

import java.util.HashMap;
import java.util.Map;

/*
Даны 2 строки, написать метод, который вернет "true", если 
эти строки являются изоморфными и "false", если нет. 
Строки изоморфны, если одну букву в первом слове можно заменить 
на некоторую букву во втором слове, при соблюдении условия:

1. Повторяющиеся буквы одного слова меняются на одну и ту же букву 
   с сохранением порядка следования ("add" - "egg" изоморфны)
2. Буква может не меняться, а остаться такой же ("note" - "code")
 */
public class IsomorfWords {
    public static void main(String[] args) {
    String s = "paper", t = "title";
    boolean res = isIsomorphic(s, t);
    System.out.println(res);		
}


/*
* метод "isIsomorphic" (?) сравнивает строки "strOne", "strTwo"
*/
public static boolean isIsomorphic(String strOne, String strTwo) {
    if (strOne.length() != strTwo.length()) { // если длина слов разная
        return false;
    }
    if (strOne.equals(strTwo)) { // если слова одинаковые
        return true;
    }
    Map<Character, Character> dict = new HashMap<>();
    for (int i = 0; i < strOne.length(); i++) {
        char one = strOne.charAt(i);
        char two = strTwo.charAt(i);
        /**
        * если в "ключе" (one) есть совпадающий символ (см. следующее условие)
        */
        if (dict.containsKey(one)) { 
            /**
            * Если "ключ" (one) не совпадает со "значением" (two),
            * возвращаем "false" (ложь), слова не изоморфны
            */
            if (dict.get(one) != two) {/* если 1-й и 3-й "ключи" совпали,
                            * но 1-е и 3-е "значения" разные,
                            * например, как в "paper" и "tiles", 
                            * то слова не изоморфны (false) */
                return false;
            }
        /** 
        * "Обратная" проверка:
        * "containsValue" проверяет значения, т.е. сами символы
        * Если символ (two) повторился, но в ключе (one) повтора нет, 
        * вернуть "false" (ложь), т.к. слова не изоморфны
        */
        } else if (dict.containsValue(two)) {  /* 
                                                * Без проверки значений,
                                                * слова "power" и "title"
                                                * программа сочтёт изоморфными, 
                                                * т.к. в коде нет указаний на то, 
                                                * что значения не могут совпадать, 
                                                * если не совпали ключи 
                                                */
            return false; 
        } else {
            dict.put(one, two); // иначе, добавляем найденную пару
        }
    }
    return true; // возвращаем истину (слова изоморфны)
}}

