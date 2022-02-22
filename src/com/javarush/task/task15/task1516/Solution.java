package com.javarush.task.task15.task1516;

/*
Значения по умолчанию
*/

/**
 * В этой задаче тебе нужно:
 * Создать 7 нестатических public полей класса:
 * intVar типа int
 * doubleVar типа double
 * DoubleVar типа Double
 * booleanVar типа boolean
 * ObjectVar типа Object
 * ExceptionVar типа Exception
 * StringVar типа String
 * Убедиться, что они инициализируются дефолтными значениями.
 * Вывести их значения в заданном порядке в методе main()
 */

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExeptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExeptionVar);
        System.out.println(solution.StringVar);
    }
}
/*
0
0.0
null
false
null
null
null

Process finished with exit code 0
 */
