package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) /*throws Exception*/ {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMM dd, yyyy");
        String dateString;
        Date date = null;
        try {
            dateString = reader.readLine();
            date = dateFormat.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dateFormat1.format(date).toUpperCase(Locale.ROOT));
    }
}

/*
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
 */

/*
2013-08-18
АВГ. 18, 2013

Process finished with exit code 0

 */

