# 🔜 Next Steps

## ✅ Project Roadmap

1. **🧾 Read from SQLite** ✅ DONE
   - Create a method that queries and prints all records from the `warehouse_stock` table.
   - Useful for verifying inserts and debugging.

2. **⚖️ Implement `StockBalancer`**
   - Simulate logic to rebalance stock between warehouses.
   - For example, if warehouse A > 80 and warehouse B < 20, move stock.

3. **⏱ Add Scheduling Logic**
   - Use Java’s `ScheduledExecutorService` to run the download → parse → store pipeline on a schedule (e.g. every minute).

4. **🧪 Add Unit Tests (JUnit)**
   - Validate database inserts, JSON parsing, and balancing logic.
   - Helps ensure robustness as logic gets more complex.

5. **📘 Notion Proposal for Internship**
   - Document project objectives, key components, screenshots, and outcomes.
   - Include links to GitHub repo and relevant demo videos or diagrams.
