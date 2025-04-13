# 🔜 Next Steps

## ✅ Project Roadmap

1. **🧾 Read from SQLite** ✅ DONE
   - Create a method that queries and prints all records from the `warehouse_stock` table.
   - Useful for verifying inserts and debugging.

2. 🧾 Trigger Github Action when commit ✅ DONE
   - Implemented maven.yml in .github/workflows directory.
   - Whenever git push is triggered, the github action runner will test the code automatically

3.   Understand maven, ubuntu and pom.yml

4. **⚖️ Implement `StockBalancer`**
   - Simulate logic to rebalance stock between warehouses.
   - For example, if warehouse A > 80 and warehouse B < 20, move stock.

5. **⏱ Add Scheduling Logic**
   - Use Java’s `ScheduledExecutorService` to run the download → parse → store pipeline on a schedule (e.g. every minute).

6. **🧪 Add Unit Tests (JUnit)**
   - Validate database inserts, JSON parsing, and balancing logic.
   - Helps ensure robustness as logic gets more complex.

7. **📘 Notion Proposal for Internship**
   - Document project objectives, key components, screenshots, and outcomes.
   - Include links to GitHub repo and relevant demo videos or diagrams.

8. **📘 Smart methods for data storing**
   - Smart may mean coming up with new idea, but based on my learnings, smart means also to supply the real demand.
   - Real demand requires empirical and subjective evidences. 
