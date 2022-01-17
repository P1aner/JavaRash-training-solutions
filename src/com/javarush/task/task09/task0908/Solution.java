package com.javarush.task.task09.task0908;

/*
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (Exception e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}


/*
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
 */
/*
java.lang.NullPointerException

Process finished with exit code 0
 */
