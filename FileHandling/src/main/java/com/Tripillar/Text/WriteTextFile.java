package com.Tripillar.Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "/Users/aniketkumar/Desktop/FilesIntern/Read.txt"; // Change this to your text file path
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is aniket  file handling example.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}