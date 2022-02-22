package com.javarush.task.task16.task1606;

import java.util.ArrayList;
import java.util.List;

/*
join: в нужное время в нужном месте
*/

/**
 * Подумай, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
 * сначала для firstThread, а потом для secondThread.
 * Вызови метод join в нужном месте.
 *
 * Пример вывода:
 * firstThread : String 1
 * firstThread : String 2
 * ...
 * firstThread : String 19
 * firstThread : String 20
 * secondThread : String 1
 * ...
 * secondThread : String 20
 */

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
/*
firstThread : String 1
firstThread : String 2
firstThread : String 3
firstThread : String 4
firstThread : String 5
firstThread : String 6
firstThread : String 7
firstThread : String 8
firstThread : String 9
firstThread : String 10
firstThread : String 11
firstThread : String 12
firstThread : String 13
firstThread : String 14
firstThread : String 15
firstThread : String 16
firstThread : String 17
firstThread : String 18
firstThread : String 19
firstThread : String 20
secondThread : String 1
secondThread : String 2
secondThread : String 3
secondThread : String 4
secondThread : String 5
secondThread : String 6
secondThread : String 7
secondThread : String 8
secondThread : String 9
secondThread : String 10
secondThread : String 11
secondThread : String 12
secondThread : String 13
secondThread : String 14
secondThread : String 15
secondThread : String 16
secondThread : String 17
secondThread : String 18
secondThread : String 19
secondThread : String 20

Process finished with exit code 0
 */