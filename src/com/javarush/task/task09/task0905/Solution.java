package com.javarush.task.task09.task0905;

/*
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        System.out.println(deep);
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace().length;
    }
}

/*
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
 */

/*
3

Process finished with exit code 0
 */