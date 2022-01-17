package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        for (String word: list){
            if (!result.containsKey(word)){
             result.put(word, 1);
            } else {
                result.put(word, result.get(word)+1);
            }
        }


        return result;
    }

}

/*
Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.

Выведи содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
 */
/*
Слово
слово
Слава
слава
Слово
слово
Слава
слава
Слово
слово
Слава
слава
Слово
слово
Слава
слава
Слово
слово
Слава
слава
слава 5
Слово 5
слово 5
Слава 5

Process finished with exit code 0
 */









