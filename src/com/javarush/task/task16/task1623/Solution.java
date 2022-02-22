package com.javarush.task.task16.task1623;

/*
Рекурсивное создание нитей
*/

/**
 * 1. Измени класс GenerateThread так, чтобы он стал нитью.
 * 2. Создай конструктор GenerateThread, который должен:
 * 2.1. Вызвать конструктор суперкласса с параметром String - номером созданной нити. Используй createdThreadCount.
 * 2.2. Запустить текущую нить.
 * 2.3. Номер первой нити должен начинается с 1.
 * 3. Переопредели метод toString, для этого внутри GenerateThread нажми Alt+Insert -> Override Methods. Начни печатать toString.
 * 3.1. Метод toString должен возвращать № текущей нити и слово " created". Используй getName().
 * <p>
 * Пример:
 * 8 created
 * <p>
 * 4. Пока количество созданных нитей меньше Solution.count метод run должен:
 * 4.1. Создать новую нить типа GenerateThread.
 * 4.2. Вывести в консоль созданную в пункте 4.1 нить.
 * 5. В итоге должно быть выведено в консоль 15 строк.
 */

public class Solution {
    static int count = 15;


    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        @Override
        public void run() {
            if(Solution.createdThreadCount < count)
             {

                System.out.println(new GenerateThread());
            }
        }

        public GenerateThread() {

            super(String.valueOf(++Solution.createdThreadCount));
            start();

        }

        @Override
        public String toString() {
            return this.getName() + " created";
        }


    }
}
/*
9 created
11 created
10 created
13 created
12 created
8 created
7 created
2 created
15 created
6 created
5 created
1 created
4 created
14 created
3 created

Process finished with exit code 0
 */
