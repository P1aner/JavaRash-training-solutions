package com.javarush.task.task14.task1413;

/*
Computer
*/

public class Solution {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
/*
Давай соберем компьютер. Вот что тебе нужно сделать:
Создай интерфейс CompItem.
Добавь в него метод String getName().
Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
Создай класс Computer.
В класс Computer добавь приватное поле keyboard типа Keyboard.
В класс Computer добавь приватное поле mouse типа Mouse.
В класс Computer добавь приватное поле monitor типа Monitor.
Создай конструктор с тремя параметрами в классе Computer используя комбинацию клавиш Alt+Insert (для Windows) внутри класса (команда Constructor).
Внутри конструктора инициализируйте все три поля (переменных) класса в соответствии с переданными параметрами.
Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert (для Windows) и выбери команду Getter).
Все созданные классы и интерфейс должны быть в отдельных файлах.
 */
/*
com.javarush.task.task14.task1413.Keyboard
com.javarush.task.task14.task1413.Monitor
com.javarush.task.task14.task1413.Mouse
Work!

Process finished with exit code 0
 */
