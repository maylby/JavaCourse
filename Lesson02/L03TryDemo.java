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

Коды "Блока обработки ошибок" 
записаны с экрана единым массивом в процессе лекции, 
в хронологической последовательности изложения материала,
работе друг друга помех не создают,
каждый выдаёт заданый результат независимо.

 */
package JavaCourse.Lesson02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class L03TryDemo {
    
    /*
     * Общая структура блока обработки ошибок:
     *  - try (код, в котором может появиться ошибка)
     *  - catch (обработка, если ошибка случилась)
     *  - finally (код, который выполнится в любом случае)
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

    public static void main(String[] args) { 
        /*
         * Код блока обработки ошибок
         */
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            /*
             * следующая строка взята из кода файловой системы
             * (см. файл L02Files.java)
             * строка внесена мной для активации переменной "f3", иначе
             * система выдёт следующее сообщение:
             * "Значение локальной переменной f3 не используется".
             */ 
            System.out.println(f3.getAbsolutePath ()); 
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        { System.out.println("finally"); } // форма записи кода 
                                            // строки "finally" нестандартна, 
                                            // в таком виде применена в лекции,
                                            // строка "catch" записана стандартно
    /*
     * P.S. 
     * Если можно не писать данный код, то лучше его не писать
    

    00:15:00
    Что можно изменить?
    */

            try {
                String pathProject = System.getProperty("user.dir");
                String pathFile = pathProject.concat("/file.txt");
                File file = new File(pathFile);

                if (file.createNewFile()) { // можно сделать проверку:
                                            // Если возвращается True (истина),
                                            // значит файл был создан
                                            // Если False (ложь), значит  
                                            // такой файл уже был найден, 
                                            // и работать с ним нужно по-другому          
                    System.out.println("file.created");
                }
                else {
                    System.out.println("file.existed");
                }
            } catch (Exception e) {
                System.out.println("catch");
            } finally {
                System.out.println("finally");
            } 

/*
 * Далее, финальный блок из дополнительных материалов к лекции
 * Папка ПК: 02_(Л-02)_доп (папка: "Lesson_02", файл "Ex003_tryDemo")
 */

        String line = "empty";
        try {
            /*
             * Две следующие строки кода 
             * ("String pathProject ..." и "String pathFile1 ...")
             * внесены мной для активации переменной "pathFile1",
             * без них система не распознаёт "pathFile1" и выдаёт ошибку
             * В лекции данные строки кода отсутствовали
             */ 
            String pathProject = System.getProperty("user.dir");
            String pathFile1 = pathProject.concat("/file.txt");
            File file = new File(pathFile1);

            if (file.createNewFile()) {
                System.out.println("file.created"); 
            }
            else {
                System.out.println("file.existed");
                /*
                 * "FileWriter" записывает текст в символьные файлы
                 * Часть кода, относящаяся к "FileWriter",
                 * взята из дополнительных материалов к лекции 2,
                 * в видео ролике данного кода не было
                 */
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                fileWriter.append(System.lineSeparator());

                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                line = bufReader.readLine();
                bufReader.close(); 
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }
}

