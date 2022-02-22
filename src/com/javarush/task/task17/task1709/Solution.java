package com.javarush.task.task17.task1709;

/*
Предложения
*/

/**
 * Не используя synchronized сделай так, чтобы количество сделанных и принятых предложений было одинаковым.
 */

public class Solution {
    public volatile static int proposal = 0;

    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Сделано предложение №" + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Принято предложение №" + proposal);
                    thisProposal = proposal;
                }

            }
        }
    }
}
/*
Сделано предложение №1
Принято предложение №1
Сделано предложение №2
Принято предложение №2
Сделано предложение №3
Принято предложение №3
Сделано предложение №4
Принято предложение №4
Сделано предложение №5
Принято предложение №5
Сделано предложение №6
Принято предложение №6
Сделано предложение №7
Принято предложение №7
Сделано предложение №8
Принято предложение №8
Сделано предложение №9
Принято предложение №9
Сделано предложение №10
Принято предложение №10

Process finished with exit code 0
 */