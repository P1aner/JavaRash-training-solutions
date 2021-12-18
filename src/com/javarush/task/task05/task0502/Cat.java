package com.javarush.task.task05.task0502;

/*
Реализовать метод fight
*/

public class Cat {
    private int age;
    private int weight;
    private int strength;

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int count = 0;
        if (this.age > age) {
            count++;
        } else {
            count--;
        }
        if (this.weight > weight) {
            count++;
        } else {
            count--;
        }
        if (this.strength > strength) {
            count++;
        } else {
            count--;
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Cat vaas = new Cat(12, 1, 4);
        Cat saav = new Cat(11, 2, 5);
        System.out.println(vaas.fight(saav));

    }
}
/*
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.

 */


/*
false

Process finished with exit code 0
 */