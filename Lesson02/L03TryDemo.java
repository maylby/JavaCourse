/*
Урок 2. Почему вы не можете не использовать API
https://gb.ru/lessons/404313


00:13:15
Основные ошибки при работе с файловой системой

1. Не верный путь
2. Отсутствие папки
3. Отсутствие файла
4. Файл не верного типа
5. Слишком большой файл, нехватило памяти
6. Файл пустой
7. Файл частично битый


00:14:00
Блоки обработки ошибок
 */

package JavaCourse.Lesson02;

import java.io.File;

public class L03TryDemo {
    
    {
        try {
            // Код, в котором может появиться ошибка
        } catch (Exception e) {
            // Обработка, если ошибка случилась
        }
        finally {
            // Код, который выполнится в любом случае
        }
    }

    public static void main(String[] args) { // повтор строки (см. выше)
    
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile); 
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }
    }
}
/*
* P.S. 
* Если можно не писать данный код, то лучше его не писать
*/