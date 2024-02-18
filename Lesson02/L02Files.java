/*
Урок 2. Почему вы не можете не использовать API
https://gb.ru/lessons/404313


00:08:00

Работа с файловой системой. 
Файлы

Для работы нужно:

File <имя> = new File(<полный путь к файлу>);

Варианты вызов:

File f1 = new File("file.txt");
File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

Какой вариант, в каком случае предпочтительнее?


00:11:00

 */
package JavaCourse.Lesson02;

import java.io.File;

public class L02Files {
    public static void main(String[] args) {
 		String pathProject = System.getProperty("user.dir");
 		String pathFile = pathProject.concat("/file.txt");
 		File f3 = new File(pathFile);
 		System.out.println(f3.getAbsolutePath ());
 		// /Users/sk/vscode/java_projects/file.txt (лекция)
 		// C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt (лекция)
        /*
         * Запустил код
         * Терминал выдал адресную строку с записью "file.txt"
         * Но сам файл по указанному адресу в папке "Lesson02" не появился
         */
        // C:\Users\Vitaliy\GeekBrains\JavaCourse\Lesson02\file.txt (VSCode)
    }
    


/*
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
}