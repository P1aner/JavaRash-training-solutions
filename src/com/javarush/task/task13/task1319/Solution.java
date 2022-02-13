package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        List<String> array = new ArrayList<>();
        String name = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = reader.readLine();
            boolean condition = true;
            while (condition) {
                array.add(reader.readLine() + "\n");
                if (array.get(array.size() - 1).equals("exit" + "\n")) {
                    condition = false;
                }
            }
            reader.close();
            File file = new File(name);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (String text : array) {
                fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
 */
/*
C:\Users\Павел\Desktop\1.txt
asdfasd
asdfasdf
hgh
вава
1212
exit

Process finished with exit code 0
 */
