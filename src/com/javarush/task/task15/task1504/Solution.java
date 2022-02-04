package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

/**
 * Давай напишем программу, которая будет определять жанр книги, или автора, который ее написал.
 * Для этого:
 * Создай public static класс MarkTwainBook, который наследуется от Book. Имя автора — [Mark Twain].
 * Параметр конструктора — название книги (title).
 * В классе MarkTwainBook реализуй все абстрактные методы.
 * Для метода getBook измени тип возвращаемого значения на более подходящий.
 * Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
 * В классе Book реализуй тело метода getOutputByBookType() так, чтобы он возвращал:
 * agathaChristieOutput — для книг Агаты Кристи;
 * markTwainOutput — для книг Марка Твена.
 */

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book {
        private static final String MARK_TWAIN = "Марк Твен";
        private String name;

        public MarkTwainBook(String name) {
            super(MARK_TWAIN);

            this.name = name;
        }

        @Override
        public Book getBook() {
            return this;

        }

        @Override
        public String getTitle() {
            return name;
        }
    }

    public static class AgathaChristieBook extends Book {
        private static final String AGATHA_CRISTIE = "Агата Кристи";
        private String name;

        public AgathaChristieBook(String name) {
            super(AGATHA_CRISTIE);

            this.name = name;
        }

        @Override
        public Book getBook() {
            return this;

        }

        @Override
        public String getTitle() {
            return name;
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            //Add your code here
            if (this instanceof MarkTwainBook) {
                output = markTwainOutput;
            }
            if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
/*
[Tom Sawyer was written by Марк Твен, Агата Кристи: Hercule Poirot is a detective]

Process finished with exit code 0
 */










