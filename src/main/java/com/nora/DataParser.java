package com.nora;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataParser {
    public static void parseAndStore(String jsonData) {
        if (jsonData == null || jsonData.isEmpty()) {
            System.out.println("No data to parse.");
            return;
        }

        JSONArray stockItems = new JSONArray(jsonData);

        for (int i = 0; i < stockItems.length(); i++) {
            JSONObject item = stockItems.getJSONObject(i);
            String warehouse = item.getString("warehouse");
            String partNumber = item.getString("part_number");
            int quantity = item.getInt("quantity");

            DatabaseManager.insertStock(warehouse, partNumber, quantity);
        }

        System.out.println("Stock data successfully inserted into database.");
    }
}
