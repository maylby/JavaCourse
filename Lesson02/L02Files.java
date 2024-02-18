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
	/*
	 * Код из дополнительных материалов к лекции 02
	 * см. ПК: 02_(Л-02)_доп, папка "Lesson_02", файл "Ex002_fileSystemDemo"
	 */
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
        // C:\Users\Vitaliy\GeekBrains\JavaCourse\Lesson02\file.txt (VSCode)
         * 
         * Но сам файл "file.txt" по указанному адресу в папке "Lesson02" не появился,
         * вместо файла, система создала пустую папку "file" внутри папки "Lesson02" (VSCode)
         */

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}    


