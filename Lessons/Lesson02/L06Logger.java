/*
Урок 2. Почему вы не можете не использовать API
https://gb.ru/lessons/404313


00:23:30
Логирование

Логи содержат системную информацию работы 
программного или аппаратного комплекса.
В них записываются действия разного приоритета 
от пользователя, или программного продукта. 
Процесс ведения логов называют 
“логированием” (журналированием).



00:25:00
Основы логирования


Использование
Logger logger = Logger.getLogger() // указываем тип класса, который будем добавлять

Уровни важности
INFO, DEBUG, ERROR, WARNING и др. // уровень важности ошибок

Вывод
ConsoleHandler info = new ConsoleHandler(); // указать, куда сохранять
log.addHandler(info);

Формат вывода: структурированный, абы как*
XMLFormatter, SimpleFormatte // указать формат вывода

 */
package JavaCourse.Lesson02;

import java.io.IOException;
import java.util.logging.*;

public class L06Logger {
    public static void main(String[] args) throws IOException {
        /*
         * Код из презентации (стр. 38)
         * Стандартный формат (? пользовательский)
         * записан с экрана во время лекции
         */
 		Logger logger = Logger.getLogger(L06Logger.class.getName());
 		logger.setLevel(Level.INFO);
 		ConsoleHandler ch = new ConsoleHandler ();
 		logger.addHandler(ch);
 		SimpleFormatter sFormat = new SimpleFormatter ();
 		ch.setFormatter(sFormat);
 		logger.log(Level.WARNING, "Тестовое логирование" );
 		logger.info("Тестовое логирование" );
    
        /*
         * Формат html (?) для парсинга
         * записан с экрана во время лекции
         */
        Logger logger1 = Logger.getLogger(L06Logger.class.getName());
 		logger1.setLevel(Level.INFO);
 		ConsoleHandler ch1 = new ConsoleHandler();
 		logger1.addHandler(ch1);
 		//SimpleFormatter sFormat = new SimpleFormatter();
 		XMLFormatter xml = new XMLFormatter();
 		//ch.setFormatter(sFormat);
 		ch1.setFormatter(xml);
 		logger1.log(Level.WARNING, "Тестовое логирование");
 		logger1.info("Тестовое логирование");

        /*
         * Код из дополнительных материалов к лекции 2
         * 02_(Л-02)_доп (папка "Lesson_02", файл "Ex005_Logger")
         */
        Logger logger2 = Logger.getLogger(L06Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger2.addHandler(fh);
        
        SimpleFormatter sFormat2 = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat2);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger2.log(Level.WARNING, "Тестовое логирование 1");
        logger2.info("Тестовое логирование 2");
    }
}

/*
00:26:20
Демонстрация работы кода на экране 
(вывод сообщений в консоль в текстовом и xml формате)
(см. папки с доп. мат.(?) и/или презентацию (?))


00:29:00
Демонстрация записи кода в текстовый фаил и xml-файл


Задание 
Демонстрация

Написать программу для работы с бинарными файлами.
Предусмотреть логирование всех действий.

 */