package com.nora;

public class Main {
    public static void main(String[] args) {
        DatabaseManager.initDatabase();

        String jsonData = DataDownloader.downloadSampleData("resources/sample_data/stock_data_01.json");

        DataParser.parseAndStore(jsonData);

        // ✅ Print the inserted stock
        DatabaseManager.printAllStock();
    }
}
