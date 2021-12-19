package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format(currentDate));
    }
}





/*
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 */

/*
18 12 2021

Process finished with exit code 0
*/