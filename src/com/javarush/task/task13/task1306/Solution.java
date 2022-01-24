package com.javarush.task.task13.task1306;

/*
Баг в initializeIdAndName
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        @Override
        public DBObject initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }

}
/*
Посмотри на программу и исправь ее, чтобы она компилировалась и работала:
Вынеси реализацию метода initializeIdAndName в класс User.
Сделай так, чтобы initializeIdAndName в классе User возвращал тип User.
 */
/*
The user's name is Neo, id = 1
The user's name is Trinity, id = 2

Process finished with exit code 0
 */
