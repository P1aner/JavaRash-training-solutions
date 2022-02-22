package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.ImageReader;
import com.javarush.task.task16.task1631.common.ImageTypes;

/*
Factory method pattern
*/

/**
 * 1. Внимательно посмотри, какие классы у тебя есть.
 * 2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые реализуют интерфейс ImageReader.
 * 3. В отдельном файле в основном пакете создай класс ImageReaderFactory с одним методом.
 * 3.1. Подумай, как он должен называться.
 * 3.2. Подумай, какие модификаторы должны быть у этого метода.
 * 4. Этот метод должен:
 * 4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG - JpgReader;
 * 4.2. Если передан неправильный параметр (в т.ч. null), то выбрасывать исключение IllegalArgumentException("Неизвестный тип картинки").
 */

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
/*

Process finished with exit code
 */
