package com.nora;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataDownloader {
    public static String downloadSampleData(String filePath) {
        try {
            return Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            System.err.println("Failed to read file: " + e.getMessage());
            return "";
        }
    }
}
