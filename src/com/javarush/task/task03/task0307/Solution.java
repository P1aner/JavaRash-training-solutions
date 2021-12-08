package com.javarush.task.task03.task0307;

/*
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "rash1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "rash2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "rash3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "rash4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "rash5";

        Protoss protoss1 = new Protoss();
        protoss1.name = "rash6";
        Protoss protoss2 = new Protoss();
        protoss2.name = "rash7";
        Protoss protoss3 = new Protoss();
        protoss3.name = "rash8";

        Terran terran1 = new Terran();
        terran1.name = "rash9";
        Terran terran2 = new Terran();
        terran2.name = "rash10";
        Terran terran3 = new Terran();
        terran3.name = "rash11";
        Terran terran4 = new Terran();
        terran4.name = "rash12";


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

/*Создать 5 зергов, 3 протосса и 4 террана.
Дать им всем уникальные имена.
*/