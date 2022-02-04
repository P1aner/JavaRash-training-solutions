package com.javarush.task.task13.task1302;

/*
Пиво-2. Возвращение
*/

import java.util.Random;

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

        @Override
        public boolean isAlcoholic() {
            Random rand = new Random();
            return rand.nextBoolean();
        }
    }
}
/*
Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.
 */
/*
Напиток безалкогольный

Process finished with exit code 0
 */
