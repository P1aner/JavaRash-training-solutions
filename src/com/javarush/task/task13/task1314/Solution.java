package com.javarush.task.task13.task1314;

import java.awt.*;

/*
Большая лисица — это такая лисица
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());

    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox{
        public Color getColor() {
            return Color.GRAY;
        }
    }

}
/*
Исправь класс BigFox так, чтобы программа компилировалась.
 */
/*
Fox
java.awt.Color[r=128,g=128,b=128]

Process finished with exit code 0
 */
