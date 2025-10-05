# Personal Expense Tracker - Documentation

## Objective
To build a simple web-based expense tracking application that allows users to **add, view, update, and delete expenses**.  
This project is developed as part of the **Evaao Internship Assignment**.

---

## System Design

- **Frontend:** Thymeleaf templates + Bootstrap for responsive UI  
- **Backend:** Spring Boot (Java 17)  
- **Database:** MySQL (using Spring Data JPA)  
- **Architecture:** MVC (Model-View-Controller)  

---

## Implemented Module

### 1️⃣ Expense Module
- **Add Expense:** Users can add an expense with amount, date, and note.  
- **View Expenses:** Users can view all recorded expenses in a table.  
- **Update Expense:** Users can modify an existing expense.  
- **Delete Expense:** Users can remove an expense from the system.  
- **Database:** Each expense is stored in the MySQL database table `expense`.

---

## Database Design

**Table: expense**
| Field  | Type   | Description       |
|--------|--------|-----------------|
| id     | Long   | Primary Key      |
| amount | Double | Expense amount   |
| date   | Date   | Expense date     |
| note   | String | Description/note|

---

## Assumptions
- Single-user application; no login or authentication required.  
- Each expense has only amount, date, and note (no categories implemented yet).  
- Application runs locally on `localhost:8080`.  

---

## Sample Input / Output

**Add Expense Example:**
| Amount | Date       | Note      |
|--------|------------|----------|
| 500    | 2025-10-05 | Lunch     |
| 1000   | 2025-10-04 | Bus Pass  |

**Expense Table View:**
| ID | Amount | Date       | Note     |
|----|--------|------------|----------|
| 1  | 500    | 2025-10-05 | Lunch    |
| 2  | 1000   | 2025-10-04 | Bus Pass |

---

## Future Enhancements
- Add **Categories** (Food, Travel, Bills, etc.)  
- Implement **Summary Reports** (total spent, grouped by category/month)  
- Add **Filters** by date or category  
- Include **Charts** for better visualization of expenses  

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/Evaao-Expense-Tracker.git
   cd Evaao-Expense-Tracker
