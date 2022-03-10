package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

/**
 * Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
 * 1. Считать с консоли 2 имени файла.
 * 2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines.
 * В методе joinData:
 * 3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
 * 4. Если условие из п.3 не выполнено, то:
 * 4.1. очистить allLines от данных
 * 4.2. выбросить исключение CorruptedDataException
 * Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
 * Не забудь закрыть потоки.
 */

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String text = reader.readLine();
            String text2 = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(text))) {
                String line = new String();
                while ((line = fileReader.readLine()) != null) {
                    allLines.add(line);
                }
            }
            try (BufferedReader fileReader = new BufferedReader(new FileReader(text2))) {
                String line = new String();
                while ((line = fileReader.readLine()) != null) {
                    forRemoveLines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
/*
D:\1.txt
D:\2.txt

Process finished with exit code 0
 */