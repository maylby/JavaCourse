/*
Урок 1. Знакомство с языком программирования Java
https://gb.ru/lessons/404312


01:14:20
Область видимости переменных

У переменных существует понятие «область видимости». 
Если переменную объявили внутри некоторого блока фигурных скобок { }, 
то снаружи этого блока переменная будет недоступна.
 */


 package JavaCourse.Lesson01;
 
 /**
  * Примеры видимости переменных
  */
 public class A08VisibleArea {
    static int t = 111; // данную "t" (глобальную пременную) 
                        // будет видно везде,
                        // но задавать её нужно через метод (?) "static"
                        // ползоваться такими, пока, не рекомендовано
    public static void main(String[] args) {
        int b = 777;
        {
            int i = 123;
            System.out.println(i);
            System.out.println(i + b);
            System.out.println(b + t); 
        } 	
        int a = 222;
        System.out.println(t);  // error: cannot find symbol "i"
                                // система не видит переменную (i = 123),
                                // т.к. она находится внутри скобок
        System.out.println(a + t);
        System.out.println(a + b);
    }
    
 }