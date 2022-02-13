package com.javarush.task.task16.task1618;

/*
Снова interrupt
*/

/**
 * Создай нить TestThread.
 * В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        Thread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread  extends Thread {
    }
}
/*

Process finished with exit code 0
 */


