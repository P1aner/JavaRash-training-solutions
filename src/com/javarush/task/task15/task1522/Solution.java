package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

/**
 * Для решения этой задачи тебе нужно:
 * Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
 * По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
 * Реализовать интерфейс Planet в классах Sun, Moon, Earth.
 * В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
 * Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
 * для этого считай с консоли один параметр типа String.
 * если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
 */

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String ball = reader.readLine();
            switch (ball) {
                case Planet.EARTH: {
                    thePlanet = Earth.getInstance();
                    break;
                }
                case Planet.MOON: {
                    thePlanet = Moon.getInstance();
                    break;
                }
                case Planet.SUN: {
                    thePlanet = Sun.getInstance();
                    break;
                }
                default: {
                    thePlanet = null;
                    break;
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
sun

Process finished with exit code 0
 */