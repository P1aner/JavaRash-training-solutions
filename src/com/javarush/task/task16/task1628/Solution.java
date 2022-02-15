package com.javarush.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
Кто первый встал - того и тапки
*/

/**
 * 1. Разберись, что делает программа.
 * 1.1. Каждая нить должна читать с консоли строки. Используй готовый static BufferedReader reader.
 * 1.2. Используй AtomicInteger readStringCount, чтобы посчитать, сколько строк уже считано с консоли всеми нитями.
 * 2. Реализуй логику метода run:
 * 2.1. Пока нить не прервана (!isInterrupted) читай с консоли строки и добавляй их в поле List<String> result.
 * 2.2. Используй readStringCount для подсчета уже считанных с консоли строк.
 * 2.3. Тело метода run нужно поместить в блок try-catch.
 */

public class Solution {
    public static volatile AtomicInteger readStringCount = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());

        //init threads
        ReaderThread consoleReader1 = new ReaderThread();
        ReaderThread consoleReader2 = new ReaderThread();
        ReaderThread consoleReader3 = new ReaderThread();

        consoleReader1.start();
        consoleReader2.start();
        consoleReader3.start();

        while (count > readStringCount.get()) {
        }

        consoleReader1.interrupt();
        consoleReader2.interrupt();
        consoleReader3.interrupt();
        System.out.println("#1:" + consoleReader1);
        System.out.println("#2:" + consoleReader2);
        System.out.println("#3:" + consoleReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<String>();

        public void run() {
            //напишите тут ваш код
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    while (reader.ready()) {
                        result.add(reader.readLine());
                        readStringCount.incrementAndGet();
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
/*
5
asd
qwe
zxc
vbn
fgh
#1:[qwe]
#2:[asd, zxc, fgh]
#3:[vbn]
 */
