package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes format) {
        if (format == null) {
            throw new IllegalArgumentException("Неизвесный тип картинки");
        }
        switch (format) {
            case BMP: {
                return new BmpReader();
            }
            case JPG: {
                return new JpgReader();
            }
            case PNG: {
                return new PngReader();
            }

            default: {
                throw new IllegalArgumentException("Неизвесный тип картинки");
            }
        }


    }
}

