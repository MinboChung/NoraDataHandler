package com.nora;

import java.sql.*;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:sqlite:nora.db";

    public static void initDatabase() {
        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS warehouse_stock (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                warehouse TEXT NOT NULL,
                part_number TEXT NOT NULL,
                quantity INTEGER NOT NULL
            );
        """;

        try (Connection conn = DriverManager.getConnection(DB_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Database initialized.");
        } catch (SQLException e) {
            System.err.println("Failed to initialize database: " + e.getMessage());
        }
    }

    public static void insertStock(String warehouse, String partNumber, int quantity) {
        String insertSQL = "INSERT INTO warehouse_stock (warehouse, part_number, quantity) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
            pstmt.setString(1, warehouse);
            pstmt.setString(2, partNumber);
            pstmt.setInt(3, quantity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Insert failed: " + e.getMessage());
        }
    }
}
