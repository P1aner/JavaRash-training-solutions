package com.javarush.task.task16.task1615;

/*
Аэропорт
*/

/**
 * 1. Разберись, что делает программа.
 * 2. Исправь метод takingOff(взлет) - сейчас он работает оооочень долго. Взлет должен занимать 100 миллисекунд.
 * 3. Реализуй метод waiting по аналогии с методом takingOff.
 */

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // взлетная полоса

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Самолет #1");
        Plane plane2 = new Plane("Самолет #2");
        Plane plane3 = new Plane("Самолет #3");
    }

    private static void waiting() {
        // напишите тут ваш код
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    private static void takingOff() {
        // исправь этот метод
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    // если взлетная полоса свободна, занимаем ее
                    System.out.println(getName() + " взлетает");
                    takingOff();// взлетает
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  // если взлетная полоса занята самолетом
                    System.out.println(getName() + " ожидает");
                    waiting(); // ожидает
                }
            }
        }
    }

    public static class Runway { // взлетная полоса
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}
/*
Самолет #2 ожидает
Самолет #1 взлетает
Самолет #3 ожидает
Самолет #2 ожидает
Самолет #3 ожидает
Самолет #1 уже в небе
Самолет #3 взлетает
Самолет #2 ожидает
Самолет #2 ожидает
Самолет #3 уже в небе
Самолет #2 взлетает
Самолет #2 уже в небе

Process finished with exit code 0
 */