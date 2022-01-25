package com.javarush.task.task13.task1328;

/*
Битва роботов
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotSecond.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
/*
Для начала разберись в том, что делает код: это будет непросто.
Затем измени код согласно новой архитектуре и добавь новую логику:
Сделай класс AbstractRobot абстрактным, вынеси логику атаки и защиты из Robot в AbstractRobot.
Отредактируй класс Robot, учитывая AbstractRobot.
Расширь класс BodyPart новой частью тела BodyPart.CHEST("грудь").
Добавь новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
 */
/*
Амиго атаковал робота Сгибальщик-02, атакована рука, защищена нога
Амиго атаковал робота Сгибальщик-02, атакована голова, защищена грудь
Сгибальщик-02 атаковал робота Амиго, атакована рука, защищена грудь
Амиго атаковал робота Сгибальщик-02, атакована рука, защищена рука
Сгибальщик-02 атаковал робота Амиго, атакована грудь, защищена рука
Амиго атаковал робота Сгибальщик-02, атакована грудь, защищена нога
Сгибальщик-02 атаковал робота Амиго, атакована нога, защищена нога
Амиго атаковал робота Сгибальщик-02, атакована нога, защищена грудь

Process finished with exit code 0
 */
