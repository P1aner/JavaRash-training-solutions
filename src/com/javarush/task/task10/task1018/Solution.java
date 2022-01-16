package com.javarush.task.task10.task1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Поправочки нужны
*/

public class Solution {
    HashMap</*int*/Integer, String> map;
    static Integer index;
    static String name;

    public Solution() {
        this.map = new HashMap</*int*/Integer, String>();
        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry</*int*/Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
/*
Наша программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.
Нужно исправить программу так, чтобы она скомпилировалась.
 */
/*
1
asdf
3
asdfc
2
asdf
4
asdfc
5
asdf
6
asdfc
7
asdf
8
asdfc
9
asdf
0
asdfc
Id=null Name=null
Id=0 Name=asdfc
Id=1 Name=asdf
Id=2 Name=asdf
Id=3 Name=asdfc
Id=4 Name=asdfc
Id=5 Name=asdf
Id=6 Name=asdfc
Id=7 Name=asdf
Id=8 Name=asdfc
Id=9 Name=asdf

Process finished with exit code 0
 */
