package com.javarush.task.task12.task1229;

/*
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Worker implements Businessman {

    }

    public static class Worker {
        public void workHard() {

        }
    }

}
/*
Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.
 */
/*
com.javarush.task.task12.task1229.Solution$CTO@2133c8f8

Process finished with exit code 0
 */
