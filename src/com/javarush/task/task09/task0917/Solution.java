package com.javarush.task.task09.task0917;

/*
Перехват unchecked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException | IndexOutOfBoundsException | NumberFormatException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

/*
В методе handleExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch
 */

/*
java.lang.NullPointerException
com.javarush.task.task09.task0917.Solution.method1(Solution.java:30)
com.javarush.task.task09.task0917.Solution.handleExceptions(Solution.java:14)
com.javarush.task.task09.task0917.Solution.main(Solution.java:9)

Process finished with exit code 0

 */
