package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/*
Статики-1
*/

/**
 * В статическом блоке инициализируй labels пятью различными парами ключ-значение.
 */

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "qwer");
        labels.put(1.2, "qwer");
        labels.put(1.3, "qwer");
        labels.put(1.4, "qwer");
        labels.put(1.5, "qwer");
    }

    public static void main(String[] args) {
        System.out.println(labels);

    }
}
/*
{1.2=qwer, 1.4=qwer, 1.5=qwer, 1.3=qwer, 1.1=qwer}

Process finished with exit code 0
 */
