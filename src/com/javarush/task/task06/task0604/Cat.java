package com.javarush.task.task06.task0604;

/*
Ставим котов на счётчик
*/

public class Cat {
    public static int catCount = 0;

    //напишите тут ваш код
    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 600000; i++) {  //эт от себя
            Cat cat = new Cat();            //эт от себя
        }                                   //эт от себя
        System.out.println(catCount);       //эт от себя
    }

    protected void finalize() throws Throwable {
        catCount--;
    }
}



/*
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
 */

/*538439

Process finished with exit code 0

 */