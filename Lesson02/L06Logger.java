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



Код из презентации (стр. 38)

Стандартный формат (? пользовательский)
 */
package JavaCourse.Lesson02;

import java.util.logging.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class L06Logger {
    public static void main(String[] args) {

 		Logger logger = Logger.getLogger(L06Logger.class.getName());
 		logger.setLevel(Level.INFO);
 		ConsoleHandler ch = new ConsoleHandler ();
 		logger.addHandler(ch);
 		SimpleFormatter sFormat = new SimpleFormatter ();
 		ch.setFormatter(sFormat);
 		logger.log(Level.WARNING, "Тестовое логирование" );
 		logger.info("Тестовое логирование" );
 	}
    
}