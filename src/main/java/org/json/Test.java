package org.json;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        String filename = "./org/json/books.xml";
        final File file = new File(filename);
        JSONPointer jsonPointer = new JSONPointer("/catalog/book/1");
        try {
            final FileReader fileReader = new FileReader(file);
            final BufferedReader bufferedReader = new BufferedReader(fileReader);
//            XML.toJSONObject(bufferedReader, jsonPointer);
            JSONObject sub = new JSONObject().put("key", "value");
            JSONObject js = XML.toJSONObject(bufferedReader, jsonPointer, sub);
            System.out.println(js.toString(4));
        } catch (FileNotFoundException err) {
            System.out.format("%s.xml not found!", filename);
        }
    }
}
