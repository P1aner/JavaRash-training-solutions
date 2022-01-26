package com.javarush.task.task14.task1406;

/*
Без ошибок
*/

import com.javarush.task.task14.task1406.Solution.Mouse;

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();//Add your code here

        Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse grayMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(grayMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
/*
Давай напишем программу, которая создает мышонка.
Для этого инициализируй объект obj таким классом, чтобы метод main() выполнился без ошибок.
 */
/*
Jerry
Jerry
Jerry
Jerry

Process finished with exit code 0
 */
