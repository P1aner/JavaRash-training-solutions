package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        boolean isSorted = false;
        String buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (isGreaterThan(array[i], array[i + 1])) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

/*
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки.
 */


/*
sdjkfld
ksdjhvsdjk
dkjb
lsdfvc
ldshfkasd
sdkfhkdvk
kdhf
dkhgfsdv
zkjxcvkjxcv,
kjsdhvcx,nv
dhfjkvdcv
kcv kxcjh
ldkhfkajsdvkc
asdkhv kjcx
xchkjvxkc
aksjdvnkcx
kvcxjhvk x
vkjcxv
alskdfvckj
lkc kjcvxh

asdkhv kjcx
aksjdvnkcx
alskdfvckj
dkjb
dkhgfsdv
dhfjkvdcv
ksdjhvsdjk
kdhf
kjsdhvcx,nv
kcv kxcjh
kvcxjhvk x
lsdfvc
ldshfkasd
ldkhfkajsdvkc
lkc kjcvxh
sdjkfld
sdkfhkdvk
vkjcxv
xchkjvxkc
zkjxcvkjxcv,

Process finished with exit code 0
 */













