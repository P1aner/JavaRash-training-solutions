package com.javarush.task.task14.task1405;

/*
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.onSelect();
        food.onEat();
    }

    public static void callSelectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        @Override
        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
/*
Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
Для этого нужно:
Реализовать интерфейс Selectable в классе Food.
Метод onSelect() должен выводить на экран фразу "The food was selected".
Подумай, какие методы можно вызвать для переменной food, а какие для — selectable.
В методе callFoodMethods вызови методы onSelect, onEat, если это возможно.
В методе callSelectableMethods вызови методы onSelect, onEat, если это возможно.
Не используй явное приведение типов.
 */
/*
The food was selected
The food was eaten
The food was selected

Process finished with exit code 0
 */
