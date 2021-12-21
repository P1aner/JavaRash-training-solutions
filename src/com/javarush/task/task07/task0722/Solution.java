package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean condition = true;
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        while (condition == true) {
            String s = reader.readLine();
            if (!("end".equalsIgnoreCase(s))) {
                strings.add(s);
            } else {
                condition = false;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}


/*
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
 */



/*
qwe
qwe
asd
end
qwe
qwe
asd

Process finished with exit code 0
 */