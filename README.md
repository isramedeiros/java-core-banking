# 📘 Project: Java Banking Core (POO)

### 🖋️ The "Why" Behind the Code
As I transition into software development, I'm focusing on building robust systems that reflect real-world business logic. This project is my foundation for banking systems in Java.

My goal here was to understand how a Domain Entity (the Account) should behave. In a financial context, data integrity is everything. This project allowed me to practice:

* **Strict Modeling:** Ensuring an account cannot exist without a holder and a number.
* **Controlled State:** Learning that a balance should never be "set" directly; it must be "changed" through validated methods like `deposit()`.

---

### 🚀 Key Technical Implementation
* **Constructor Overloading:** I implemented two ways to open an account. One for users who want to start with an initial deposit and another for those starting at zero.
* **Data Encapsulation:** By separating the application logic (the UI/Scanner) from the entities (the business rules), I'm practicing the **Separation of Concerns**, a vital skill for maintainable enterprise code.
* **Scanner & Locale Management:** Handled input streams and ensured US-standard decimal formatting to prevent parsing errors, showing attention to detail in user input.

---

### 📈 Learning Process
Working through this helped me visualize how objects live in memory (the Stack vs. the Heap) and how to pass object references between different parts of a program.

**What I'm tackling next:** I am currently working on implementing **Withdrawal Logic**, where I will tackle **Business Rules** like "Maximum Overdraft Limits" and "Fixed Transaction Fees."

---

### 🛠️ How to run
1.  **Clone the repository.**
2.  **Compile:** ```bash
    javac application/Program.java entities/Account.java
    ```
3.  **Run:** ```bash
    java application.Program
    ```
