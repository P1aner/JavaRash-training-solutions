package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String key;
        while (true) {
            key = reader.readLine();
            if (key.equals("thriller") || key.equals("soapOpera") || key.equals("cartoon")) {
                Movie movie = MovieFactory.getMovie(key);
                System.out.println(movie.getClass().getSimpleName());
            } else {
                break;
            }
        }

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }


    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
/**
 * У нас есть кинофабрика, но она работает не в полную силу.
 * Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
 * Вот что тебе нужно сделать для успешного решения:
 * Разобраться, что программа умеет делать.
 * Все классы должны быть внутри класса Solution.
 * Добавить классы Cartoon, Thriller.
 * Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
 * Аналогично получению объекта SoapOpera сделать:
 * добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
 * добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
 * Считать с консоли несколько ключей (строк).
 * Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
 * <p>
 * Создать переменную movie типа Movie и для каждой введенной строки (ключа):
 * получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
 * вывести на экран movie.getClass().getSimpleName().
 */
/*
soapOpera
SoapOpera
cartoon
Cartoon
thriller
Thriller
nani

Process finished with exit code 0
 */
