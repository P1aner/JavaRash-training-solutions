package com.javarush.task.task13.task1309;

/*
Всё, что движется
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly value);
    }

}
/*
В этой задаче тебе нужно:
Создать интерфейс CanMove с методом speed.
Сделать так, чтобы speed возвращал значение типа Double и ничего не принимал в качестве аргументов.
Создать и унаследовать интерфейс CanFly от интерфейса CanMove.
Добавить в интерфейс CanFly метод speed.
Убедиться, что speed возвращает значение типа Double и принимает один параметр типа CanFly.
 */
/*

Process finished with exit code 0
 */