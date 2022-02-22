package com.javarush.task.task15.task1502;

/*
ООП - Наследование животных
*/

/**
 * Давай создадим классы животных и определим их размер, унаследовав их от правильных классов.
 * Для этого:
 * Создай public static класс Goose (Гусь).
 * Создай public static класс Dragon (Дракон).
 * Унаследуй класс Goose от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
 * Унаследуй класс Dragon от BigAnimal или SmallAnimal, подумай, какой логически больше подходит.
 * В классах Goose и Dragon переопредели метод String getSize(), расширь видимость до максимальной.
 * В классе Goose метод getSize должен возвращать строку "Гусь маленький, " + [getSize родительского класса].
 * В классе Dragon метод getSize должен возвращать строку "Дракон большой, " + [getSize родительского класса].
 */

public class Solution {
    //добавьте классы Goose и Dragon тут
    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "Goose is small," + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Dragon is big," + super.getSize();
        }
    }


    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
/*

Process finished with exit code 0
 */
