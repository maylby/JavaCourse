/*
Урок 2. Почему вы не можете не использовать API
https://gb.ru/lessons/404313


00:16:30

Функционал работы с папками и файлами

isHidden(): возвращает истину, если каталог или файл является скрытым
length(): возвращает размер файла в байтах
lastModified(): возвращает время последнего изменения файла или каталога
list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles(): возвращает массив файлов и подкаталогов, которые находятся 
в определенном каталоге
mkdir(): создает новый каталог
renameTo(File dest): переименовывает файл или каталог


Код с примерами работы 
приведённого выше функционала 
(запустить в VSCode)

 */
package JavaCourse.Lesson02;

import java.io.File;

public class L04Functional {
    public static void main(String[] args) {
 		String pathProject = System.getProperty("user.dir");
 		String pathDir = pathProject.concat("/files");
 		File dir = new File(pathDir);
 		System.out.println(dir.getAbsolutePath ());
 		if (dir.mkdir()) { // создает новый каталог
 			System.out.println("+");
 		} else {
 			System.out.println("-");
 		}
 		for (String fname : dir.list()) {
 			System.out.println(fname);
 		}}
}
