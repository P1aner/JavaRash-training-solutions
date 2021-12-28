package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }

    }
}


/*
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.

 */
/*
com.javarush.task.task06.task0614.Cat@58ceff1
com.javarush.task.task06.task0614.Cat@7c30a502
com.javarush.task.task06.task0614.Cat@49e4cb85
com.javarush.task.task06.task0614.Cat@2133c8f8
com.javarush.task.task06.task0614.Cat@43a25848
com.javarush.task.task06.task0614.Cat@3ac3fd8b
com.javarush.task.task06.task0614.Cat@5594a1b5
com.javarush.task.task06.task0614.Cat@6a5fc7f7
com.javarush.task.task06.task0614.Cat@3b6eb2ec
com.javarush.task.task06.task0614.Cat@1e643faf

Process finished with exit code 0
 */