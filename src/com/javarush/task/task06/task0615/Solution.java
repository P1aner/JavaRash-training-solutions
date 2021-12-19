package com.javarush.task.task06.task0615;

/*
Феншуй и статики
*/

public class Solution {

    public static int A = 5;
    public int B = 2;
    public int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}


/*
Переставь один модификатор static, чтобы пример скомпилировался.
 */




/*
public class Solution {

    public int A = 5;
    public int B = 2;
    public static int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}
 */
/*

Process finished with exit code 0
 */