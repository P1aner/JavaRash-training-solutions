package com.javarush.task.task07.task0725;

/*
Переставь один модификатор static
*/

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public int getValue() {
        return C;
    }
}

/*
Переставь один модификатор static, чтобы пример скомпилировался.
 */

/*
package com.javarush.task.task07.task0725;

public class Solution {
    public final int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public static int getValue() {
        return C;
    }
}
 */


/*

Process finished with exit code 0
 */
