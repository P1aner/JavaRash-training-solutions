package com.javarush.task.task17.task1712;

import java.util.ArrayList;
import java.util.List;

/*
Ресторан
*/

/**
 * 1.Разберись, что делает программа. Официант почему-то не относит приготовленные блюда назад к столам :(
 *
 * 2.Исправь ошибку.
 *
 * Подсказка: это одна строчка
 */

public class Restaurant {
    public static List<Thread> threads = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Waiter waiterTarget = new Waiter();
        Thread waiter = new Thread(waiterTarget);
        threads.add(waiter);

        Cook cookTarget = new Cook();
        Thread cook = new Thread(cookTarget);
        threads.add(cook);

        waiter.start();
        cook.start();

        Thread.sleep(2000);
        cookTarget.continueWorking = false;
        Thread.sleep(500);
        waiterTarget.continueWorking = false;
    }
}
/*
Повар отдыхает
Получен заказ от стола №1
Получен заказ от стола №2
Заказ будет готовиться 192 мс для стола №1
Получен заказ от стола №3
Заказ для стола №1 готов
Заказ будет готовиться 4 мс для стола №2
Официант отнес заказ для стола №1
Заказ для стола №2 готов
Заказ будет готовиться 102 мс для стола №3
Официант отнес заказ для стола №2
Заказ для стола №3 готов
Повар отдыхает
Официант отнес заказ для стола №3
Повар отдыхает
Получен заказ от стола №4
Заказ будет готовиться 136 мс для стола №4
Получен заказ от стола №5
Заказ для стола №4 готов
Заказ будет готовиться 37 мс для стола №5
Заказ для стола №5 готов
Повар отдыхает
Официант отнес заказ для стола №4
Повар отдыхает
Официант отнес заказ для стола №5
Повар отдыхает
Получен заказ от стола №6
Заказ будет готовиться 183 мс для стола №6
Получен заказ от стола №7
Получен заказ от стола №8
Заказ для стола №6 готов
Заказ будет готовиться 4 мс для стола №7
Заказ для стола №7 готов
Заказ будет готовиться 34 мс для стола №8
Заказ для стола №8 готов
Повар отдыхает
Официант отнес заказ для стола №6
Повар отдыхает
Официант отнес заказ для стола №7
Повар отдыхает
Официант отнес заказ для стола №8
Повар отдыхает
Получен заказ от стола №9
Заказ будет готовиться 75 мс для стола №9
Получен заказ от стола №10
Заказ для стола №9 готов
Заказ будет готовиться 107 мс для стола №10
Официант отнес заказ для стола №9
Заказ для стола №10 готов
Повар отдыхает
Официант отнес заказ для стола №10
Получен заказ от стола №1
Получен заказ от стола №2
Получен заказ от стола №3
Получен заказ от стола №4
Получен заказ от стола №5

Process finished with exit code 0

 */