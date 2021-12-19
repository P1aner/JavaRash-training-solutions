package com.javarush.task.task06.task0609;

/*
Расстояние между двумя точками
*/

import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(0, 0, 3, 4)); //от себя
    }
}



/*
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
 */
/*
5.0

Process finished with exit code 0
 */