package com.javarush.task.task07.task0707;

import java.util.ArrayList;


/*
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

/*
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
 */
/*
1
2
3
4
5

Process finished with exit code 0

 */


