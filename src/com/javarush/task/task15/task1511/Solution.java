package com.javarush.task.task15.task1511;

import java.io.Serializable;

/*
Максимально простой код-1
*/

/**
 * Упрости код: убери все наследования и реализации, которые автоматически добавятся при компиляции.
 * Взаимосвязь между объектами me и zapp — Has-a: http://ru.wikipedia.org/wiki/Has-a
 */
public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert("What do you think about this task?"));
        System.out.println(me.askZapp("When will the next update happen?"));
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("I'll be thinking of [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp(String question) {
            return zapp.answerQuestion(question);
        }

        String askHubert(String question) {
            return hubert.answerQuestion(question);
        }
    }
}
/*
I'll be thinking of [What do you think about this task?]
I'll be thinking of [When will the next update happen?]

Process finished with exit code 0
 */

