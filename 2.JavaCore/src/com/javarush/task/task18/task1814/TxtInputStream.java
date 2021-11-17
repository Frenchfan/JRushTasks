package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(String.valueOf(fileName));
        int i = fileName.lastIndexOf('.');
        String extension = null;
        if (i > 0) {
            extension = fileName.substring(i + 1);
        }
        if (!"txt".equals(extension)) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

