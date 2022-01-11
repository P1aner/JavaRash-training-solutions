package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3

        /*for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }*/

        cats.remove(cats.iterator().next());


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat("Cat1"));
        cats.add(new Cat("Cat2"));
        cats.add(new Cat("Cat3"));
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat {
        String name;

        Cat(String name) {
            this.name = name;
        }

    }
}




/*
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
 */
/*
com.javarush.task.task08.task0819.Solution$Cat@7c30a502
com.javarush.task.task08.task0819.Solution$Cat@2133c8f8

Process finished with exit code 0
 */






